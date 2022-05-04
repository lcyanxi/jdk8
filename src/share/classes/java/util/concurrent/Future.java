

package java.util.concurrent;

public interface Future<V> {

    /**
     * 取消异步任务的执行
     */
    boolean cancel(boolean mayInterruptIfRunning);

    /**
     * 任务是否被取消
     */
    boolean isCancelled();

    /**
     * 任务是否已经完成
     */
    boolean isDone();

    /**
     * 获取任务执行结果，如果任务还没完成则阻塞等待
     */
    V get() throws InterruptedException, ExecutionException;

    /**
     * 获取任务执行结果 带超时时间
     *
     * @param timeout 时间
     * @param unit    单位
     */
    V get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException, TimeoutException;
}
