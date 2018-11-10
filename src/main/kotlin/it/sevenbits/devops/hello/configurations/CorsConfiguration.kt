package it.sevenbits.devops.hello.configurations

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableConfigurationProperties(CorsProperties::class)
open class CorsConfiguration {

    @Bean
    open fun corsConfigurer(
        corsProperties: CorsProperties?
    ): WebMvcConfigurer {
        return object : WebMvcConfigurer {
            override fun addCorsMappings(registry: CorsRegistry) {
                if (corsProperties != null && corsProperties.allowedOrigins.isNotEmpty()) {
                    registry.addMapping("/api/**").allowedOrigins(*corsProperties.allowedOrigins.toTypedArray())
                }
            }
        }
    }

}

@ConfigurationProperties(prefix = "web.cors")
open class CorsProperties {

    var allowedOrigins: List<String> = mutableListOf()

}
