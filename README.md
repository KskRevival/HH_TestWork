# HH_TestWork
Условие:<br>
На входе функция получает параметр n - натуральное число. Необходимо сгенерировать n-массивов, заполнить их случайными числами, каждый массив имеет случайный размер. Размеры массивов не должны совпадать. Далее необходимо отсортировать массивы. Массивы с четным порядковым номером отсортировать по возрастанию, с нечетным порядковым номером - по убыванию. На выходе функция должна вернуть массив с отсортированными массивами.
--------------------------------------------------------------------------------
Сначала сделал с возвращением **списка** массивов, но перечитав задание понял, что нужен был массив массивов, стало жалко удалять эту программу, поэтому я раскидал их по классам **TestWorkWithList** и **TestWorkWithArrays** соответственно, а общие методы вынес в главный класс **TestWork**, также решил обойтись без наследования.
