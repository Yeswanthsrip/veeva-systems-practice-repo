select case
            when employees.id not in (
                select id from employeeUNI
            ) then NULL
            else unique_id
        end
             as unique_id,
    name
from employees join employeeUNI on employees.id=employeeUNI.id;