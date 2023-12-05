static final String getBasinId ( int x , int y , int dir ) throws IOException {
  if ( dir == - 1 ) {
    return ( x , y ) ;
  }
  else if ( dir == 0 ) {
    return ( x , y - 1 ) ;
  }
  else if ( dir == 1 ) {
    return ( x - 1 , y ) ;
  }
  else if ( dir == 2 ) {
    return ( x + 1 , y ) ;
  }
  else {
    return ( x , y + 1 ) ;
  }
  String [ ] fileLines = new String [ 2 ] ;
  int index = 0 ;
  int numMaps = Integer . parseInt ( fileLines [ index ++ ] ) ;
  for ( int unused = 0 ;
  unused < numMaps ;
  unused ++ ) {
    Arrays . fill ( fileLines [ index ++ ] , Integer . parseInt ( fileLines [ index ++ ] ) ) ;
  }
  String [ ] [ ] map = new String [ height ] [ width ] ;
  for ( int i = 0 ;
  i < height ;
  i ++ ) {
    map [ i ] = new String [ height ] ;
    for ( int j = 0 ;
    j < map [ i ] . length ;
    j ++ ) {
      map [ i ] [ j ] = null ;
    }
  }
  for ( int i = 0 ;
  i < height ;
  i ++ ) {
    int curVal = map [ i ] [ i ] ;
    int minVal = curVal ;
    int minDir = - 1 ;
    if ( y > 0 ) {
      int val = map [ i ] [ y - 1 ] [ i ] ;
      if ( ( val < minVal ) && ( val > minDir ) ) {
        minVal = val ;
        minDir = 0 ;
      }
    }
    if ( x > 0 ) {
      int val = map [ i ] [ x - 1 ] ;
      if ( ( val < minVal ) && ( val > minDir ) ) {
        minVal = val ;
        minDir = 1 ;
      }
    }
    if ( x < xMax - 1 ) {
      int val = map [ i ] [ x + 1 ] ;
      if ( ( val < minVal ) && ( val > minDir ) ) {
        minVal = val ;
        minDir = 2 ;
      }
    }
    if ( y < yMax - 1 ) {
      int val = map [ i ] [ y + 1 ] ;
      if ( ( val < minVal ) && ( val > minDir ) ) {
        minVal = val ;
        minDir = 3 ;
      }
    }
  }
  String strType = ( String ) map [ i ] [ x ]