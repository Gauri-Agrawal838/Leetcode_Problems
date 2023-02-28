/* Write your PL/SQL query statement below */
update salary set sex =
case
when(sex like 'm') then 'f' else 'm'
end;
