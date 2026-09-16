select tweet_id
FROM tweets
where char_length(content)>15;