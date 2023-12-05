public static double binom ( int n , int m ) {
  if ( m < 0 || m > n ) return 0 ;
  return bin [ n ] [ m ] ;
}
/* bin oms */
double [ ] b = new double [ n + 1 ] ;
b [ 0 ] = 1 ;
for ( int i : xrange ( 1 , n + 1 ) ) {
  b [ i ] = 1 ;
  int j = i - 1 ;
  while ( j > 0 ) {
    b [ j ] += b [ j - 1 ] ;
    j -- ;
  }
}
bin = new double [ 41 ] ;
for ( int i = 0 ;
i < bin . length ;
i ++ ) {
  bin [ i ] = binoms ( i ) ;
}
for ( int i = 0 ;
i < bin . length ;
i ++ ) {
  System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
  int C = Integer . parseInt ( readLine ( ) ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  double [ ] ex = new double [ C + N + 1 ] ;
  for ( int i = 0 ;
  i < bin . length ;
  i ++ ) {
    ex [ i ] = 0.0 ;
    for ( int k = 0 ;
    k < xrange ( C + N + 1 ) ;
    k ++ ) {
      ex [ i ] = ( 1.0 + Math . pow ( binom ( i , k ) * binom ( C - i , N - k ) * ex [ i + N - k ] / CcN , 2 ) ) / ( 1 - binom ( i , N ) * binom ( C - i , 0 ) / CcN ) ;
    }
  }
  System . out . println ( ex [ 0 ] ) ;
}
