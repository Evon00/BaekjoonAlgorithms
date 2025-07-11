-- 코드를 입력하세요
SELECT CATEGORY, SUM(SALES) AS TOTAL_SALES
FROM BOOK b
INNER JOIN BOOK_SALES bs ON b.BOOK_ID = bs.BOOK_ID
WHERE TO_CHAR(bs.SALES_DATE,'YYYY-MM') = '2022-01'
GROUP BY CATEGORY
ORDER BY CATEGORY;