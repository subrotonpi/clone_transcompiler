static String [ ] processAlignment ( boolean [ ] alignment , String [ ] beams , int emptyCells ) {
  String [ ] [ ] a = new String [ alignment . length ] [ ] ;
  List < String [ ] > l = new ArrayList < String [ ] > ( ) ;
  for ( int beam = 0 ;
  beam < beams . length ;
  beam ++ ) {
    final int x = beams [ beam ] . length ;
    if ( alignment [ beam ] != null ) {
      if ( alignment [ beam ] == false ) {
        String [ ] ll = h ;
        if ( grid [ y ] . charAt ( x - dx ) == '|' ) {
          ll = v ;
        }
        for ( String s : ll ) {
          l . add ( s ) ;
        }
      }
    }
    String [ ] sol = processAlignment ( alignment , beams , emptyCells ) ;
    if ( sol == null ) {
      return new String [ ] {
        "IMPOSSIBLE" }
        ;
      }
      String [ ] [ ] g = new String [ l . size ( ) ] [ ] ;
      for ( int y = 0 ;
      y < l . size ( ) ;
      y ++ ) {
        if ( l [ y ] . charAt ( x ) != '|' ) {
          l [ y ] [ x ] = "|" ;
        }
      }
      for ( int i = 0 ;
      i < l . size ( ) ;
      i ++ ) {
        int x = l [ y ] . charAt ( i ) ;
        if ( l [ y ] . charAt ( x ) != '|' ) {
          l [ y ] [ x ] = "|" ;
        }
      }
      String [ ] result = new String [ l . size ( ) ] [ ] ;
      for ( int i = 0 ;
      i < l . size ( ) ;
      i ++ ) {
        if ( l [ i ] . length ( ) != 1 ) {
          int beam = l [ i ] . charAt ( 0 ) ;
          String d = l [ i ] . substring ( 1 ) ;
          if ( a [ beam ] . length ( ) != 0 && a [ beam ] . charAt ( d ) != '|' ) {
            return null ;
          }
          if ( a [ beam ] . charAt ( d ) != '|' ) {
            modified = true ;
            a [ beam ] = d ;
          }
        }
      }
      if ( modified ) {
        return processAlignment ( a , beams , emptyCells ) ;
      }
      for ( int i = 0 ;
      i < l . size ( ) ;
      i ++ ) {
        String [ ] result =