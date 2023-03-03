) public static String D ( String name , String type ) throws IOException {
  String base = name + "-" + type + "." ;
  String [ ] lines = FileUtil . readFileLines ( base + "in" ) ;
  Arrays . sort ( lines ) ;
  int C = Integer . parseInt ( lines [ 0 ] ) ;
  int [ ] [ ] dist = new int [ xrange ( size ) ] [ ] ;
  for ( int i = 0 ;
  i < xrange ( size ) ;
  i ++ ) {
    for ( int j = 0 ;
    j < xrange ( size ) ;
    j ++ ) {
      dist [ i ] [ j ] = getDist ( lines [ i ] , lines [ j ] ) ;
    }
  }
  int [ ] [ ] newgr = split ( newgr ) ;
  while ( newgr . length > 0 ) {
    dist = newgr ;
    newgr = split ( newgr ) ;
  }
  double [ ] [ ] ops = new double [ 2 ] [ ] ;
  for ( int i = 0 ;
  i < gDist . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < gDist [ i ] . length ;
    j ++ ) {
      ops [ i ] [ j ] = gDist [ i ] [ j ] ;
    }
  }
  double [ ] [ ] newops = new double [ 2 ] [ ] ;
  for ( int i = 0 ;
  i < gDist . length ;
  i ++ ) {
    for ( int j = 0 ;
    j < gDist [ i ] . length ;
    j ++ ) {
      for ( int j = 0 ;
      j < gDist [ i ] . length ;
      j ++ ) {
        for ( int j = 0 ;
        j < gDist [ i ] . length ;
        j ++ ) {
          ops [ i ] [ j ] = gDist [ i ] [ j ] ;
        }
      }
    }
    double [ ] [ ] largest = new double [ ] [ ] {
      0 , 0 }
      ;
      double largeDist = - 1 ;
      for ( int a = 0 ;
      a < gDist . length ;
      a ++ ) {
        for ( int b = 0 ;
        b < gDist [ i ] . length ;
        b ++ ) {
          if ( dist [ a ] [ b ] > largeDist ) {
            largeDist = dist [ a ] [ b ] ;
            largest = new double [ ] {
              a , b }
              ;
            }
          }
        }
        return largest ;
      }
      {
        int size = dist . length ;
        double [ ] [ ] dist = new double [ size ] [ size ] ;
        for (