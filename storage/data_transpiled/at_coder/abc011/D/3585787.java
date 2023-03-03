@ VisibleForTesting static void prime ( int N , int D ) {
  int X , Y ;
  int x , y ;
  int s ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  D = Integer . parseInt ( input . nextLine ( ) ) ;
  X = Integer . parseInt ( input . nextLine ( ) ) ;
  Y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( X % D != 0 || Y % D != 0 || ( X / D + Y / D ) % 2 != N % 2 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  X = Math . abs ( X / D ) ;
  Y = Math . abs ( Y / D ) ;
  s = 0 ;
  for ( int k = X % 2 ;
  k <= N ;
  k += 2 ) {
    x = k ;
    y = N - k ;
    if ( x < X || y < Y ) {
      continue ;
    }
    s = factorial ( N ) / factorial ( k ) / factorial ( N - k ) ;
    rx = ( X + x ) / 2 ;
    s *= factorial ( x ) / factorial ( rx ) / factorial ( x - rx ) ;
    ry = ( Y + y ) / 2 ;
    s *= factorial ( y ) / factorial ( ry ) / factorial ( y - ry ) ;
    total += s ;
  }
  System . out . println ( total / 4 * N ) ;
}
