public static void print ( String a , String b , String c , String d ) {
  Integer start = Integer . parseInt ( input . nextLine ( ) ) ;
  start = new TreeSet < > ( ) ;
  start . add ( a ) ;
  start . add ( c ) ;
  start . add ( b ) ;
  start . add ( d ) ;
  int time = end . get ( ) - start . get ( ) ;
  if ( time > 0 ) {
    System . out . println ( time ) ;
  }
  else {
    System . out . println ( "0" ) ;
  }
}
