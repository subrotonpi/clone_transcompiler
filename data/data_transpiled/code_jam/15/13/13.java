@ VisibleForTesting static int [ ] [ ] squirrelRadar ( final int x0 , final int y0 , final int x1 , final int y1 , final int x2 , final int y2 ) throws IOException {
  final int lx = x1 - x0 ;
  final int ly = y1 - y0 ;
  final int rx = x2 - x1 ;
  final int ry = y2 - y1 ;
  return squirrelRadar ( x0 , y0 , x1 , y1 ) -> {
    int trees = Integer . parseInt ( inf . next ( ) . trim ( ) ) ;
    int [ ] treePositions = new int [ trees ] ;
    for ( int i = 0 ;
    i < trees ;
    i ++ ) {
      treePositions [ i ] = Integer . parseInt ( inf . next ( ) . trim ( ) ) ;
    }
    for ( int t = 0 ;
    t < trees ;
    t ++ ) {
      treePositions [ t ] = Integer . parseInt ( inf . next ( ) . trim ( ) ) ;
    }
    outf . printf ( "Case #%d:\n%s\n" , i + 1 , Arrays . toString ( squirrels ) ) ;
  }
  ;
}
