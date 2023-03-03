public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > L = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    if ( A + i <= B ) {
      L . add ( A + i ) ;
    }
    else {
      break ;
    }
  }
  for ( int i = 1 - K ;
  i <= 1 ;
  i ++ ) {
    if ( B + i >= A && ! L . contains ( B + i ) ) {
      L . add ( B + i ) ;
    }
  }
  for ( int i = 0 ;
  i < L . size ( ) ;
  i ++ ) {
    System . out . println ( L . get ( i ) ) ;
  }
  return L . size ( ) ;
}
