private static Map < Integer , Integer > twos = new HashMap < Integer , Integer > ( ) {
  {
    for ( int i : xrange ( 41 ) ) {
    }
  }
  @ Override public Integer [ ] readLine ( ) {
    return map ( Integer . parseInt ( readLine ( ) . trim ( ) ) ) ;
  }
  private int gcd ( int a , int b ) {
    return b != 0 ? gcd ( b , a % b ) : a ;
  }
  private String solve ( ) {
    int n = readLine ( ) ;
    int d = readLine ( ) ;
    int g = gcd ( n , d ) ;
    n /= g ;
    d /= g ;
    if ( ! twos . containsKey ( d ) ) return "impossible" ;
    int i = 1 ;
    while ( d > 0 ) {
      if ( n >= d / 2 ) return i ;
      d /= 2 ;
      i ++ ;
    }
    return "foobar" ;
  }
  @ Override public String toString ( ) {
    int t = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    for ( int i : xrange ( 1 , t + 1 ) ) {
      String ret = solve ( ) ;
      System . out . println ( "Case #" + i + ":" + ret ) ;
    }
    return "" ;
  }
}
