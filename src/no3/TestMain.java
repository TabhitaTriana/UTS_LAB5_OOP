package no3;

public class TestMain {
    //Method main untuk tes class Account
    public static void main(String[] args){

        //Test constructur and toSting()
        Account a1 = new Account("A101","Ligma",88);
        System.out.println(a1);
        Account a2 = new Account("A102","Deezma");
        System.out.println(a2);

        System.out.println("ID:"+a1.getID());
        System.out.println("Name:"+a1.getName());
        System.out.println("Balance:"+a1.getBalance());
                                    a1.credit(100); //memanggil method credit() pada akun a1 untuk menambahkan saldo sebesar 100
        System.out.println((a1)); a1.debit(50); //memanggil method debit() pada akun a1 untuk mengurangi saldo sebesar 50.
        System.out.println(a1);
        a1.debit(500); //Memanggil method debit() pada akun a1 untuk mengurangi saldo sebesar 500 (lebih dari saldo yang tersedia).
        System.out.println(a1);

                    a1.transferTo(a2,100); //memangggil method transferTo() untuk mentransfer 100 dari akun a1 ke a2
        System.out.println(a1);
        System.out.println(a2);
    }
}
