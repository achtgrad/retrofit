package retrofit.http;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Make a POST request to a REST path relative to base URL.
 *
 * @author Patrick Forhan (patrick@squareup.com)
 */
@Target({ METHOD })
@Retention(RUNTIME)
public @interface Background {
}
