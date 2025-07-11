-- 코드를 입력하세요
SELECT b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS, TO_CHAR(r.CREATED_DATE,'YYYY-MM-DD') as CREATED_DATE
FROM USED_GOODS_BOARD b 
INNER JOIN USED_GOODS_REPLY r ON b.BOARD_ID = r.BOARD_ID
WHERE TO_CHAR(b.CREATED_DATE,'YYYY-MM') = '2022-10'
ORDER BY r.CREATED_DATE, b.TITLE;