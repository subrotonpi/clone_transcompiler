public static String print ( String A , String B ) {
  String res = "No" ;
  for ( int i = 1 ;
  i <= 4 ;
  i ++ ) {
    if ( ( A * B * i ) % 2 == 1 ) {
      res = "Yes" ;
      break ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
