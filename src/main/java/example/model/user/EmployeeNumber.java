package example.model.User;

/**
 * Created by mac48 on 2016/08/10.
 */
public class EmployeeNumber {
    //�l�̌^�̒�` string�̕����^ value:�ϐ����@Employnumber�̒l
    private String value;
    //this��value��8�s�ڂ�value
    // (String value)��EmployNumber�̈���.value;�Ɠ����B�R���X�g���N�g�͈ȉ��B���͂��ăT�[�o�[���ɓn�����Ƃ��ɃI�u�W�F�N�g�𐶐��B
    public EmployeeNumber(String value) {
        this.value = value;
    }
}
