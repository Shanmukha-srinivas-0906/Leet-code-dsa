(SELECT u.name as results
FROM MovieRating m
JOIN Users u ON u.user_id = m.user_id
GROUP BY u.user_id, u.name
ORDER BY COUNT(m.movie_id) DESC, u.name ASC Limit 1)
union all
(Select mo.title as results from MovieRating m join Movies mo on mo.movie_id = m.movie_id  where month(created_at)=2 and year(created_at)=2020
group by mo.title order by avg(rating) desc,mo.title asc limit 1)
