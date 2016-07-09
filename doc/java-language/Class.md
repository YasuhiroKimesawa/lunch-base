```Java
/*
パッケージ　src/main/java/example/model/customerフォルダ
*/
package example.model.customer;
/*
 クラスの定義です。
 public・・・他のクラスから参照が可能(private・・・他のクラスから参照不可/なし・・・他のパッケージから参照可能)
 
 クラスはコンストラクタ(生成)、メンバ変数（情報)、メソッド(振る舞い)で構成される
*/
public class Customer
{
    // メンバ変数です。
    // 名前
    private Name name;
    
    // 電話番号
    private Phone phone;
    
    // コンストラクタ
    // このクラスのインスタンスを作る起点になります。
    public Customer( Name name, Phone phone )
    {
        this.name = name;
        this.phone = phone;
    }
    
    // メソッドです。
    public fullName()
    {
        return this.name.fullName();
    }
}

package example.model.customer;
class Name
{
    // final・・・一度代入すると変更できなくなります。
    private final String familyName;
    private final String firstName;
    
    Name( Stirng familyName, String firstName )
    {
        this.familyName = familyName;
        this.firstName = firstName;
    }
    
    // this・・・現在のインスタンス
    String fullName()
    {
        return String.format( "%s %s", this.familyName, this.firstName )
    }
}

package example.model.customer;
class Phone
{
    private final String value;
    
    Name( Stirng value )
    {
        this.familyName = familyName;
        this.firstName = firstName;
    }
}

/*
 static mainメソッドがアプリケーション起動時に最初に実行されます。
 static・・・クラスをインスタンス化しなくても使える（静的）という意味です。起動時にApplication.main( String[] args )が実行されます。
*/
package example.model;
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
        System.out.println( yosuke.fullName() ); // 柏木 陽介
         
        Name name2 = new Name( "田中", "達也" );
        Phone phone2 = new Phone( "090-2222-3333" );
        
        Customer tatsuya = new Customer( name2, phone2 );
        System.out.println( tatsuya.fullName() ); // 田中 達也
    }
}
```