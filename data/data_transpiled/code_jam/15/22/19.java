public static int N = input . nextInt ( ) {
  int C ;
  int r , c , n ;
  int ans ;
  assert c >= 0 && c >= 0 && c >= 0 ;
  n = Math . min ( c , n ) ;
  tot -= 4 * s ;
  n = Math . min ( c , n ) ;
  r = Math . min ( c , n ) ;
  c = Math . min ( c , n ) ;
  n = Math . min ( c , n ) ;
  if ( ( r * c + 1 ) / 2 >= n ) {
    System . out . println ( "Case #" + C + ":" ) ;
    continue ;
  }
  if ( r % 2 != 0 ) ( r = c ) ;
  n = Math . min ( c , n ) ;
  tot = c * ( r - 1 ) + r * ( c - 1 ) ;
  n = r * c - n ;
  if ( r == 1 || c == 1 ) {
    System . out . println ( "Case #" + C + ":" ) ;
    tot -= 2 * n ;
    continue ;
  }
  if ( r % 2 == 0 && c % 2 == 0 ) {
    n = ( c - 2 ) * ( r - 2 ) / 2 ;
    n = ( r * c / 2 ) - n - 2 ;
    n = 2 ;
    ans = worker ( n , n , tot , rest ) ;
  }
  else if ( r % 2 == 0 && c % 2 != 0 ) {
    n = ( c - 2 ) * ( r - 2 ) / 2 ;
    n = ( r * c / 2 ) - n - 2 ;
    n = 2 ;
    ans = worker ( n , n , tot , rest ) ;
  }
  else {
    n = ( ( c - 2 ) * ( r - 2 ) + 1 ) / 2 ;
    n = ( r * c + 1 ) / 2 - n - 4 ;
    n = 4 ;
    ans = worker ( n , n , tot , rest ) ;
    n = ( ( c - 2 ) * ( r - 2 ) - 1 ) / 2 ;
    n = 2 ;
    ans = worker ( n , n , tot , rest ) ;
  }
  return ans ;
}
