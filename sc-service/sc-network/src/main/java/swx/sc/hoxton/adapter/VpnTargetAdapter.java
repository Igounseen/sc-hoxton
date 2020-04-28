package swx.sc.hoxton.adapter;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import swx.sc.hoxton.bean.dto.L3VpnDTO;
import swx.sc.hoxton.target.VpnTarget;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
public class VpnTargetAdapter implements VpnTarget {


    @PostConstruct
    public void init() {
        log.info("--- VpnTargetAdapter has been initialized ---");
    }

    @Override
    public void createL3Vpn() throws Exception {
        log.info("向控制器发送查询 l3vpn 请求... ");
    }

    @Override
    public void deleteL3Vpn() throws Exception {
        log.info("向控制器发送删除 l3vpn 请求... ");
    }

    @Override
    public void updateL3Vpn() throws Exception {
        log.info("向控制器发送更新 l3vpn 请求... ");
    }

    @Override
    public L3VpnDTO getL3Vpn(Long vpnId) throws Exception {
        // 1. 模拟发送http请求
        log.info("向控制器发送查询 l3vpn 请求... ");
        Thread.sleep(2000);
        log.info("收到控制器的返回结果");

        // 2. 模拟处理dto结果
        L3VpnDTO dto = L3VpnDTO.builder().build();

        // 3. todo 考虑是否缓存该dto ?
        return dto;
    }

}
