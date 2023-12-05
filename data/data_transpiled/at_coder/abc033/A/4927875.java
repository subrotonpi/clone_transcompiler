public static void input ( Scanner in ) {
  int N = in . nextInt ( ) ;
  List < Integer > l = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l . add ( in . nextInt ( ) ) ;
  }
  Set < Integer > set = new HashSet < Integer > ( l ) ;
  if ( set . size ( ) == 1 ) {
    System . out . println ( "SAME" ) ;
  }
  else {
    System . out . println ( "DIFFERENT" ) ;
  }
}
