public static int alphabet ( int nnn , String s ) throws Exception {
  int [ ] mp = {
    4 , 8 , null , null , 3 , null , 9 , null , 1 , null , null , null , null , 0 , null , null , null , null , 5 , 7 , null , null , null , null , null }
    ;
    int [ ] din = new int [ 36 ] ;
    int [ ] dout = new int [ 36 ] ;
    HashSet < Integer > e = new HashSet < Integer > ( ) ;
    for ( int i : xrange ( s . length ( ) - 1 ) ) {
      char c = s . charAt ( i ) ;
      char d = s . charAt ( i + 1 ) ;
      int posc = Character . getNumericValue ( c ) - Character . getNumericValue ( d ) ;
      int posd = Character . getNumericValue ( d ) - Character . getNumericValue ( d ) ;
      if ( ( posc + 10 < posd ) && ( posd < 36 ) ) {
        e . add ( new Integer ( posc + 10 ) ) ;
        din [ posc + 10 ] ++ ;
        dout [ posd + 10 ] ++ ;
      }
      if ( mp [ posc ] != 0 && ( mp [ posc ] != 0 ) && ( mp [ posc ] != 0 ) ) {
        e . add ( new Integer ( mp [ posc ] ) ) ;
        din [ posc + 10 ] ++ ;
        dout [ posd + 10 ] ++ ;
      }
      if ( mp [ posd ] != 0 && ( posc + 10 < 36 ) && ( mp [ posd ] != 0 ) ) {
        e . add ( new Integer ( posc + 10 ) ) ;
        din [ posc + 10 ] ++ ;
        dout [ posc + 10 ] ++ ;
      }
      if ( mp [ posc ] != 0 && mp [ posd ] != 0 && ( mp [ posc ] != 0 ) && ( mp [ posc ] != 0 ) ) {
        e . add ( new Integer ( mp [ posc ] ) ) ;
        din [ posc + 10 ] ++ ;
        dout [ posc + 10 ] ++ ;
      }
    }
    int edges = din . length ;
    int problem = Integer . MAX_VALUE ;
    for ( int x = 0 ;
    x < edges ;
    x ++ ) {
      int ab = Integer . parseInt ( fn . readLine ( ) ) ;
      int kk = fn . readLine ( ) ;
      System . out . println ( "