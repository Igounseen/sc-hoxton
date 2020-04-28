package swx.sc.hoxton.service;

import javax.annotation.Resource;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import swx.sc.hoxton.bean.dto.L3VpnDTO;
import swx.sc.hoxton.bean.entity.VirtualNetwork;
import swx.sc.hoxton.mapper.VirtualNetworkMapper;
import swx.sc.hoxton.target.VpnTarget;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Service
public class VirtualNetworkServiceImpl implements VirtualNetworkService {


    @Resource
    VirtualNetworkMapper virtualNetworkMapper;

    @Autowired
    VpnTarget vpnTarget;

    @Override
    public void createL3Vpn() {

    }

    @Override
    public void syncVirtualNetworkStatus(Long vpnId, String newStatus) throws Exception {
        if (StringUtils.isEmpty(newStatus)) {
            L3VpnDTO l3Vpn = vpnTarget.getL3Vpn(vpnId);
            newStatus = l3Vpn.getStatus();
        }
        // 更新本地虚网状态
        VirtualNetwork virtualNetwork = virtualNetworkMapper.selectById(vpnId);
        String localStatus = virtualNetwork.getStatus();
        String targetStatus = StringUtils.isEmpty(newStatus) ? localStatus : newStatus;
        VirtualNetwork virtualNetworkNew = VirtualNetwork.builder()
                .id(vpnId)
                .status(targetStatus)
                .build();
        virtualNetworkMapper.updateById(virtualNetworkNew);
        // 向 websocket 发送虚网状态变更信息 todo

    }


}
