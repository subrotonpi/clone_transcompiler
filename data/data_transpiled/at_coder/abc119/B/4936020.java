public static double readDouble ( ) {
  int n = Integer . parseInt ( input ) ;
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    String a = input . next ( ) ;
    String t = input . next ( ) ;
    if ( t . equals ( "JPY" ) ) {
      ans += Integer . parseInt ( a ) ;
    }
    else if ( t . equals ( "BTC" ) ) {
      ans += Double . parseDouble ( a ) * 380000.0 ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
