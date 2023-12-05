@ Nonnull public static int [ ] rev ( @ Nonnull final int x ) {
  final int y = 0 ;
  while ( x != 0 ) {
    y = y * 10 + x % 10 ;
    x /= 10 ;
  }
  return y ;
  final boolean zfair = ( x != 0 && x % 10 == 0 ) ;
  final BlockingQueue < String > qu = new ArrayBlockingQueue < > ( ) ;
  qu . offer ( "" ) ;
  qu . offer ( "0" ) ;
  qu . offer ( "1" ) ;
  qu . offer ( "2" ) ;
  final List < Integer > v = new ArrayList < > ( ) ;
  v . add ( 1 ) ;
  v . add ( 4 ) ;
  v . add ( 9 ) ;
  while ( ! qu . isEmpty ( ) ) {
    final String p = qu . poll ( ) ;
    for ( int a = 0 ;
    a <= 3 ;
    a ++ ) {
      final String g = String . valueOf ( a ) + p + String . valueOf ( a ) ;
      if ( g . length ( ) > 52 ) break ;
      final int x = Integer . parseInt ( g ) ;
      if ( zfair ) {
        qu . offer ( g ) ;
        if ( a > 0 ) v . add ( x * x ) ;
      }
    }
  }
  Collections . sort ( v ) ;
  final int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int tc = 1 ;
  tc <= t ;
  tc ++ ) {
    final String s = System . console ( ) . readLine ( ) ;
    final int [ ] a = ArrayUtil . fromStrings ( s , new Function < String , Integer > ( ) {
      @ Override public Integer fun ( final String s ) {
        return Integer . parseInt ( s ) ;
      }
    }
    ) ;
    System . out . println ( "Case #" + tc + ": " + ( Arrays . binarySearch ( v , a [ 1 ] ) - Arrays . binarySearch ( v , a [ 0 ] ) ) ) ;
  }
  return v . toArray ( new int [ 0 ] ) ;
}
