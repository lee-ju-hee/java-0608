import java.util.*;
class Account{
    
    private int balance;

    Account()
    {
        balance = 0;
    }
    void deposit(int money)
    {
        balance+=money;
    }
    void withdraw(int money)
    {
        balance-=money;
    }

    int getBalance()
    {
        return balance;
    }
}
public class ljh060803_1{
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);

        Account a1 = new Account();

        System.out.print("�Աݾ��� �Է��ϼ���: ");
        int amt1 = input.nextInt();
        a1.deposit(amt1);
        System.out.printf("�� ���� �ܰ�: %d��\n", a1.getBalance());

        System.out.print("��ݾ��� �Է��ϼ���: ");
        int amt2 = input.nextInt();
        a1.withdraw(amt2);
        System.out.printf("�� ���� �ܰ�: %d��\n", a1.getBalance());

        System.out.print("�Աݾ��� �Է��ϼ���: ");
        int amt3 = input.nextInt();
        a1.deposit(amt3);
        System.out.printf("�� ���� �ܰ�: %d��\n", a1.getBalance());
    }
}