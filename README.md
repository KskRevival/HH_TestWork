# HH_TestWork
Условие:<br>
На входе функция получает параметр n - натуральное число. Необходимо сгенерировать n-массивов, заполнить их случайными числами, каждый массив имеет случайный размер. Размеры массивов не должны совпадать. Далее необходимо отсортировать массивы. Массивы с четным порядковым номером отсортировать по возрастанию, с нечетным порядковым номером - по убыванию. На выходе функция должна вернуть массив с отсортированными массивами.
--------------------------------------------------------------------------------
Решил сделать **метод**, который возвращает **список** массивов, а не массив массивов, тк для второго требуется создать двумерный массив, но тогда не получится сделать все массивы случайного размера, ведь будет задана изначальная максимальная длина, а по условию их размеры не должны совпадать.
