package example.model.User;

/**
 * Created by mac48 on 2016/08/10.
 */
public class EmployeeNumber {
    //値の型の定義 stringの文字型 value:変数名　Employnumberの値
    private String value;
    //thisのvalueが8行目のvalue
    // (String value)はEmployNumberの引数.value;と同じ。コンストラクトは以下。入力してサーバー側に渡ったときにオブジェクトを生成。
    public EmployeeNumber(String value) {
        this.value = value;
    }
}
