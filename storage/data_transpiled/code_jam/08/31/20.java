static final int N = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) {
  final int N = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
  {
    int P = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
    int K = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
    int L = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
    int [ ] probs = new int [ N ] ;
    for ( int i = 0 ;
    i < L ;
    i ++ ) {
      probs [ i ] = Integer . parseInt ( new Scanner ( System . in ) . nextLine ( ) ) ;
    }
    Arrays . sort ( probs , Collections . reverseOrder ( ) ) ;
    int p = 1 ;
    int k = 0 ;
    int ret = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      k ++ ;
      if ( k > K ) {
        k = 1 ;
        p ++ ;
      }
      ret += p * probs [ i ] ;
    }
    return ret ;
  }
}
