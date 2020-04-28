package swx.sc.hoxton.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import swx.sc.hoxton.adapter.VpnTargetAdapter;
import swx.sc.hoxton.target.VpnTarget;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Configuration
@ConditionalOnProperty(prefix = "sc", name = "controller-support", havingValue = "ziyan")
public class ConditionZiYan {

    @Bean
    VpnTarget vpnTarget() {
        return new VpnTargetAdapter();
    }

}
