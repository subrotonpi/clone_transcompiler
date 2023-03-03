static final Scanner in = new Scanner ( System . in ) {
  private int M , K ;
  {
    int N = 0 , M = 0 , K = 0 ;
    /* read list */
    int [ ] [ ] M = new int [ M ] [ M ] ;
    /* read list */
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      M [ i ] [ 0 ] = Integer . parseInt ( M [ i ] [ 0 ] ) ;
    }
    /* read int */
    int s = M [ N ] [ 0 ] ;
    /* print maze */
    for ( char [ ] c : M ) {
      System . out . println ( Arrays . toString ( c ) ) ;
    }
    /* maze */
    int [ ] [ ] M = new int [ M [ M ] . length ] [ M ] ;
    for ( int i = 0 ;
    i < M . length ;
    i ++ ) {
      int [ ] col = new int [ M [ M ] . length ] ;
      for ( int j = 0 ;
      j < M [ M ] . length ;
      j ++ ) {
        int pos = j + i * M [ M ] [ j ] ;
        boolean bit = M [ M ] [ i ] [ j ] != '.' ;
        col [ m ] = bit ? '*' : '.' ;
      }
      M [ M ] [ i ] = col ;
    }
    /* score */
    int n = M . length ;
    int m = M [ 0 ] . length ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < m ;
      j ++ ) {
        if ( M [ i ] [ j ] != '.' ) {
          M [ i ] [ j ] = 'O' ;
          break ;
        }
      }
      for ( int j = m - 1 ;
      j >= 0 ;
      j -- ) {
        if ( M [ i ] [ j ] != '.' ) {
          M [ i ] [ j ] = 'O' ;
          break ;
        }
      }
    }
    int s = 0 ;
    for ( int j = 0 ;
    j < m ;
    j ++ ) {
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( M [ i ] [ j ] == '*' ) s ++ ;
      }
    }
    return s ;
  }
}
