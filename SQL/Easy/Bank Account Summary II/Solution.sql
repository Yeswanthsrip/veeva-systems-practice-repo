select name,sum(amount) as balance
    from users join transactions on users.account=transactions.account
    group by transactions.account
    having balance>10000;