public static void print ( String input ) {
  N = Integer . parseInt ( input ) ;
  List < Integer > J = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    J . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > L = new ArrayList < > ( Arrays . asList ( J . toArray ( ) ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( new Integer ( i ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( L . get ( i ) . intValue ( ) ) ;
  }
}
