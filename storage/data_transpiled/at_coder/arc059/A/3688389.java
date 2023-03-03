public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] a = list ( Integer . parseInt ( input ) ) ;
  double s = sum ( a ) ;
  long ave_new = Math . round ( s / n ) ;
  long ans = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    ans += ( a [ i ] - ave_new ) * ( a [ i ] - ave_new ) ;
  }
  System . out . println ( ans ) ;
}
