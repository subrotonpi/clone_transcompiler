static final Scanner fin = new Scanner ( System . in ) {
  private int [ ] [ ] rows = new int [ 2 ] [ 2 ] ;
  {
    int k = 0 ;
    int shift ;
    int result = 0 ;
    for ( int p = 0 ;
    p < rows . length ;
    p ++ ) {
      boolean working = true ;
      for ( int [ ] r : rows ) {
        for ( int i = 0 ;
        i < r . length ;
        i ++ ) {
          int a = r [ i ] ;
          int q = i * 2 + k - r . length ;
          int o = p * 2 - q ;
          int j = ( o + r . length - k ) / 2 ;
          if ( j < 0 || j >= r . length ) continue ;
          if ( a != r [ j ] ) {
            working = false ;
            break ;
          }
        }
      }
      if ( working ) {
        shift = Math . abs ( ( k - 1 ) - p ) ;
        m [ p ] = shift ;
      }
    }
    return new MinInt ( m ) ;
  }
  private int size ( int k ) {
    int t = 0 ;
    for ( int i = 0 ;
    i < 2 * k - 1 ;
    i ++ ) {
      t += k - Math . abs ( k - i - 1 ) ;
    }
    return t ;
  }
  private int N = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= N ;
  testCase ++ ) {
    int k = Integer . parseInt ( fin . nextLine ( ) ) ;
    rows = new int [ N ] [ ] ;
    S = 2 * k - 1 ;
    for ( int i = 0 ;
    i < S ;
    i ++ ) {
      rows [ i ] = Integer . parseInt ( fin . nextLine ( ) ) ;
    }
    int [ ] [ ] cols = new int [ S ] [ S ] ;
    for ( int i = 0 ;
    i < S ;
    i ++ ) {
      cols [ i ] = new int [ S ] ;
      for ( int j = 0 ;
      j < cols . length ;
      j ++ ) {
        cols [ j ] [ j ] = i ;
      }
    }
    for ( int i = 0 ;
    i < S ;
    i ++ ) {
      rows [ i ] = rows [ i ] ;
      for ( int j = 0 ;
      j < cols . length ;
      j ++ ) {
        int p = j ;
        int a = j ;
        int c = 2 * p + k - row . length ;
        cols [ c ] [ j ] = a ;
      }
    }
    a = best ( k , rows