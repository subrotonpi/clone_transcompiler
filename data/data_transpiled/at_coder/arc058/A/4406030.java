public static int N = Integer . parseInt ( input ) {
  int [ ] D = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] kazu = {
    9 , 8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 , 0 }
    ;
    for ( int i = 0 ;
    i < D . length ;
    i ++ ) {
      kazu [ i ] = i ;
    }
    Arrays . sort ( kazu ) ;
    int [ ] p = new int [ N ] ;
    int m = Integer . toString ( N ) . length ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      p [ i ] = kazu [ 0 ] * ( 10 * i ) ;
    }
    Arrays . sort ( p , Collections . reverseOrder ( ) ) ;
    int j = 0 ;
    while ( j < m ) {
      for ( int i = 1 ;
      i < kazu . length ;
      i ++ ) {
        if ( Integer . toString ( p [ j ] ) - p [ j ] + kazu [ i ] * ( 10 * ( m - j - 1 ) ) >= N ) {
          p [ j ] = kazu [ i ] * ( 10 * ( m - j - 1 ) ) ;
        }
        else {
          break ;
        }
      }
      j ++ ;
    }
    int ans ;
    if ( Integer . toString ( p [ 0 ] ) < N ) {
      if ( kazu [ m - 1 ] != 0 ) {
        ans = 0 ;
        for ( int i = 0 ;
        i < m + 1 ;
        i ++ ) {
          ans += kazu [ m - 1 ] * ( 10 * i ) ;
        }
      }
      else {
        ans = kazu [ m - 2 ] * ( 10 ) * m ;
      }
    }
    else {
      ans = Integer . toString ( p [ 0 ] ) ;
    }
    return ans ;
  }
  