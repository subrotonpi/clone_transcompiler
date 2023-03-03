public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int S [ ] = {
    c == '1' ? 1 : c == '0' ? - 1 : 0 }
    ;
    int mod = 10 * 9 + 7 ;
    int [ ] [ ] nextDP = new int [ K + 2 ] [ K + 2 ] ;
    nextDP [ 0 ] [ 0 ] = 1 ;
    int prevIndex = Integer . MIN_VALUE ;
    for ( int i = 0 , n = S . length ;
    i < n ;
    i ++ ) {
      int [ ] dp = nextDP [ i ] ;
      nextDP [ i ] = new int [ K + 2 ] ;
      for ( int j = 0 ;
      j < K ;
      j ++ ) {
        nextDP [ i ] [ j ] = 1 ;
      }
      prevIndex = Integer . MIN_VALUE ;
    }
    for ( int i = 0 , n = S . length ;
    i < n ;
    i ++ ) {
      int [ ] dp = nextDP [ i ] ;
      nextDP [ i ] = new int [ K + 2 ] ;
      for ( int j = 0 ;
      j < K ;
      j ++ ) {
        int onePrev = prevIndex [ j ] ;
        int oneCount = prevIndex [ j ] ;
        int oneNext = nextIndex [ j ] ;
        int minus = dp [ onePrev ] ;
        int plus = dp [ oneNext ] ;
        if ( n > 0 ) {
          for ( int zeroNext = 1 ;
          zeroPrev < Math . min ( i , K - oneCount + 1 ) ;
          zeroNext ++ ) {
            int value = dp [ oneNext ] ;
            plus += value ;
          }
        }
        else if ( n < 0 ) {
          for ( int zeroNext = 1 ;
          zeroNext < Math . min ( i , K - oneCount + 1 ) ;
          zeroNext ++ ) {
            int value = dp [ oneNext ] ;
            minus += value ;
          }
        }
        else {
          for ( int zeroNext = 1 ;
          zeroPrev < Math . min ( i , K - oneCount + 1 ) ;
          zeroNext ++ ) {
            int value = dp [ oneNext ] ;
            plus += value ;
            minus += value ;
          }
        }
      }
    }
    System . out . println ( Integer . toString ( nextDP [ i ] [ 0 ] ) % mod ) ;
    return K ;
  }
  