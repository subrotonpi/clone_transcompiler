public static void input ( Scanner input ) {
  int n = input . nextInt ( ) , d = input . nextInt ( ) ;
  int x = input . nextInt ( ) , y = input . nextInt ( ) ;
  int [ ] f = new int [ n + 1 ] ;
  f [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    f [ i ] = f [ i - 1 ] * i ;
  }
  int v = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int a = i * d - x , b = ( n - i ) * d - y ;
    if ( a < 0 || b < 0 || a % ( 2 * d ) != 0 || b % ( 2 * d ) != 0 ) continue ;
    a /= ( 2 * d ) ;
    b /= ( 2 * d ) ;
    v += f [ n ] / ( f [ a ] * f [ i - a ] * f [ b ] * f [ n - i - b ] ) ;
  }
  System . out . println ( "" + ( v / 4 * n ) ) ;
}
