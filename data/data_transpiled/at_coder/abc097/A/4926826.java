public static List < Integer > solve ( ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    A . add ( input . nextInt ( ) ) ;
  }
  if ( ( Math . abs ( A . get ( 0 ) - A . get ( 2 ) ) <= A . get ( 3 ) ) || ( ( Math . abs ( A . get ( 0 ) - A . get ( 1 ) ) <= A . get ( 3 ) ) && ( Math . abs ( A . get ( 2 ) - A . get ( 1 ) ) <= A . get ( 3 ) ) ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return A ;
}
