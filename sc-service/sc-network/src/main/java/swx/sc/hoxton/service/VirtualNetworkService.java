package swx.sc.hoxton.service;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
public interface VirtualNetworkService {


    /**
     * 创建虚网
     */
    void createL3Vpn() throws Exception;


    /**
     * 同步控制器的虚网状态
     */
    void syncVirtualNetworkStatus(Long vpnId, String newStatus) throws Exception;

}
