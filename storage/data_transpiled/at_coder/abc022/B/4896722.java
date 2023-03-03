public static void print ( int N ) {
  Set < Integer > already = new HashSet < > ( ) ;
  int count = 0 ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    int A = input . nextInt ( ) ;
    if ( already . contains ( A ) ) {
      count ++ ;
    }
    else {
      already . add ( A ) ;
    }
  }
  System . out . println ( count ) ;
}
