@ VisibleForTesting static int solve ( List < Integer > numbers ) throws IOException {
  System . out . println ( ) ;
  int hits = 0 ;
  Set < Integer > already = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < numbers . size ( ) ;
  i ++ ) {
    int n = numbers . get ( i ) ;
    if ( already . contains ( n ) ) continue ;
    if ( n == i ) already . add ( n ) ;
    else {
      Set < Integer > cluster = new HashSet < > ( ) ;
      cluster . add ( n ) ;
      do {
        n = numbers . get ( n - 1 ) ;
      }
      while ( n != i ) ;
      cluster . add ( n ) ;
      already . add ( n ) ;
    }
    System . out . println ( ) ;
    hits += cluster . size ( ) ;
  }
  return hits ;
}
