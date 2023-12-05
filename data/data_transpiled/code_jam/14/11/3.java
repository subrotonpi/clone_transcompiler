public static void solve ( int n , int l , int [ ] a , int [ ] b ) {
  Arrays . sort ( b ) ;
  int ans = inf ;
  for ( int i : xrange ( n ) ) {
    int [ ] c = new int [ n ] ;
    int diff = a [ 0 ] ^ b [ i ] ;
    for ( int j : xrange ( n ) ) c [ j ] = a [ j ] ^ diff ;
    Arrays . sort ( c ) ;
    if ( b . equals ( c ) ) ans = Math . min ( ans , Integer . toBinaryString ( diff ) . indexOf ( '1' ) ) ;
  }
  if ( ans == inf ) System . out . println ( "NOT POSSIBLE" ) ;
  else System . out . println ( ans ) ;
  return ;
  int T = input . nextInt ( ) ;
  for ( int i : xrange ( T ) ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    Arrays . sort ( a ) ;
    Arrays . sort ( b ) ;
    int [ ] a = map . get ( a ) ;
    int [ ] b = map . get ( b ) ;
    solve ( n , l , a , b ) ;
  }
}
