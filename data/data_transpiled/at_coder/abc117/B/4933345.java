public static void print ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  if ( L . get ( N - 1 ) >= Integer . parseInt ( L . get ( N - 1 ) ) ) {
    System . out . println ( "No" ) ;
  }
  else {
    System . out . println ( "Yes" ) ;
  }
}
