# incubator-task1

### What is it?

Приложение получает на вход текст из командной строки (если не передать ни одного параметра, то приложение будет ожидать текст из стандартного потока ввода) и выдают статистику по введенным данным: кол-во слов в тексте, TOP10 самых часто упоминаемых слов, упорядоченных по:
а) количеству упоминаний в обратном порядке
б) по алфавиту

Примеры запуска приложения:

![image](https://user-images.githubusercontent.com/47719089/59107208-50fbf280-8962-11e9-99b2-1a18fbe83bbf.png)

![image](https://user-images.githubusercontent.com/47719089/59107866-be5c5300-8963-11e9-9761-3fdb3a4d8c5a.png)

### How to run?

Чтобы запустить приложение, загрузите его git-репозиторий и разархивируйте все файлы на свой компьютер. 
Приложение написано на языке Котлин, поэтому для компиляции программы понадобится компилятор непосредственно для этого языка, его можно скачать по адресу https://github.com/JetBrains/kotlin/releases/tag/v1.2.0. Помимо этого на Вашем компьютере должен быть установлен JDK.
Распаковав скачанный архив компилятора, добавьте путь к папке bin в переменную среды PATH.
Теперь, запустив консольное приложение из папки src, передайте компилятору файл main.kt: 

![image](https://user-images.githubusercontent.com/47719089/59108688-bac9cb80-8965-11e9-8b21-258184c5ee6d.png)

Запустите созданный файл main.jar на выполнение:

![image](https://user-images.githubusercontent.com/47719089/59108809-f9f81c80-8965-11e9-803f-5c88c871bf0c.png)

Можно ввести текст в этой же строке через пробел, или после, в стандартном потоке ввода.

