static final Codejam . Graph2DGraph < Integer > G = new Codejam . Graph2DGraph < Integer > ( ) {
  @ Override public int readInput ( ) {
    return 0 ;
  }
  @ Override public int readOutput ( ) {
    return 0 ;
  }
  @ Override public int readOutput ( ) {
    return 0 ;
  }
  @ Override public int readOutput ( ) {
    return 0 ;
  }
  @ Override public int readOutput ( ) {
    int T = gcj . readInput ( "i" ) ;
    for ( int t = 0 ;
    t < T ;
    t ++ ) {
      int W = gcj . readInput ( "i i i->" , "i[]" ) ;
      int H = gcj . readInput ( "i i i->" , "i[]" ) ;
      int B = gcj . readInput ( "i i i->" , "i[]" ) ;
      int [ ] buildings = gcj . readInput ( "i i i->" , "i[]" ) ;
      Grid2DGraph < Integer > G = gph . grid2DGraph ( W , H ) ;
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        G . addEdge ( "S" , new Integer ( x , 0 ) ) ;
        G . addEdge ( "T" , new Integer ( x , H - 1 ) ) ;
      }
      for ( int a = 0 ;
      a < G . edges ( ) ;
      a ++ ) {
        int b = G . edges ( ) [ a ] ;
        G . edges ( ) [ b ] . setCapacity ( 1 ) ;
      }
      for ( int l = 0 ;
      l < buildings . length ;
      l ++ ) {
        int b = buildings [ l ] ;
        int r = buildings [ b ] ;
        int top = buildings [ b ] ;
        for ( int i = l ;
        i <= r ;
        i ++ ) {
          for ( int j = b ;
          j <= top ;
          j ++ ) {
            G . removeNode ( new Integer ( i ) ) ;
            G . removeNode ( new Integer ( j ) ) ;
          }
        }
      }
      System . out . println ( "Case #" + ( t + 1 ) + ":" + gph . nodeConnectivity ( G , "S" , "T" ) ) ;
      return 0 ;
    }
  }
}
