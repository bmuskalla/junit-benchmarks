package com.carrotsearch.junitbenchmarks.annotation;

import java.lang.annotation.*;

/**
 * Generate a graphical summary for all benchmarked methods of the annotated class.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Inherited
public @interface BenchmarkMethodChart
{
    /**
     * Chart file prefix override. If empty, class name is used. 
     */
    String filePrefix() default "";
}