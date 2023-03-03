public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int t = Integer . parseInt ( input ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    ans += Math . min ( a [ i ] - a [ i - 1 ] , t ) ;
  }
  System . out . println ( ans + t ) ;
}
