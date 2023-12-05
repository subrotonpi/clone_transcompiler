static void z ( int n , int [ ] a , int [ ] b ) {
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String m = input . next ( ) ;
    int x = 0 ;
    for ( int j = 0 ;
    j < m . length ( ) ;
    j ++ ) x += ( z . indexOf ( m . charAt ( m . length ( ) - j - 1 ) ) ) * ( 10 * j ) ;
    a [ i ] = x ;
    b [ i ] = m ;
  }
  {
    int ab = a [ 0 ] ;
    int ba = b [ 0 ] ;
    int abc = a [ 1 ] ;
    a [ 0 ] = a [ 2 ] ;
    b [ 1 ] = abc ;
  }
  int h = n ;
  while ( true ) {
    int hh = a [ 0 ] ;
    if ( h > 1 ) h = Math . round ( h / 1.3 ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) if ( a [ i ] > a [ i + h ] ) {
      swap ( i , i + h , a ) ;
      swap ( i , i + h , b ) ;
    }
  }
}
