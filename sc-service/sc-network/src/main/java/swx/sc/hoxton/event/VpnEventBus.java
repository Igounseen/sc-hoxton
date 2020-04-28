package swx.sc.hoxton.event;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import swx.sc.hoxton.bean.msg.VpnStatusMsg;
import swx.sc.hoxton.bean.msg.VpnTopoMsg;
import swx.sc.hoxton.service.VirtualNetworkService;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
@Component
public class VpnEventBus extends EventBus {

    @Autowired
    VirtualNetworkService virtualNetworkService;

    /**
     * 虚网状态消息
     *
     * @param msg
     */
    @Subscribe
    public void statusChange(VpnStatusMsg msg) {
        Long vpnId = msg.getVpnId();
        String status = msg.getStatus();
        try {
            virtualNetworkService.syncVirtualNetworkStatus(vpnId, status);
        } catch (Exception e) {
            log.error("虚网状态更新异常：{}", e.getMessage());
        }
    }

    /**
     * 虚网拓扑消息
     *
     * @param msg
     */
    @Subscribe
    public void topoChange(VpnTopoMsg msg) {

    }

}
