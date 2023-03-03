@ VisibleForTesting static boolean println ( ) throws IOException {
  VERBOSE = true ;
  VERBOSE = false ;
  class Encoder implements Encoder {
    int [ ] known = Maps . newHashKeys ( ) ;
    char next = 'a' ;
    @ Override public char encode ( String key ) {
      if ( ! ( known [ key ] = next ) ) {
        known [ key ] = next ;
        next = ( char ) ( next + 1 ) ;
      }
      return known [ key ] ;
    }
  }
  int [ ] [ ] solve ( int h , int w , char [ ] [ ] altitudes ) {
    char [ ] [ ] struc = new char [ h ] [ w ] ;
    for ( int rowNo = xrange ( 0 , w ) ;
    rowNo < h ;
    rowNo ++ ) {
      for ( int colNo = xrange ( 0 , w ) ;
      colNo < w ;
      colNo ++ ) {
        struc [ rowNo ] [ colNo ] = Integer . parseInt ( input . nextLine ( ) ) ;
      }
    }
    return solve ( h , w , altitudes ) ;
  }
  private char [ ] [ ] solve ( int h , int w , char [ ] [ ] [ ] seasons ) {
    char [ ] [ ] struc = new char [ h ] [ w ] ;
    for ( int rowNo = xrange ( 0 , h ) ;
    rowNo < h ;
    rowNo ++ ) {
      for ( int colNo = xrange ( 0 , w ) ;
      colNo < w ;
      colNo ++ ) {
        int [ ] r = new int [ h ] ;
        if ( rowNo > 0 ) r [ rowNo ] = new int [ ] {
          rowNo - 1 , colNo }
          ;
          if ( colNo > 0 ) r [ colNo ] = new int [ ] {
            rowNo , colNo - 1 }
            ;
            if ( colNo < w - 1 ) r [ colNo ] = new int [ ] {
              rowNo , colNo + 1 }
              ;
              if ( rowNo < h - 1 ) r [ rowNo + 1 ] = new int [ ] {
                rowNo + 1 , colNo }
                ;
                return r ;
              }
            }
            if ( VERBOSE ) {
              System . out . println ( "Alt" ) ;
              println ( seasons ) ;
            }
            while ( true ) {
              int changedCount = 0 ;
              if ( VERBOSE ) println ( struc ) ;
              for ( int rowNo = xrange ( 0 , h ) ;
              rowNo < h ;
              rowNo ++ ) {
                for ( int colNo = xrange ( 0