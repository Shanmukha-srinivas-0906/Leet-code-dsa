-- with cte as(
--     select *,dense_rank() over (order by score desc) rnk from Scores
-- )
select score,dense_rank() over (order by score desc) rank from Scores
