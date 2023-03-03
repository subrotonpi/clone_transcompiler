@ VisibleForTesting static int [ ] [ ] createBlocks ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  int Z = Integer . parseInt ( input . nextLine ( ) ) ;
  Map < Character , Integer > colorMap = new HashMap < > ( ) ;
  int [ ] colorPts = new int [ M + 1 ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final char c = ( char ) ( input . nextLine ( ) ) ;
    final String p = input . nextLine ( ) ;
    colorMap . put ( c , i ) ;
    colorPts [ i ] = Integer . parseInt ( p ) ;
  }
  List < Integer > blocks = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < blocks . size ( ) ;
  i ++ ) {
    blocks . add ( colorMap . get ( i ) ) ;
  }
  int [ ] [ ] unionBitsets = new int [ 2 * M ] [ M ] ;
  for ( int j = 0 ;
  j < M ;
  j ++ ) {
    unionBitsets [ j ] = unionBitsets [ j ] [ i ] ;
  }
  int [ ] [ ] comboBonus = new int [ M + 1 ] [ M + 1 ] ;
  for ( int j = 1 ;
  j <= M ;
  j ++ ) {
    unionBitsets [ j ] [ j ] = Y ;
  }
  for ( int i = 1 ;
  i <= M ;
  i ++ ) {
    int [ ] nextDP = new int [ M + 1 ] ;
    nextDP [ 0 ] [ 0 ] = Double . MAX_VALUE ;
    nextDP [ 0 ] [ 0 ] = 0 ;
    for ( int color : blocks ) {
      int point = colorPts [ color ] ;
      int colorBit = 2 * ( color - 1 ) ;
      int [ ] currentDP = new int [ nextDP . length ] ;
      for ( int i = 0 ;
      i < nextDP . length ;
      i ++ ) {
        int [ ] cbonus = comboBonus [ i ] ;
        for ( int j = 0 ;
        j < nextDP [ i ] ;
        j ++ ) {
          int cv = currentDP [ i ] ;
          int bonus = cbonus [ j ] ;
          if ( nextDP [ i ] < cv + point + bonus ) {
            nextDP [ i ] [ j ] = cv + point + bonus ;
          }
        }
      }
      