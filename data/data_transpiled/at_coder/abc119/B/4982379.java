public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String u = input . nextLine ( ) ;
    x = Double . parseDouble ( x ) ;
    if ( u . equals ( "BTC" ) ) {
      x *= 380000 ;
    }
    ans += x ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
