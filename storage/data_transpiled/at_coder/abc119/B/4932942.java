public static int N = Integer . parseInt ( input ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String x = input . nextLine ( ) ;
    String v = input . nextLine ( ) ;
    x = Double . parseDouble ( x ) ;
    if ( v . equals ( "BTC" ) ) {
      x *= 380000 ;
    }
    ans += x ;
  }
  return ans ;
}
