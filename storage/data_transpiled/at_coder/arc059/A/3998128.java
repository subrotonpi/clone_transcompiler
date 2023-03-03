public static void print ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int [ ] a = list ( Integer . parseInt ( input ( ) ) ) ;
  int m = Math . round ( Arrays . asList ( a ) . length / n ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans += ( a [ i ] - m ) * ( a [ i ] - m ) ;
  }
  System . out . println ( ans ) ;
}
