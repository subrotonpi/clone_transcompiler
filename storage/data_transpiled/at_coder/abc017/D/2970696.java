public static void main ( String input ) {
  int n = Integer . parseInt ( input . substring ( 0 , n ) ) ;
  int m = Integer . parseInt ( input . substring ( n , m ) ) ;
  int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) A [ i ] = Integer . parseInt ( input . substring ( n , i + 1 ) ) - 1 ;
  int [ ] M = new int [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) M [ A [ i ] ] = - 1 ;
  int [ ] N = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) N [ i ] = 0 ;
  long mod = 1000000007 ;
  long su = 1 ;
  int ri = 0 ;
  M [ A [ 0 ] ] = 0 ;
  N [ ( n - 1 ) - 0 ] = 1 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    int ke = 0 ;
    int mk = M [ A [ i ] ] ;
    M [ A [ i ] ] = i ;
    while ( ri <= mk ) {
      ke += N [ n - 1 - ri ] ;
      N [ n - 1 - ri ] = 0 ;
      ri ++ ;
    }
    N [ n - 1 - i ] += su ;
    su = ( su * 2 - ke ) % mod ;
  }
  System . out . println ( Arrays . toString ( N ) % mod ) ;
}
