private static final ExecutorService executorService = Executors . newFixedThreadPool ( 3 ) ;
final int numThreads = 100000 ;
final boolean verbose = false ;
final BlockingQueue < Runnable > testCases = new ArrayBlockingQueue < Runnable > ( numThreads ) ;
final int threads = 100000 ;
ExecutorService executorService = Executors . newFixedThreadPool ( numThreads ) ;
final AtomicBoolean parallelize = new AtomicBoolean ( ) ;
final AtomicInteger numThreads = new AtomicInteger ( numThreads ) ;
final AtomicInteger numThreads = new AtomicInteger ( numThreads ) ;
ExecutorService executorService = Executors . newFixedThreadPool ( numThreads ) ;
for ( int i = 0 ;
i < numThreads ;
i ++ ) {
  executorService . submit ( new Runnable ( ) {
    @ Override public void run ( ) {
      int n = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
      int l = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
      int [ ] g = new int [ l ] ;
      int [ ] b = new int [ l ] ;
      System . arraycopy ( l , 0 , g , 0 , l ) ;
      b [ l ] = 1 ;
      System . arraycopy ( b , 0 , b , l ) ;
    }
  }
  ) ;
  executorService . shutdown ( ) ;
  executorService . awaitTermination ( 60 , TimeUnit . SECONDS ) ;
  executorService . shutdownNow ( ) ;
  for ( int i = 0 ;
  i < numThreads ;
  i ++ ) {
    Runnable r = executorService . submit ( new Runnable ( ) {
      @ Override public void run ( ) {
        int n = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
        int l = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
        int [ ] g = new int [ l ] ;
        int [ ] b = new int [ l ] ;
        System . arraycopy ( l , 0 , g , 0 , l ) ;
        b [ l ] = 1 ;
        System . arraycopy ( b , 0 , b , l , l ) ;
      }
    }
    ) ;
  }
  executorService . shutdown ( ) ;
  executorService . awaitTermination ( 60 , TimeUnit . SECONDS ) ;
  for ( int i = 0 ;
  i < numThreads ;
  i ++ ) {
    Runnable r = executorService . submit ( new Runnable ( ) {
      @ Override public void run ( ) {
        int n = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
        int l = Integer . parseInt ( System . getProperty ( "line.separator" ) ) ;
        int [ ] g = new int [ l ] ;
        System . arraycopy ( g , 0 , b ,