public static void input ( ) {
  int cnt = 0 ;
  String x = "" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == '+' ) {
      if ( "0" . equals ( x ) ) {
        x = "" ;
      }
      else {
        x = "" ;
        cnt = cnt + 1 ;
      }
    }
    else {
      x = x + i ;
    }
  }
  if ( ! "0" . equals ( x ) ) {
    cnt = cnt + 1 ;
  }
  System . out . println ( cnt ) ;
}
