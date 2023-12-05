public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( B - A + 1 < 2 * K ) {
    for ( int i = A ;
    i <= B ;
    i ++ ) {
      System . out . println ( i ) ;
    }
  }
  else {
    for ( int i = A ;
    i <= A + K ;
    i ++ ) {
      System . out . println ( i ) ;
    }
    for ( int i = B - K + 1 ;
    i <= B ;
    i ++ ) {
      System . out . println ( i ) ;
    }
  }
  return B ;
}
