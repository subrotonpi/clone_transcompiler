static final String DIR_TO_V = new String [ ] {
  "N" , 0 , "E" , "S" , "W" }
  ;
  final String V_TO_DIR = "NESW" ;
  /* turn into V */
  int v = DIR_TO_V . get ( v ) ;
  v += which ;
  v %= 4 ;
  /* turn into V */
  int n = 0 ;
  int lCount = 0 ;
  for ( int i = min_x - 1 ;
  i < max_x + 2 ;
  i ++ ) {
    int y0 = ud_segs . get ( i ) ;
    if ( y0 <= y ) lCount = lCount + 1 ;
    else lCount = lCount + 1 ;
    if ( y0 % 2 == 0 && lCount > 0 ) {
      outside [ i ] = new Point ( x , y ) ;
      area = area + 1 ;
      continue ;
    }
    /* do the next line */
    int L = Integer . parseInt ( in . nextLine ( ) ) ;
    String [ ] stPairs = new String [ L ] ;
    while ( stPairs . length < L * 2 ) {
      stPairs = stPairs . clone ( ) ;
      for ( int j = 0 ;
      j < L ;
      j ++ ) {
        stPairs [ j ] = in . nextLine ( ) ;
      }
    }
    Map < Integer , Set < Integer >> ud_segs = new HashMap < Integer , Set < Integer >> ( ) ;
    Map < Integer , Set < Integer >> lr_segs = new HashMap < Integer , Set < Integer >> ( ) ;
    int dir = 'N' ;
    int x = 0 , y = 0 ;
    int min_x = 0 , min_y = 0 , max_x = 0 , max_y = 0 ;
    while ( stPairs . length > 0 ) {
      String [ ] s = stPairs [ 0 ] . split ( " " ) ;
      int t = stPairs [ 1 ] . split ( " " ) ;
      int len = s . length ;
      while ( len -- > 0 ) {
        t = t - 1 ;
        for ( int j = 0 ;
        j < len ;
        j ++ ) {
          String d = s [ j ] ;
          if ( d . equals ( "L" ) ) dir = turn ( - 1 , dir ) ;
          if ( d . equals ( "R" ) ) dir = turn ( 1 , dir ) ;
          if ( d . equals ( "F" ) ) {
            Set < Integer > st = ud_segs . computeIfAbsent (