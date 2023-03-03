public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  Collections . sort ( L , Collections . reverseOrder ( ) ) ;
  int length = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    length += L . get ( i ) ;
  }
  if ( L . get ( 0 ) < length ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
