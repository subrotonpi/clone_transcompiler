public static void input ( ) {
  int count = 0 ;
  String stn = S . charAt ( 0 ) ;
  int i = 1 ;
  while ( i < S . length ) {
    while ( i < S . length && stn . equals ( S . charAt ( i ) ) ) i ++ ;
    if ( i < S . length ) {
      count ++ ;
      stn = S . charAt ( i ) ;
    }
  }
  System . out . println ( count ) ;
}
