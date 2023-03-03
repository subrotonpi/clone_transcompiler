public static int [ ] [ ] solve ( String input ) {
  int N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) , K = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int [ ] p = new int [ N ] ;
  int [ ] q = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . split ( " " ) [ 0 ] ) - 1 ;
    q [ i ] = Integer . parseInt ( input . split ( " " ) [ 1 ] ) - 1 ;
  }
  /* inv */
  int [ ] [ ] res = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    res [ i ] = 0 ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      res [ i ] = 0 ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        res [ i ] = i ;
      }
    }
  }
  /* times */
  int [ ] [ ] md = new int [ 6 ] [ N ] ;
  for ( int i = 0 ;
  i < 6 ;
  i ++ ) {
    md [ 0 ] [ i ] = p [ i ] ;
    md [ 1 ] [ i ] = q [ i ] ;
  }
  for ( int i = 2 ;
  i < 6 ;
  i ++ ) {
    md [ i ] = times ( md [ i - 1 ] , inv ( md [ i - 2 ] ) ) ;
  }
  int [ ] [ ] A = times ( times ( times ( q , inv ( p ) ) , inv ( q ) ) , p ) ;
  int T = ( K - 1 ) / 6 ;
  /* expseq */
  if ( k == 0 ) {
    return new int [ ] [ ] {
      i }
      ;
    }
    else if ( k == 1 ) {
      return new int [ ] {
        i }
        ;
      }
      else if ( k % 2 == 0 ) {
        return new int [ ] {
          i }
          ;
        }
        else {
          return new int [ ] {
            i }
            ;
          }
        }
        