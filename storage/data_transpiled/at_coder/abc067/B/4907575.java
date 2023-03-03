public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    a [ i ] = i ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    ans += a [ i ] ;
  }
  System . out . println ( ans ) ;
}
