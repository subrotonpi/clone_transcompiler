static final String getInput ( ) {
  System . setProperty ( "java.util.concurrent.atomic.AtomicLong" , "true" ) ;
  final AtomicLong counter = new AtomicLong ( ) ;
  final AtomicLong map = new AtomicLong ( ) ;
  final long mod = 1000000007 ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    final long a = Long . parseLong ( input . nextLine ( ) ) ;
    final long b = Long . parseLong ( input . nextLine ( ) ) ;
    map . get ( a ) . add ( b ) ;
    map . get ( b ) . add ( a ) ;
  }
  final Map < Integer , Long > map = new HashMap < > ( map ) ;
  final long [ ] f = new long [ n + 1 ] ;
  final long [ ] g = new long [ n + 1 ] ;
  {
    for ( int i = 0 ;
    i < f . length ;
    i ++ ) {
      if ( map . get ( i ) != p ) {
        dfs ( counter , f [ i ] ) ;
      }
    }
    f [ x ] = 1 ;
    g [ x ] = 1 ;
    for ( int i = 0 ;
    i < g . length ;
    i ++ ) {
      if ( map . get ( i ) != p ) {
        g [ x ] *= f [ i ] ;
        g [ x ] %= mod ;
        f [ x ] *= g [ i ] ;
        f [ x ] %= mod ] = 1 ;
      }
    }
    f [ x ] += g [ x ] ;
    f [ x ] %= mod ] = 1 ;
  }
  dfs ( - 1 , 1 ) ;
  System . out . println ( f [ 1 ] ) ;
}
