@ VisibleForTesting static List < List < Integer >> permutations ( List < Integer > l ) {
  if ( l . size ( ) < 2 ) {
    return l ;
  }
  else {
    for ( List < Integer > k : permutations ( l . subList ( 1 , l . size ( ) ) ) ) {
      for ( int n = 0 ;
      n < l . size ( ) ;
      n ++ ) {
        res . add ( k . subList ( 0 , n ) . add ( l . get ( 0 ) ) . subList ( n , l . size ( ) ) ) ;
      }
    }
    return res ;
  }
}
