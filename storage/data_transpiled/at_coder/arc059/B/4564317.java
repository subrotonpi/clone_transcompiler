@ VisibleForTesting static Iterable < Integer > accumulate ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final String S = input . next ( ) ;
  final int N = S . length ( ) ;
  int ansL = - 1 ;
  int ansR = - 1 ;
  if ( N == 2 ) {
    if ( S . charAt ( 0 ) == S . charAt ( 1 ) ) {
      ansL = 1 ;
      ansR = 2 ;
    }
  }
  else {
    for ( int l = 0 ;
    l < N - 2 ;
    l ++ ) {
      if ( S . charAt ( l ) == S . charAt ( l + 1 ) ) {
        ansL = l + 1 ;
        ansR = l + 2 ;
        break ;
      }
      else if ( S . charAt ( l ) == S . charAt ( l + 2 ) ) {
        ansL = l + 1 ;
        ansR = l + 3 ;
        break ;
      }
    }
  }
  return new Iterable < Integer > ( ) ;
}
