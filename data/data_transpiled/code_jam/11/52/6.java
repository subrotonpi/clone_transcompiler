@ VisibleForTesting static int solve ( ) {
  final int [ ] data = Ints . fromByteArray ( readLine ( ) . split ( " " ) ) ;
  if ( data . length == 0 ) return 0 ;
  final Counter < Integer > c = new Counter < > ( data ) ;
  final Deque < Integer > q = new ArrayDeque < > ( ) ;
  final int BIG = 2000 ;
  int ret = BIG ;
  final Iterator < Integer > it = c . entrySet ( ) . iterator ( ) ;
  it . forEachRemaining ( e -> {
    int i_ = e . getValue ( ) . intValue ( ) - 1 ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) {
      if ( e . getValue ( ) . intValue ( ) != i_ + 1 ) {
        ret = Math . min ( ret , Math . min ( i_ + 1 - e . getValue ( ) . intValue ( ) , q . size ( ) ) ) ;
        q . clear ( ) ;
      }
      while ( n > q . size ( ) ) {
        q . add ( e . getValue ( ) ) ;
      }
      while ( q . size ( ) > n ) {
        ret = Math . min ( ret , e . getValue ( ) . intValue ( ) - q . size ( ) ) ;
      }
      i_ = i ;
    }
    return ret ;
  }
  ) ;
  if ( className . equals ( "java.util.concurrent.ThreadPoolExecutor" ) ) {
    final int T = Integer . parseInt ( readLine ( ) ) ;
    for ( int t = 0 ;
    t < T ;
    ++ t ) {
      System . out . println ( "Case #" + ( t + 1 ) + ": " + solve ( ) ) ;
    }
  }
  return T ;
}
