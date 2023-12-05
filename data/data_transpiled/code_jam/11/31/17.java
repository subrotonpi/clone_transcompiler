static String process ( String data ) throws IOException {
  StringTokenizer st = new StringTokenizer ( data ) ;
  int rows = Integer . parseInt ( st . nextToken ( ) ) ;
  int cols = Integer . parseInt ( st . nextToken ( ) ) ;
  String [ ] [ ] picture = new String [ rows ] [ cols ] ;
  for ( int r = 0 ;
  r < rows ;
  r ++ ) {
    String str = st . nextToken ( ) ;
    str = str . replace ( '#' , '0' ) ;
    str = str . trim ( ) ;
    picture [ r ] = new String [ ] {
      str }
      ;
    }
    String outstr = "" ;
    for ( int r = 0 ;
    r < rows ;
    r ++ ) {
      String outrow = "" ;
      for ( int c = 0 ;
      c < cols ;
      c ++ ) {
        if ( ( picture [ r ] [ c ] == '0' ) && ( picture [ r ] [ c + 1 ] == '0' ) && ( picture [ r + 1 ] [ c + 1 ] == '0' ) ) {
          try {
            if ( ( ( picture [ r ] [ c + 1 ] == '0' ) && ( picture [ r + 1 ] [ c + 1 ] == '0' ) ) && ( picture [ r + 1 ] [ c + 1 ] == '0' ) ) {
              picture [ r ] [ c ] = "/" ;
              picture [ r ] [ c + 1 ] = "\\" ;
              picture [ r + 1 ] [ c ] = "\\" ;
              picture [ r + 1 ] [ c + 1 ] = "/" ;
            }
            else {
              return "Impossible\n" ;
            }
          }
          catch ( Exception e ) {
            return "Impossible\n" ;
          }
        }
        outrow += picture [ r ] [ c ] ;
      }
      outstr += outrow + "\n" ;
    }
    return outstr ;
  }
  