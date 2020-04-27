package swx.sc.hoxton.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user")
public class BaseUser {

    private Long id;
    private String name;
    private Integer age;
    private String email;

}
