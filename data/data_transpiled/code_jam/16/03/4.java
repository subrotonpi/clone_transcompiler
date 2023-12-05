public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int tt = 0 ;
  tt < T ;
  tt ++ ) {
    int N = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int J = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    System . out . println ( "Case #" + ( tt + 1 ) + ":" ) ;
    int f = 2 * ( N / 2 ) + 1 ;
    int base = 2 * ( N / 2 - 1 ) + 1 ;
    String gg = "" ;
    for ( int i = 2 ;
    i < 11 ;
    i ++ ) gg += " " + ( i * ( N / 2 ) + 1 ) ;
    for ( int i : xrange ( J ) ) System . out . print ( Integer . toBinaryString ( ( base + i * 2 ) * f ) . substring ( 2 ) + gg ) ;
  }
  return 0 ;
}
