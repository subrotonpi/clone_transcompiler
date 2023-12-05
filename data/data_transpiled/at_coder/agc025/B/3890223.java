public static void BigCombination ( ) {
  int mod = 10 * 9 + 7 ;
  int maxN = 10 * 6 ;
  int [ ] factorial = new int [ maxN + 1 ] ;
  factorial [ 0 ] = 1 ;
  factorial [ 1 ] = 1 ;
  factorial [ maxN + 1 ] = 1 ;
  int maxInv = 1 , x = factorial [ factorial . length - 1 ] ;
  for ( int i = Integer . highestOneBit ( mod - 2 ) ;
  i >= 1 ;
  i -- ) {
    if ( i == "1" ) {
      maxInv = maxInv * x % mod ;
    }
    x = x * x % mod ;
  }
  inverse = ( new LinkedList < Integer > ( ) ) . add ( maxInv ) . add ( Collections . singletonList ( maxInv ) ) . add ( Collections . singletonList ( Collections . singletonList ( maxN ) ) . add ( Collections . singletonList ( 0 ) ) ) . add ( Collections . singletonList ( Collections . singletonList ( n ) ) ) . toArray ( ) ;
  int [ ] getCombination = new int [ maxN + 1 ] ;
  for ( int n = 0 ;
  n < factorial . length ;
  n ++ ) {
    int r = factorial [ n ] ;
    int N = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    int A = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    int B = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    int K = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
    int mod = 998244353 ;
    BigCombination bigcomb = new BigCombination ( mod , N ) ;
    Method getcomb = bigcomb . getClass ( ) . getMethod ( "getCombination" ) ;
    int answer = 0 ;
    for ( int aCount = 0 ;
    aCount < N + 1 ;
    aCount ++ ) {
      if ( ( K - aCount * A ) % B == 0 && 0 <= ( K - aCount * A ) / B <= N ) {
        int bCount = ( K - aCount * A ) / B ;
        answer = ( answer + getcomb . invoke ( N , aCount ) * getcomb . invoke ( N , bCount ) ) % mod ;
      }
    }
    System . out . println ( answer ) ;
  }
}
