public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int a = Integer . parseInt ( input ) ;
  int b = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int s = 0 ;
  int m = 998244353 ;
  int [ ] f = new int [ n + 1 ] ;
  int [ ] r = new int [ n + 1 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    f [ i ] = i * f [ i - 1 ] % m ;
    r [ i ] = Math . pow ( f [ i ] , m - 2 , m ) ;
  }
  int cb = ( x , y ) -> f [ x ] * r [ x - y ] * r [ y ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    int c = k - a * i ;
    int d = b * i ;
    if ( d == 0 && 0 <= c && c <= n ) {
      s = ( s + cb ( n , i ) * cb ( n , c ) ) % m ;
    }
  }
  System . out . println ( s ) ;
}
