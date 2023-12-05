@ VisibleForTesting static final String solve ( String [ ] args ) throws IOException {
  final Class < Target > clazz = Target . class ;
  final int o = 0 ;
  final int b = 0 ;
  final int len = args . length ;
  final int i ;
  final int [ ] [ ] targets = new int [ len ] [ 2 ] ;
  int posO = 0 ;
  int posB = 0 ;
  for ( i = 0 ;
  i < len ;
  i ++ ) {
    targets [ i ] = new Target ( ) ;
  }
  for ( i = len ;
  i > 0 ;
  i -- ) {
    if ( args [ i - 1 ] [ 0 ] . equals ( "O" ) ) {
      posO = args [ i - 1 ] [ 1 ] ;
    }
    else {
      posB = args [ i - 1 ] [ 1 ] ;
    }
    targets [ i - 1 ] [ 0 ] = new Target ( ) ;
  }
  for ( i = len ;
  i > 0 ;
  i -- ) {
    if ( args [ i ] [ 0 ] . equals ( "O" ) ) {
      posO = args [ i ] [ 1 ] ;
    }
    else {
      posB = args [ i ] [ 1 ] ;
    }
    targets [ i - 1 ] [ 0 ] . o = posO ;
    targets [ i - 1 ] [ 1 ] . b = posB ;
  }
  print ( "Targets" , targets ) ;
  posO = 1 ;
  posB = 1 ;
  int time = 0 ;
  for ( i = 0 ;
  i < len ;
  i ++ ) {
    if ( args [ i ] [ 0 ] . equals ( "O" ) ) {
      final int adv = Math . abs ( posO - args [ i ] [ 1 ] ) + 1 ;
      posO = args [ i ] [ 1 ] ;
      final int needB = targets [ i ] [ 1 ] . b - posB ;
      if ( Math . abs ( needB ) <= adv ) {
        posB = targets [ i ] [ 1 ] . b ;
      }
      else if ( needB < 0 ) {
        posB -= adv ;
      }
      else {
        posB += adv ;
      }
    }
    else {
      final int adv = Math . abs ( posB - args [ i ] [ 1 ] ) + 1 ;
      posB = args [ i ] [ 1 ] ;
      final int needO = targets [ i ] [ 0 ] . o - posO ;
      if ( Math . abs ( needO ) <= adv ) {
        posO = targets [ i ]