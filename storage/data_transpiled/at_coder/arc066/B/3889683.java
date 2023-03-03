static void N ( int N ) {
  String bit = Integer . toBinaryString ( N ) ;
  int k = bit . length ( ) ;
  int [ ] [ ] dp = new int [ bit . length ( ) + 1 ] [ 2 ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    dp [ i ] [ 0 ] = 1 ;
    dp [ i ] [ 1 ] = 1 ;
  }
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int j = Integer . parseInt ( bit . substring ( k - i - 1 ) ) ;
    int a = ( j == 0 ? 0 : 1 ) ;
    int b = ( j == 1 ? 0 : 1 ) ;
    int c = ( j == 1 ? 1 : 1 ) ;
    int d = ( j == 1 ? 1 : 1 ) ;
    int e = ( j == 0 ? 1 : 2 ) ;
    int f = ( j == 1 ? 1 : 1 ) ;
    dp [ i + 1 ] [ 0 ] = ( a * dp [ i ] [ 0 ] + b * dp [ i ] [ 1 ] + c * 3 * 3 * i ) % 1000000007 ;
    dp [ i + 1 ] [ 1 ] = d * dp [ i ] [ 0 ] + e * dp [ i ] [ 1 ] + f * 3 * 3 * i % 1000000007 ;
  }
  System . out . println ( dp [ k ] [ 0 ] ) ;
}
