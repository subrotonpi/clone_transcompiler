@ GwtIncompatible ( "java.util.concurrent.atomic.AtomicInteger" ) public static < T > T compute ( ) {
  final MemoizedSupplier < T > supplier = new MemoizedSupplier < T > ( ) {
    private final Map < String , T > mem = new HashMap < String , T > ( ) ;
    @ Override public T get ( String name ) {
      if ( ! mem . containsKey ( name ) ) {
        mem . put ( name , supplier . get ( ) ) ;
      }
      return supplier . get ( ) ;
    }
  }
  ;
  Function < InputStream , Integer > readInteger = new Function < InputStream , Integer > ( ) {
    @ Override public Integer apply ( InputStream inStream ) {
      return Integer . parseInt ( inStream . readLine ( ) ) ;
    }
  }
  ;
  Function < InputStream , Integer > readInts = new Function < InputStream , Integer > ( ) {
    @ Override public Integer apply ( InputStream inStream ) {
      return ( Integer ) readInts . apply ( inStream ) ;
    }
  }
  ;
  class SharedData implements Runnable {
    private final Set < Integer > set ;
    @ Override public void run ( ) {
      set = new HashSet < Integer > ( ) ;
    }
  }
  ;
  T process ( InputStream inStream , int ncase , SharedData shared ) {
    int A = readInts . apply ( inStream ) ;
    int B = readInts . apply ( inStream ) ;
    int chars = String . valueOf ( A ) . length ( ) ;
    int pairs = 0 ;
    for ( int n = xrange ( A , B + 1 ) ;
    n < B ;
    n ++ ) {
      int m = n ;
      Set < Integer > ms = new HashSet < Integer > ( ) ;
      for ( int i = xrange ( 1 , chars ) ;
      i < m ;
      i ++ ) {
        m = ( m / 10 ) + ( m % 10 ) * ( 10 * ( chars - 1 ) ) ;
        if ( m < n && m >= A && ! set . contains ( m ) ) {
          pairs ++ ;
          ms . add ( m ) ;
        }
      }
    }
  }
  ;
  System . out . println ( "Precalculation..." ) ;
  SharedData shared = new SharedData ( ) ;
  System . out . println ( "Precalculation done." ) ;
  System . out . println ( "Calculation..." ) ;
  try ( InputStream in = new FileInputStream ( FILE + ".in" ) ;
  OutputStream out = new FileOutputStream ( FILE + ".out" ) ) {
    int cases = Integer . parseInt ( in . readLine ( ) ) ;
    for ( int