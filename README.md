1.
Давайте создадим класс Programmer. Он будет состоять из следующих полей { Person person, String[] listOfTechnologies }
Класс Person содержит всего два поля { String firstName, String lastName }. Необходимо реализовать конструкторы таким образом, что бы Programmer можно было создать:

используя объект person и массив технологий: new Programmer(person, new String[]{"Java","Spring Boot","SQL"})
используя объект person и строке со списком технологий через запятую: new Programmer(person, "Java,Spring Boot,SQL")
используя строку firstName, строку lastName и массив технологий: new Programmer("Jack" "Johnson", new String[]{"Java","Spring Boot","SQL"})
используя строку ФИО (firstName и lastName разделены пробелом) массив технологий: new Programmer("Jack Johnson", new String[]{"Java","Spring Boot","SQL"})
Необходимо создать массив Programmer и вывести его на экран.

2. (опционально, для тех, кто сделал задачу 1, чуть сложнее)
Реализовать метод который в массиве программистов находить программистов со знанием заданной технологии (например, всех кто знает Java) и выводит на экран.

3. (и еше чуть сложнее)
Метод, реализованный в п.2 должен не выводить на экран, а формировать новый массив Programmer[] содержащий всех программистов с заданной технологией.
