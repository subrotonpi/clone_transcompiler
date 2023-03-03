static final int [ ] getHigherPriority ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] aLs = Arrays . stream ( input . nextLine ( ) . split ( " " ) ) . mapToInt ( Integer :: parseInt ) . toArray ( ) ;
  int [ ] before = new int [ N ] ;
  int _sumBefore = 0 ;
  List < Integer > beforeScores = new ArrayList < > ( ) ;
  int [ ] after = new int [ N ] ;
  int _sumAfter = 0 ;
  List < Integer > afterScores = new ArrayList < > ( ) ;
  int best = 0 ;
  for ( int i = 0 ;
  i < 2 * N ;
  i ++ ) {
    _sumBefore += aLs [ i ] ;
    heapifyPriority ( before , aLs [ i ] ) ;
    _sumAfter += aLs [ i - 1 ] ;
    heapifyPriority ( after , - aLs [ i - 1 ] ) ;
    if ( i >= N ) {
      _sumBefore -= heapifyPriority ( before ) ;
      _sumAfter -= - heapifyPriority ( after ) ;
    }
    if ( i >= N - N ) {
      beforeScores . add ( _sumBefore ) ;
      afterScores . add ( _sumAfter ) ;
    }
  }
  return after ;
}
