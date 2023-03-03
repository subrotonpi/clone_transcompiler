static final int dp ( int M , int V , int [ ] values , boolean changeable ) throws FileNotFoundException {
  final int IMPOSSIBLE = 99999999 ;
  class Solver {
    int M ;
    int [ ] values ;
    int [ ] changeable ;
    int [ ] mem = new int [ M ] ;
  }
  int i ;
  String prefix ;
  int res ;
  String input = new File ( prefix + ".in" ) . getAbsolutePath ( ) ;
  File output = new File ( prefix + ".out" ) ;
  String line = input . readLine ( ) . trim ( ) ;
  for ( i = 1 ;
  i < ( M + 1 ) ;
  i ++ ) {
    line = input . readLine ( ) . trim ( ) ;
    final int [ ] values = new int [ M ] ;
    changeable = new int [ M ] ;
    for ( int j = 0 ;
    j <= ( M - 1 ) / 2 ;
    j ++ ) {
      final int G = Integer . parseInt ( line ) ;
      values [ j ] = G ;
      if ( j == 1 ) {
        changeable [ j ] = i + 1 ;
      }
    }
    for ( int j = 0 ;
    j <= ( M + 1 ) / 2 ;
    j ++ ) {
      line = input . readLine ( ) . trim ( ) ;
      int l = Integer . parseInt ( line ) ;
      values [ j ] = l ;
      if ( j == 0 ) {
        res = handleCase ( M , V , values , changeable ) ;
        if ( res >= IMPOSSIBLE ) {
          System . out . println ( "Case #" + j + ": IMPOSSIBLE" + "\n" ) ;
        }
        else {
          res = l + r ;
        }
      }
      else {
        l = dp ( 2 * j , 1 ) ;
        r = dp ( 2 * j + 1 , 1 ) ;
        if ( l == IMPOSSIBLE && r == IMPOSSIBLE ) {
          res = IMPOSSIBLE ;
        }
        else {
          res = Math . min ( l , r ) ;
        }
      }
    }
    return res ;
  }
  /* Test case */
  Solver s = new Solver ( M , values , changeable ) ;
  return s . dp ( 1 , V ) ;
}
