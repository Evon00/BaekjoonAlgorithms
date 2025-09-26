-- 코드를 입력하세요
-- 맛 기준 left join해서 값 더한것을 기준으로 내림차순, rownum으로 3개

SELECT FLAVOR
FROM (
    SELECT
        f.FLAVOR,
        SUM(f.TOTAL_ORDER) + SUM(j.TOTAL_ORDER) AS TOTAL_ORDER_SUM
        FROM FIRST_HALF f
        LEFT JOIN JULY j
            ON f.FLAVOR = j.FLAVOR
        GROUP BY f.FLAVOR
        ORDER BY TOTAL_ORDER_SUM DESC
)
WHERE ROWNUM <= 3;