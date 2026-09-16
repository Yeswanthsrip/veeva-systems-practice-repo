select s.student_id,
    s.student_name,
    subjects.subject_name,
    count(e.subject_name) as attended_exams
    from students s cross join subjects
        left join examinations e on s.student_id=e.student_id
            and subjects.subject_name=e.subject_name
    group by s.student_id,s.student_name,subjects.subject_name
    order by s.student_id,subjects.subject_name;