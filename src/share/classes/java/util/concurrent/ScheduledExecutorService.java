
package java.util.concurrent;


public interface ScheduledExecutorService extends ExecutorService {


    public ScheduledFuture<?> schedule(Runnable command,
                                       long delay, TimeUnit unit);


    public <V> ScheduledFuture<V> schedule(Callable<V> callable,
                                           long delay, TimeUnit unit);


    /**
     * 周期性的执行任务（不用等待上一个任务执行完毕）
     *
     * @param command      task
     * @param initialDelay 初始化延迟时间
     * @param period       周期性
     * @param unit         时间单位
     * @return
     */
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable command,
                                                  long initialDelay,
                                                  long period,
                                                  TimeUnit unit);


    /**
     * 周期性的执行任务（等待上一个任务执行完毕之后再算周期）
     *
     * @param command      task
     * @param initialDelay 初始化延迟时间
     * @param delay        周期性
     * @param unit         时间单位
     * @return
     */
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable command,
                                                     long initialDelay,
                                                     long delay,
                                                     TimeUnit unit);
}
