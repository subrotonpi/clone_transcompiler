public static int [ ] [ ] readInputF ( File inputF ) throws IOException {
  PrintWriter output = new PrintWriter ( new FileWriter ( inputF ) ) ;
  final int numCases = Integer . parseInt ( inputF . readLine ( ) ) ;
  final int [ ] [ ] gaps ;
  int [ ] [ ] cActs = new int [ numCases ] [ ] ;
  int [ ] [ ] otherActs = new int [ numCases ] [ ] ;
  for ( int i = 0 ;
  i < numCases ;
  i ++ ) {
    gaps = new int [ ] [ ] ;
    for ( int j = 0 ;
    j < numCases ;
    j ++ ) {
      cActs [ i ] [ j ] = inputF . read ( ) ;
    }
    Arrays . sort ( cActs ) ;
    Arrays . sort ( otherActs ) ;
    int [ ] [ ] cFloodFill = new int [ ] [ ] ;
    int [ ] [ ] jFloodFill = new int [ ] [ ] {
    }
    ;
    if ( cActs . length == 0 ) {
      return numSwaps ;
    }
    else if ( cActs . length == 0 ) {
      gaps = new int [ ] [ ] ;
      for ( int j = 0 ;
      j < numCases ;
      j ++ ) {
        gaps [ j ] = gapActs [ j ] [ 0 ] ;
      }
      Arrays . sort ( cActs ) ;
      while ( otherActs [ j ] [ 0 ] < cActs [ 0 ] [ 0 ] && otherActs [ j ] [ 0 ] > cActs [ j ] [ 1 ] ) {
        gaps [ j ] = new int [ ] {
          cActs [ j ] [ 0 ] + ( j - 1 ) , cActs [ j ] [ 1 ] }
          ;
        }
        for ( int j = 0 ;
        j < numCases ;
        j ++ ) {
          gaps [ j ] = gaps [ j ] [ 1 ] ;
        }
      }
      else {
        gaps = new int [ ] [ ] ;
        for ( int j = 0 ;
        j < numCases ;
        j ++ ) {
          if ( cActs [ j ] [ 0 ] > cActs [ j ] [ 0 ] ) {
            gaps [ j ] [ 0 ] = cActs [ j ] [ 0 ] + ( j - 1 ) ;
          }
        }
        Arrays . sort ( cActs ) ;
      }
      Arrays . sort ( gaps ) ;
      Arrays . sort ( cActs ) ;
      Arrays . sort ( otherActs ) ;
      if ( cAc @ @