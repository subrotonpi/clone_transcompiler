public static int N = Integer . parseInt ( input ) {
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( max ( L ) < sum ( L ) - max ( L ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return L . size ( ) ;
}
