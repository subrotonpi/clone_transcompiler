public static void main ( String [ ] args ) {
  List < Queen > queenPosList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < 8 ;
  i ++ ) {
    for ( int j = 0 ;
    j < input . length ( ) ;
    j ++ ) {
      char c = input . charAt ( j ) ;
      if ( c == 'Q' ) {
        queenPosList . add ( new Queen ( i , j ) ) ;
      }
    }
  }
  if ( ! initialCheck ( queenPosList , queenCnt = 3 ) ) {
    System . out . println ( "No Answer" ) ;
    return ;
  }
  Queen res = putQueen ( queenPosList , queenCnt = 3 ) ;
  if ( res != null ) {
    String [ ] [ ] resMap = new String [ 8 ] [ 8 ] ;
    for ( int j = 0 ;
    j < 8 ;
    j ++ ) {
      resMap [ j ] [ 0 ] = res . contains ( new Queen ( i , j ) ) ? "Q" : "." ;
      for ( int i = 0 ;
      i < 8 ;
      i ++ ) {
        resMap [ j ] [ 1 ] = res . contains ( new Queen ( i , j ) ) ? "Q" : "." ;
      }
      for ( int i = 0 ;
      i < 8 ;
      i ++ ) {
        System . out . println ( Arrays . toString ( resMap [ i ] ) ) ;
      }
      return ;
    }
    System . out . println ( "No Answer" ) ;
  }
  /* List<Queen> queenPosYList = queenPosList.stream().map(y->y.equals("Y")).collect(Collectors.toList());
  List<Queen> queenPosXList = queenPosList.stream().map(x->x.equals("X")).collect(Collectors.toList());
  if (queenPosYList.size() < 3 || queenPosXList.size() < 3) {
  return;
  }*/
  List < Queen > queenPosYList = queenPosYList . stream ( ) . map ( y -> y . equals ( "Y" ) ) . collect ( Collectors . toList ( ) ) ;
  