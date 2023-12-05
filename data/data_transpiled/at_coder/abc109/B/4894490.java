public static void print ( String input ) {
  int n = Integer . parseInt ( input ) ;
  Set < Integer > done = new HashSet < Integer > ( ) ;
  Integer start = input ;
  done . add ( start ) ;
  boolean status = true ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    Integer x = input . nextInt ( ) ;
    if ( done . contains ( x ) ) status = false ;
    if ( x . intValue ( ) != start . intValue ( ) - 1 ) status = false ;
    done . add ( x ) ;
    start = x ;
  }
  if ( status ) System . out . println ( "Yes" ) ;
  else System . out . println ( "No" ) ;
}
