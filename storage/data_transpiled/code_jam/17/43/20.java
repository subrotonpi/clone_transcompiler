@ Nullable public static String print ( ) {
  final int r = Integer . parseInt ( input ( ) ) ;
  final int c = Integer . parseInt ( input ( ) ) ;
  final int [ ] tiles = new int [ r ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    tiles [ i ] = new int [ ] {
      input . nextInt ( ) }
      ;
    }
    final StringBuilder result = new StringBuilder ( ) ;
    for ( int i = 0 ;
    i < tiles . length ;
    i ++ ) {
      result . append ( " " ) ;
    }
    final char [ ] [ ] cf = new char [ 4 ] [ ] ;
    for ( int i = 0 ;
    i < c ;
    i ++ ) {
      final char [ ] v = new char [ 4 ] ;
      for ( int j = 0 ;
      j < v . length ;
      j ++ ) {
        final char tr = v [ j ] ;
        final int id = i * c [ j ] + 1 ;
        if ( ! tr ) {
          result . append ( tr ) ;
        }
      }
      for ( int a = 0 ;
      a < v . length ;
      a ++ ) {
        if ( i == 0 ) {
          result . append ( " " ) ;
        }
      }
      final char [ ] dir = new char [ 4 ] ;
      for ( int j = 0 ;
      j < v . length ;
      j ++ ) {
        final char tr = v [ j ] ;
        final int id = i * c [ j ] + 1 ;
        if ( ! tr ) {
          result . append ( tr ) ;
        }
      }
      for ( int a = 0 ;
      a < v . length ;
      a ++ ) {
        if ( i == 0 ) {
          result . append ( " " ) ;
        }
      }
      final char [ ] cf = new char [ 4 ] ;
      for ( int i = 0 ;
      i < c ;
      i ++ ) {
        final char tr = v [ i ] ;
        final int id = i * c [ j ] + 1 ;
        if ( ! tr ) {
          result . append ( tr ) ;
        }
      }
      for ( int a = 0 ;
      a < v . length ;
      a ++ ) {
        if ( i == 0 ) {
          result . append ( " " ) ;
        }
      }
      final char [ ] dir = new char [ 4 ] ;
      for ( int i = 0 ;
      i < v . length ;
      i ++ ) {
        final char tr = v [ i ] ;
        final int id = i * c [ j ] + 1 ;
        if ( ! tr ) {
          result . append ( tr