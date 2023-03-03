static final int [ ] [ ] solve ( int [ ] [ ] init ) throws IOException {
  final int N = init . length ;
  final int [ ] [ ] sol = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sol [ i ] = init [ i ] ;
  }
  final int [ ] rowOccpd = init . length ;
  final int [ ] colOccpd = init . length ;
  for ( int r = 0 ;
  r < N ;
  r ++ ) {
    for ( int c = 0 ;
    c < N ;
    c ++ ) {
      if ( rowOccpd [ r ] [ c ] == 0 && colOccpd [ r ] [ c ] == 0 ) {
        rowOccpd [ r ] [ c ] = 1 ;
      }
    }
    final int [ ] [ ] edges = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edges [ i ] [ r ] = rowOccpd [ r ] [ c ] ;
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      for ( int r = 0 ;
      r < N ;
      r ++ ) {
        for ( int c = 0 ;
        c < N ;
        c ++ ) {
          if ( rowOccpd [ r ] [ c ] == 0 && colOccpd [ r ] [ c ] == 0 ) {
            sol [ r ] [ c ] = rowOccpd [ r ] [ c ] ;
          }
        }
      }
      final int [ ] [ ] edges = new int [ N ] [ M ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        edges [ i ] [ r ] = rowOccpd [ r ] [ c ] ;
      }
      final int [ ] [ ] edges = new int [ N ] [ M ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        edges [ i ] [ r ] = rowOccpd [ r ] [ c ] ;
      }
      final int [ ] [ ] edges = new int [ N ] [ M ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        edges [ i ] [ r ] = rowOccpd [ r ] [ i ] ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        edges [ i ] [ r ] = rowOccpd [ r ] [ i ] ;
      }
    }
    