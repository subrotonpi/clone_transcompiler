static int [ ] [ ] readValues ( ) {
  final int [ ] [ ] c = new int [ 1 ] [ 1 ] ;
  int i ;
  int j ;
  int side = 0 ;
  for ( i = 0 ;
  i < 1 + input . length ;
  i ++ ) {
    c [ i ] [ j ] = i ;
  }
  System . err . println ( ) ;
  for ( int caseIndex = 1 ;
  caseIndex < input . length ;
  caseIndex ++ ) {
    k = Integer . parseInt ( input . substring ( 0 , caseIndex ) ) ;
    c [ 0 ] [ j ] = i ;
    int i = 0 ;
    int j = k - 1 ;
    for ( int u = 0 ;
    u < 2 * k - 1 ;
    u ++ ) {
      int [ ] v = readValues ( ) ;
      for ( int m = 0 ;
      m < v . length ;
      m ++ ) {
        c [ i + m ] [ j + m ] = v [ m ] ;
      }
      if ( j > 0 ) {
        j -- ;
      }
      else {
        i ++ ;
      }
    }
    int r = 0 ;
    boolean done = false ;
    do {
      int ci = k - 1 - r ;
      int cj = k - 1 - r ;
      for ( int step = 0 ;
      step < Math . max ( 1 , 4 * r ) ;
      step ++ ) {
        boolean ok = true ;
        for ( int i = 0 ;
        i < k ;
        i ++ ) {
          for ( int j = 0 ;
          j < k ;
          j ++ ) {
            int si = j + ( - cj + ci ) / 2 ;
            int sj = i + ( cj - ci ) / 2 ;
            if ( si >= 0 && si < k && sj >= 0 && sj < k ) {
              ok &= c [ i ] [ j ] == c [ si ] [ sj ] ;
            }
            si = - j + ( cj + ci ) / 2 ;
            sj = - i + ( cj + ci ) / 2 ;
            if ( si >= 0 && si < k && sj >= 0 && sj < k ) {
              ok &= c [ i ] [ j ] == c [ si ] [ sj ] ;
            }
            if ( ! ok ) {
              break ;
            }
          }
          if ( ! ok ) {
            break ;
          }
        }
        if ( ok ) {
          done = true ;
          break ;
        }
        if ( step < r ) {
          ci += 2 ;
        }
        else if ( step < 2 * r ) {
          cj += 2 ;
        }
        else if ( step < 3 * r