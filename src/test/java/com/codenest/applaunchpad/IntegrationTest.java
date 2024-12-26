package com.codenest.applaunchpad;

import com.codenest.applaunchpad.config.AsyncSyncConfiguration;
import com.codenest.applaunchpad.config.EmbeddedElasticsearch;
import com.codenest.applaunchpad.config.EmbeddedKafka;
import com.codenest.applaunchpad.config.EmbeddedSQL;
import com.codenest.applaunchpad.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AppLaunchpadApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
