package cn.thare.feqb.annotation.func.aggs;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Field's type must be {@link Boolean}
 * <p>Implied whether handle StatsAggregation
 */
@Aggregation
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StatsAggregation {

    String name();

    String field();

}
