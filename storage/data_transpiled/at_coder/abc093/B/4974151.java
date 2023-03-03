public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( B - A < K ) {
    for ( int i = A ;
    i <= B ;
    i ++ ) {
      if ( i < A + K || B - K < i ) {
        System . out . println ( i ) ;
      }
    }
  }
  else {
    Set < Integer > S = new HashSet < Integer > ( ) ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      S . add ( A + i ) ;
      S . add ( B - i ) ;
    }
    List < Integer > L = new LinkedList < Integer > ( S ) ;
    Collections . sort ( L ) ;
    for ( int i : L ) {
      System . out . println ( i ) ;
    }
  }
  return B ;
}
