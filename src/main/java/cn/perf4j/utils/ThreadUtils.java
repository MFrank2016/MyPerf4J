package cn.perf4j.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by LinShunkang on 2018/3/16
 */
public class ThreadUtils {

    public static ThreadFactory newThreadFactory(final String prefix) {
        return new ThreadFactory() {
            AtomicInteger atomicInteger = new AtomicInteger(0);

            @Override
            public Thread newThread(Runnable r) {
                return new Thread(r, prefix + atomicInteger.getAndIncrement());
            }
        };
    }

}
