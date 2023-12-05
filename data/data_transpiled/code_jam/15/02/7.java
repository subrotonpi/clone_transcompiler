public static int [ ] [ ] table = new int [ 25 ] [ 25 ] ;
for ( int i : xrange ( 1 , 1001 ) ) {
  table [ i ] [ 0 ] = ( j - 1 ) / i ;
}
int T = Integer . parseInt ( readLine ( ) ) ;
for ( int x = xrange ( 1 , T + 1 ) ;
x <= D ;
x ++ ) {
  int D = Integer . parseInt ( readLine ( ) ) ;
  int [ ] P = ArrayUtil . parseInt ( readLine ( ) . split ( " " ) ) ;
  int [ ] counts = new int [ 1001 ] ;
  for ( int p : P ) {
    counts [ p ] ++ ;
  }
  int m = Collections . max ( P ) ;
  int y = m ;
  for ( int i : xrange ( 1 , m + 1 ) ) {
    y = Math . min ( y , i + Math . pow ( table [ i ] [ j ] , counts [ j ] ) ) ;
  }
  System . out . println ( "Case #" + x + ": " + y ) ;
}
