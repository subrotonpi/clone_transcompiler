static final Scanner inpl = new Scanner ( System . in ) {
  @ Override public List < Integer > next ( ) {
    return Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  @ Override public int solve ( ) {
    int N = inpl . nextInt ( ) ;
    int K = inpl . nextInt ( ) ;
    int [ ] A = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    if ( K == 1 ) return N ;
    int prev = A [ 0 ] ;
    int ans = 0 , cnt = 1 ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      cnt ++ ;
      if ( A [ i ] <= prev ) cnt = 1 ;
      if ( cnt >= K ) ans ++ ;
      prev = A [ i ] ;
    }
    return ans ;
  }
}
