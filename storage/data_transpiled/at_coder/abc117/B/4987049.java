public static int N = Integer . parseInt ( input ) {
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int total = Integer . parseInt ( L . toString ( ) ) ;
  if ( total - max ( L ) > max ( L ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return total ;
}
