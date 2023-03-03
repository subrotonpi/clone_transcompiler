public static void input ( int n , int a , int b , int k ) {
  int m = 998244353 ;
  int [ ] I = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    I [ i ] = Math . pow ( i + 1 , m - 2 , m ) ;
  }
  int [ ] c = new int [ n + 1 ] ;
  c [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    c [ i ] = ( c [ i - 1 ] * ( n - i + 1 ) * I [ i - 1 ] ) % m ;
  }
  int q = 0 ;
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    int j = ( k - i * a ) / b ;
    if ( ( k - i * a ) % b != 0 || j < 0 || j > n ) continue ;
    q = ( q + c [ i ] * c [ j ] ) % m ;
  }
  System . out . println ( q % m ) ;
}
