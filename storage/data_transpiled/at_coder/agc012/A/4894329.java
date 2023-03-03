public static void main ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i < 2 * n ;
  i += 2 ) {
    ans += a [ i ] ;
  }
  System . out . println ( ans ) ;
}
