public static int tt = Integer . parseInt ( readLine ( ) ) {
  for ( int t : xrange ( 1 , tt + 1 ) ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int [ ] x = new int [ 2502 ] ;
    for ( int i : xrange ( 2 * n - 1 ) ) {
      int [ ] s = Integer . parseInt ( readLine ( ) . trim ( ) ) . split ( " " ) ;
      for ( int v : s ) x [ v ] ++ ;
    }
    List < Integer > a = new ArrayList < > ( ) ;
    for ( int v : xrange ( 2502 ) ) {
      if ( x [ v ] % 2 == 1 ) a . add ( v ) ;
    }
    String ans = String . join ( " " , a ) ;
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
  return tt ;
}
