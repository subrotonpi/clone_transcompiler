public static int N = Integer . parseInt ( input ) {
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  if ( Math . max ( L . size ( ) * 2 ) < Integer . parseInt ( L . get ( i ) ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return L . size ( ) ;
}
