public static void input ( ) {
  int cnt = 0 ;
  int temp = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      String t = s . substring ( temp , i ) ;
      if ( t . indexOf ( "0" ) == - 1 ) cnt ++ ;
    }
    temp = i + 1 ;
  }
  if ( temp > 0 ) {
    cnt ++ ;
  }
  System . out . println ( cnt ) ;
}
