package swx.sc.hoxton.bean.msg;

import lombok.Data;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Data
public class VpnStatusMsg extends Msg {

    /**
     * 虚网id
     */
    Long vpnId;

    /**
     * 虚网状态
     */
    String status;

}
