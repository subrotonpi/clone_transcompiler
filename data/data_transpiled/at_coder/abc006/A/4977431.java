public static void input ( Scanner scanner ) {
  boolean f = false ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( scanner . next ( ) == '3' ) {
      f = true ;
    }
  }
  if ( Integer . parseInt ( scanner . nextLine ( ) ) % 3 == 0 ) {
    f = true ;
  }
  if ( f ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
