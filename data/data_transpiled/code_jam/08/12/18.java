static final String solve ( String [ ] clis , int N ) {
  String nextLine = System . getProperty ( "line.separator" ) ;
  /* read the string */
  String [ ] strlist = nextLine . split ( " " ) ;
  /* read the integers */
  int [ ] intlist = ArrayUtil . toIntArray ( strlist ) ;
  /* solve the clis */
  int [ ] R = new int [ N ] ;
  int rp = 0 ;
  while ( R != rp ) {
    rp = R . length * 1 ;
    for ( int fl = 0 ;
    fl < R . length ;
    fl ++ ) {
      if ( R [ fl ] == 0 ) {
        if ( Arrays . binarySearch ( clis , ( fl + 1 ) ) >= 0 ) {
          R [ fl ] = 1 ;
          for ( int cli = 0 ;
          cli < clis . length ;
          cli ++ ) {
            clis [ cli ] = Collections . singletonList ( clis [ cli ] ) ;
          }
        }
        else if ( Arrays . binarySearch ( clis , ( fl + 1 ) ) >= 0 ) {
          R [ fl ] = 0 ;
          for ( int cli = 0 ;
          cli < clis . length ;
          cli ++ ) {
            clis [ cli ] = Collections . singletonList ( clis [ cli ] ) ;
          }
        }
      }
      else {
        if ( Arrays . binarySearch ( clis , ( fl + 1 ) ) >= 0 ) {
          R [ fl ] = 1 ;
          for ( int cli = 0 ;
          cli < clis . length ;
          cli ++ ) {
            clis [ cli ] = Collections . singletonList ( clis [ cli ] ) ;
          }
        }
      }
    }
    StringBuilder sb = new StringBuilder ( ) ;
    for ( String x : clis ) {
      if ( ! x . equals ( R [ fl ] ) ) {
        sb . append ( "IMPOSSIBLE" ) ;
      }
    }
  }
  if ( className . equals ( "java.util.concurrent.locks.CaseInsensitiveStream" ) ) {
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      N = Integer . parseInt ( readLine ) ;
      R = new int [ N ] ;
      int M = Integer . parseInt ( readLine ) ;
      List < List < Integer >> clis = new ArrayList < List < Integer >> ( ) ;
      for ( int j = 0 ;
      j < M ;
      j ++ ) {
        int [ ] l = readIntlist ( ) ;
        int T = l [ 0 ] ;
        clis .