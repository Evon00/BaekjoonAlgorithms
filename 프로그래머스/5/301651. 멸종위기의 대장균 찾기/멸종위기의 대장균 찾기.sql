-- 코드를 작성해주세요
WITH RECURSIVE GenerationTree AS (

    SELECT ID, 1 AS GENERATION
    FROM ECOLI_DATA
    WHERE PARENT_ID IS NULL
    
    UNION ALL
    
    SELECT e.ID, g.GENERATION + 1
    FROM ECOLI_DATA e
    JOIN GenerationTree g ON e.PARENT_ID = g.ID
),

LeafNodes AS (

    SELECT g.GENERATION
    FROM GenerationTree g
    LEFT JOIN ECOLI_DATA e ON g.ID = e.PARENT_ID
    WHERE e.PARENT_ID IS NULL
)

SELECT COUNT(*) AS COUNT, GENERATION
FROM LeafNodes
GROUP BY GENERATION
ORDER BY GENERATION;