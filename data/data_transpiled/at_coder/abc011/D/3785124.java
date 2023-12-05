public static void main ( String input , int n , int d ) {
  int x = Integer . parseInt ( input ) ;
  int y = Integer . parseInt ( input ) ;
  if ( x % d != 0 || y % d != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int xLeast = x / d ;
  int yLeast = y / d ;
  if ( xLeast + yLeast > n ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  if ( ( n - ( xLeast + yLeast ) ) % 2 != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int [ ] fac = new int [ n + 1 ] ;
  fac [ 0 ] = 1 ;
  int f = 1 ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    f *= i ;
    fac [ i ] = f ;
  }
  int rest = ( n - ( xLeast + yLeast ) ) / 2 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < rest + 1 ;
  i ++ ) {
    int up = yLeast + i ;
    int down = i ;
    int right = xLeast + ( rest - i ) ;
    int left = rest - i ;
    ans += fac [ n ] / ( fac [ up ] * fac [ down ] * fac [ right ] * fac [ left ] ) ;
  }
  System . out . println ( ans / 4 * n ) ;
}
