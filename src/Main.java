public class Main {
    // private static Object bookName;

    public static void main(String[] args) {

        Author djerom = new Author("Джером К.", "Джером");

        Author  tolkin = new Author("Джона Р. Р.", "Толкина");

        Book troe = new Book("Трое в лодке не считая собаки", djerom, 1980);

        Book hobbit = new Book("Хоббит, или Туда и обратно", tolkin, 2011);



        System.out.println(troe.getBookName() + " " + djerom.getFullName() + " " + troe.getYearPublication());

        troe.setYearPublication(1991);

        System.out.println(troe.getBookName() + " " + djerom.getFullName() + " " + troe.getYearPublication());


    }
}