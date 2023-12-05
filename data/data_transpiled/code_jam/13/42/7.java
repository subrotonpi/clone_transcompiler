public static int ok1 ( int x , int y ) {
  if ( x == 0 ) {
    return 0 ;
  }
  return y / 2 + ok1 ( ( x - 1 ) / 2 , y / 2 ) ;
}
{
  if ( x == y - 1 ) {
    return 0 ;
  }
  return y / 2 + ok2 ( ( x + 1 ) / 2 , y / 2 ) ;
}
int t = input . nextInt ( ) ;
for ( int i = 0 ;
i < t ;
i ++ ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans1 = 0 , ans2 = 2 * n - 1 ;
  int L = 0 , R = 2 * n - 1 ;
  while ( L < R ) {
    int m = ( L + R + 1 ) / 2 ;
    if ( ok1 ( m , 2 * n ) >= p ) {
      R = m - 1 ;
    }
    else {
      L = m ;
    }
  }
  ans1 = L ;
  L = 0 , R = 2 * n - 1 ;
  while ( L < R ) {
    int m = ( L + R + 1 ) / 2 ;
    if ( ok2 ( m , 2 * n ) < 2 * n - p ) {
      R = m - 1 ;
    }
    else {
      L = m ;
    }
  }
  ans2 = L ;
  System . out . println ( "Case #" + ( i + 1 ) + ": " + ans1 + " " + ans2 ) ;
}
