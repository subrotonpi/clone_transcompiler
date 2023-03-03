@ GwtIncompatible ( "java.util.Scanner" ) public static boolean BladeCheck ( int size ) {
  for ( int r1 = 0 ;
  r1 < R - size + 1 ;
  r1 ++ ) {
    for ( int c1 = 0 ;
    c1 < C - size + 1 ;
    c1 ++ ) {
      int x = r1 + 1 ;
      int y = c1 + 1 ;
      int z = size - 1 ;
      int RowVal = MR [ r1 + size ] [ c1 + size ] + MR [ r1 ] [ c1 ] - MR [ r1 + size ] [ c1 ] - MR [ r1 ] [ c1 + size ] ;
      int ColVal = MC [ r1 + size ] [ c1 + size ] + MC [ r1 ] [ c1 ] - MC [ r1 ] [ c1 + size ] ;
      boolean Match = false ;
      boolean Case = BIG + 1 ;
      while ( ( Case = Case ) > 3 && ! Match ) {
        Case -- ;
        Match = BladeCheck ( Case ) ;
      }
      if ( Match ) {
        System . out . println ( Case ) ;
      }
      else {
        System . out . println ( "IMPOSSIBLE" ) ;
      }
    }
  }
  int T = Integer . parseInt ( scanner . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    int [ ] [ ] MR = new int [ R ] [ C + 1 ] ;
    int [ ] [ ] MR = new int [ R ] [ C + 1 ] ;
    int [ ] [ ] MSum = new int [ R ] [ C + 1 ] ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      MR [ i ] [ j ] = MR [ i ] [ j ] - MR [ i - 1 ] [ j ] + MR [ i ] [ j ] - MR [ i ] [ j ] - MR [ i ] [ j ] - MR [ i ] [ j ] + MR [ i ] [ j ] - MR [ i ] [ j ] - MR [ i ] [ j ] - MR [ i ] [ j ] - MR [ i ] [ j ] + MSum [ i ] [ j ] - MSum [ i ] [ j ] - MSum [ i ] [ j ] ;
    }
    int [ ] [ ] MR = new int [ R ] [ C + 1 ] ;
    for ( int j = 0 ;
    j < R ;
    j