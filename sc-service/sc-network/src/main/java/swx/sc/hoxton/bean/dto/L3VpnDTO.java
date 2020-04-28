package swx.sc.hoxton.bean.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class L3VpnDTO {

    Long vpnId;

    String name;

    String status;

}
