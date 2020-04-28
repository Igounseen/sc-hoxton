package swx.sc.hoxton.bean.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VirtualNetwork {

    private Long id;

    private String name;

    private String description;

    private String status;

}
