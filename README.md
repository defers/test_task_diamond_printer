### Тестовое задание на вакансию java разработчик

Написать программу на языке Джава 8/11 или С# принимающую с консоли два параметра ширину
и высоту ромба и затем печатающую ромб в текстовом режиме символами #.
Размеры ромба могут быть любыми, наример
5x5  
\#  
\# #  
\# #  
\# #  
\#  

6x3  
\#  
\##  
\# #  
\# #  
\##  
\#  
Это значит что программа не обязательно печатает идеальный ромб,
идеальным он будет только в случае одинаковых нечетных высоты и
ширины.
Входные параметры
Высота: от 1 до 80
Ширина: от 1 до 80

public class Main {

public static void main(String[] args)
{
// Ваш код получающий параметры с консоли
---
Main.printDiamond(height, width);
}
private static void printDiamond(int height, int width)
{
---
Код печатающий ромб
}
}
Дополнительные условия, требуется выполнить построение за один цикл, с
минимумом переменных