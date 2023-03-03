public static void input ( Scanner s ) {
  List < String > s_list = new LinkedList < String > ( s ) ;
  Set < String > s_set = new HashSet < String > ( s_list ) ;
  int flag = 0 ;
  for ( String n : s_set ) {
    if ( s . nextInt ( ) % 2 != 0 ) {
      flag = 1 ;
    }
  }
  if ( flag == 0 ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
