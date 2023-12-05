public static long combination ( int n , int r ) {
  r = Math . min ( n - r , r ) ;
  long result = 1 ;
  for ( int i = n ;
  i > n - r ;
  i -- ) {
    result *= i ;
  }
  for ( int i = 1 ;
  i <= r ;
  i ++ ) {
    result /= i ;
  }
  return result ;
}
int N = Integer . parseInt ( input . nextLine ( ) ) ;
int D = Integer . parseInt ( input . nextLine ( ) ) ;
int X = Integer . parseInt ( input . nextLine ( ) ) ;
int Y = Integer . parseInt ( input . nextLine ( ) ) ;
if ( X % D != 0 || Y % D != 0 ) {
  System . out . println ( 0 ) ;
  exit ( ) ;
}
else {
  long ans = 0 ;
  long cnX = Math . abs ( X ) / D ;
  long cnY = Math . abs ( Y ) / D ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    int x = i ;
    int y = N - i ;
    if ( x < cnX || y < cnY ) continue ;
    if ( ( x - cnX ) % 2 != 0 || ( y - cnY ) % 2 != 0 ) continue ;
    long tmpx = combination ( x , ( x - cnX ) / 2 ) / ( 2 * N ) ;
    long tmpy = combination ( y , ( y - cnY ) / 2 ) / ( 2 * N ) ;
    ans += tmpx * tmpy * combination ( N , i ) ;
  }
  System . out . println ( ans ) ;
}
