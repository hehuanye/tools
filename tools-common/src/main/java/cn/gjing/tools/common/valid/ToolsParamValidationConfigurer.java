package cn.gjing.tools.common.valid;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Gjing
 **/
@Configuration
class ToolsParamValidationConfigurer implements WebMvcConfigurer {
    private ToolsParamValidationHandle toolsParamValidationHandle;
    private ValidMeta meta;

    public ToolsParamValidationConfigurer(ToolsParamValidationHandle toolsParamValidationHandle, ValidMeta validMeta) {
        this.toolsParamValidationHandle = toolsParamValidationHandle;
        this.meta = validMeta;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(toolsParamValidationHandle)
                .addPathPatterns(this.meta.getPath())
                .excludePathPatterns(this.meta.getExcludePath());
    }
}
