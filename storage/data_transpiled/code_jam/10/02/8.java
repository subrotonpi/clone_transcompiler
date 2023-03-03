public static int gcd ( int a , int b ) {
  if ( a == 0 || b == 0 ) {
    return a + b ;
  }
  else if ( a > b ) {
    return gcd ( b , a % b ) ;
  }
  else {
    return gcd ( a , b % a ) ;
  }
  if ( Class . isEnum ( "java.util.Scanner" ) ) {
    int T = Integer . parseInt ( readLine ( ) ) ;
    for ( int caseno : xrange ( T ) ) {
      List < Integer > nums = new ArrayList < Integer > ( ) ;
      for ( String s : readLine ( ) . split ( " " ) ) {
        nums . add ( Integer . parseInt ( s ) ) ;
      }
      int N = nums . get ( 0 ) ;
      int [ ] xs = nums . subList ( 1 , nums . size ( ) ) ;
      Arrays . sort ( xs ) ;
      int [ ] diffs = new int [ xrange ( xs . length - 1 ) ] ;
      for ( int i : xrange ( xs . length - 1 ) ) {
        diffs [ i ] = xs [ i + 1 ] - xs [ i ] ;
      }
      int res ;
      if ( diffs . length > 0 ) {
        int g = diffs [ 0 ] ;
        for ( int i = 1 ;
        i < diffs . length ;
        i ++ ) {
          g = gcd ( g , diffs [ i ] ) ;
        }
        res = ( g - ( xs [ 0 ] % g ) ) % g ;
      }
      else {
        res = 0 ;
      }
      System . out . println ( "Case #" + ( caseno + 1 ) + ": " + res ) ;
    }
  }
  return 0 ;
}
