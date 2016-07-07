```Java
/*
 クラスの定義です。
 public・・・他のクラスから参照が可能という意味
 class・・・クラスであるという意味
*/
public class Customer
{
    // 名前クラス
    private Name name;
    
    // 電話番号クラス
    private Phone phone;
    
    // コンストラクタ
    // このクラスのインスタンスを作る起点になります。
    public Customer( Name name, Phone phone )
    {
        this.name = name;
        this.phone = phone;
    }
    
    public fullName()
    {
        return this.name.fullName();
    }
}

/*
 クラスの定義です。
 publicもprivateがない場合（デフォルト)は、同じパッケージ内でのみ参照可能です。
 
*/
class Name
{
    private String familyName;
    private String firstName;
    
    Name( Stirng familyName, String firstName )
    {
        this.familyName = familyName;
        this.firstName = firstName;
    }
    
    String fullName()
    {
        return String.format( "%s %s", this.familyName, this.firstName )
    }
}

class Phone
{
    private String value;
    
    Name( Stirng value )
    {
        this.familyName = familyName;
        this.firstName = firstName;
    }
}

/*
 static mainメソッドがあるクラスがアプリケーション起動時に最初に実行されます。
 static・・・クラスをインスタンス化しなくても使える（静的）という意味です。
*/
public class Application
{
    // アプリケーション起動時に最初に実行されます。
    // args配列はアプリケーション実行時に渡される引数です。 
    public static void main( String[] args )
    {
        // new クラス名()で該当クラスのコンストラクタが呼ばれます。→インスタンス化といいます。
        Name name = new Name( "柏木", "陽介" );
        Phone phone = new Phone( "090-1111-2222");
        
        Customer yosuke = new Customer( name, phone );
        System.out.println(yosuke.fullName()); // 柏木 陽介
         
        Name name2 = new Name( "田中", "達也" );
        Phone phone2 = new Phone( "090-2222-3333" );
        
        Customer tatsuya = new Customer( name2, phone2 );
        System.out.println(tatsuya.fullName()); // 田中 達也
    }
}
```