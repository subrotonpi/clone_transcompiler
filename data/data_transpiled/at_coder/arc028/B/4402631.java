static final String getSummarizeString ( ) {
  final String fin = System . getProperty ( "line.separator" ) ;
  final int MAX_N = 100000 ;
  final int N = Integer . parseInt ( fin ) ;
  final int K = Integer . parseInt ( fin ) ;
  final List < Integer > X_list = ImmutableList . of ( Integer . parseInt ( fin ) ) ;
  final Integer [ ] ageToRank = new Integer [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int X = X_list . get ( i ) ;
    ageToRank [ X ] = i ;
  }
  final int [ ] maxHeap = new int [ X_list . size ( ) ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    maxHeap [ i ] = i ;
  }
  for ( int i = 0 ;
  i < maxHeap . length ;
  i ++ ) {
    maxHeap [ i ] = i ;
  }
  System . out . println ( ageToRank [ - maxHeap [ 0 ] ] ) ;
  for ( int i = K ;
  i < X_list . size ( ) ;
  i ++ ) {
    final int X = X_list . get ( i ) ;
    if ( X < - maxHeap [ 0 ] ) {
      maxHeap [ i ] = i ;
      maxHeap [ i ] = i ;
    }
  }
  System . out . println ( ageToRank [ - maxHeap [ 0 ] ] ) ;
  return null ;
}
