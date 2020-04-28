package swx.sc.hoxton.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import swx.sc.hoxton.adapter.Eagle;
import swx.sc.hoxton.target.Animal;

/**
 * @author shiwenxiang
 * @date 2020/4/28
 */
@Slf4j
@Configuration
@ConditionalOnProperty(prefix = "sc", name = "condition", havingValue = "sky")
public class ConditionSky {

    @Bean
    public Animal dog() {
        return new Eagle();
    }


}
