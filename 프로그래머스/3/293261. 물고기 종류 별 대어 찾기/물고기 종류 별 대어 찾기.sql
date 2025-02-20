-- 코드를 작성해주세요
SELECT fi.ID, fni.FISH_NAME, fi.LENGTH
FROM FISH_INFO fi
JOIN FISH_NAME_INFO fni ON fi.FISH_TYPE = fni.FISH_TYPE
WHERE fi.LENGTH = (
    SELECT MAX(LENGTH)
    FROM FISH_INFO
    WHERE FISH_TYPE = fi.FISH_TYPE
    AND LENGTH > 10
)
ORDER BY fi.ID;