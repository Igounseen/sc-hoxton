package swx.sc.hoxton.target;

import swx.sc.hoxton.bean.dto.L3VpnDTO;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
public interface VpnTarget {

    /**
     * 创建l3vpn
     */
    void createL3Vpn() throws Exception;


    void deleteL3Vpn() throws Exception;


    void updateL3Vpn() throws Exception;


    L3VpnDTO getL3Vpn(Long vpnId) throws Exception;


}
