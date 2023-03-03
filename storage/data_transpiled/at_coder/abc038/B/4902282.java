public static void print ( String a , String b ) {
  String [ ] c = input . split ( " " ) ;
  if ( c [ 0 ] . contains ( a ) ) {
    System . out . println ( "YES" ) ;
  }
  else if ( c [ 1 ] . contains ( b ) ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
