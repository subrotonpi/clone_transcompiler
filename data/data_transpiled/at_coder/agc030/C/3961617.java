@ VisibleForTesting static int [ ] getStdDev ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( K <= 500 ) {
    System . out . println ( K ) ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      int [ ] Cout = new int [ K ] ;
      for ( int n = 0 ;
      n < K ;
      n ++ ) {
        Cout [ n ] = i + 1 ;
      }
      System . out . println ( Arrays . toString ( Cout ) ) ;
    }
  }
  else {
    int lim = ( int ) Math . sqrt ( K ) ;
    for ( int i = 2 ;
    i <= lim ;
    i ++ ) {
      if ( K % ( i * i * i ) == 0 ) {
        System . out . println ( K / i ) ;
        for ( int n = 0 ;
        n < K / i ;
        n ++ ) {
          int [ ] Cout = new int [ K ] ;
          for ( int mod = 0 ;
          mod < K / i ;
          mod ++ ) {
            Cout [ mod ] = i * n + ( mod % i ) + 1 ;
          }
          System . out . println ( Arrays . toString ( Cout ) ) ;
        }
        break ;
      }
    }
    else {
      int n = 2 * Math . ceil ( K / 4 ) ;
      System . out . println ( n ) ;
      for ( int raw = 0 ;
      raw < n ;
      raw ++ ) {
        int [ ] Cout ;
        if ( raw % 2 == 0 ) {
          Cout = new int [ n ] ;
          for ( int c = 0 ;
          c < n ;
          c ++ ) {
            Cout [ c ] = ( raw + c ) % n + 1 ;
          }
        }
        else {
          Cout = new int [ n ] ;
          for ( int c = 0 ;
          c < n ;
          c ++ ) {
            Cout [ c ] = n + 1 + ( raw + c ) % n ;
          }
          for ( int i = 0 ;
          i < n ;
          i ++ ) {
            if ( Cout [ i ] > K ) Cout [ i ] -= n ;
          }
        }
        System . out . println ( Arrays . toString ( Cout ) ) ;
      }
    }
  }
  return null ;
}
