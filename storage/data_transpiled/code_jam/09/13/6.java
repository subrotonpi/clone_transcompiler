private static final MemoFact < Integer , Double > memoFact = new MemoFact < Integer , Double > ( 0 , 1 , 1 , 2 ) {
  private int c , n ;
  @ Override public Double fact ( int x ) {
    assert x >= 0 ;
    if ( memoFact . containsKey ( x ) ) return memoFact . get ( x ) ;
    Double res = fact ( x - 2 ) * x * ( x - 1 ) ;
    memoFact . put ( x , res ) ;
    return res ;
  }
  @ Override public double choose ( int amt , int fro ) {
    assert 0 <= amt && amt <= fro ;
    return fact ( fro ) * 1.0 / fact ( amt ) / fact ( fro - amt ) ;
  }
  private double [ ] calcProb ( int n , int c , int have ) {
    int [ ] match = new int [ c ] ;
    int maxMatch = Math . min ( n , have ) ;
    double [ ] p = new double [ maxMatch + 1 ] ;
    int tot = choose ( n , c ) ;
    for ( int m = 0 ;
    m < maxMatch + 1 ;
    m ++ ) {
      if ( m > have ) continue ;
      if ( n - m > c - have ) continue ;
      p [ m ] = choose ( m , have ) * choose ( n - m , c - have ) / tot ;
    }
    return p ;
  }
  private double [ ] fumble ( int n , int c ) {
    int round = 0 ;
    double [ ] phave = new double [ c + 1 ] ;
    phave [ 0 ] = 1.0 ;
    cost = 0 ;
    double probun = 1.0 ;
    while ( ( round + 1 ) * probun > 1e-8 ) {
      round ++ ;
      double [ ] nextPhave = new double [ c + 1 ] ;
      for ( int have = 0 ;
      have < phave . length ;
      have ++ ) {
        double p = phave [ have ] ;
        if ( p == 0.0 ) continue ;
        double [ ] matchP = calcProb ( n , c , have ) ;
        int start = Math . max ( 0 , have - ( c - n ) ) ;
        for ( int i = 0 ;
        i < matchP . length ;
        i ++ ) {
          double mp = matchP [ i ] ;
          if ( i < start ) continue ;
          nextPhave [ have + n - i ] += p * mp ;
        }
      }
      probun -= nextPhave [ c ] ;
      cost += round * nextPhave [