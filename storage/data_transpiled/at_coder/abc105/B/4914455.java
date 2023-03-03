public static int N = Integer . parseInt ( input ) {
  for ( int cake = 0 ;
  cake < 26 ;
  cake ++ ) {
    for ( int donut = 0 ;
    donut < 15 ;
    donut ++ ) {
      if ( 4 * cake + 7 * donut == N ) {
        System . out . println ( "Yes" ) ;
        exit ( ) ;
      }
    }
  }
  else {
    System . out . println ( "No" ) ;
  }
  return 0 ;
}
