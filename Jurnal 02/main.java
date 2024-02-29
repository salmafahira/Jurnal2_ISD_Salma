public class main {
    public static void main(String[] args) {
        GenArrayList<ATK> ATKlist = new GenArrayList<>(5);
        GenArrayList<Bag> Baglist = new GenArrayList<>(5);
        ATKlist.addData(new ATK("A001", "Pulpen", "Joyko", 5));
        ATKlist.addData(new ATK("A002", "Pensil", "Joyko", 5));
        ATKlist.addData(new ATK("A003", "Spidol", "lightering", 15));
        ATKlist.addData(new ATK("A001", "Typex", "Joyko", 2));
        ATKlist.addData(new ATK("A001", "Buku", "Binder", 7));

        Baglist.addData(new Bag("B001", "Totte Bag", "Khuvi", 10));
        Baglist.addData(new Bag("B002", "Ransel Bag", "Rash", 5));
        Baglist.addData(new Bag("B003", "Sling Bag", "Miniso", 15));
        Baglist.addData(new Bag("B001", "Bucket Bag", "Victoria Secret", 20));
        Baglist.addData(new Bag("B001", "Shoulder Bag", "Eiger", 25));

        ATKlist.display();
        Baglist.display();
    }
}