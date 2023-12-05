static final String getStdin ( ) throws IOException {
  if ( __name__ == null ) {
    BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
    if ( args . length >= 2 ) {
      String fn = args [ 1 ] ;
      if ( fn != null ) {
        br = new BufferedReader ( new FileReader ( fn ) ) ;
      }
    }
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int _T = xrange ( T ) ;
    _T > 0 ;
    _T -- ) {
      int C = Integer . parseInt ( br . readLine ( ) ) ;
      int R = Integer . parseInt ( br . readLine ( ) ) ;
      int M = Integer . parseInt ( br . readLine ( ) ) ;
      int [ ] turrets = new int [ TALIVE_SIZE ] ;
      int [ ] [ ] soldiers = new int [ TALIVE_SIZE ] [ TALIVE_SIZE ] ;
      themap = new int [ TALIVE_SIZE ] [ TALIVE_SIZE ] ;
      for ( int i = 0 ;
      i < TALIVE_SIZE ;
      ++ i ) {
        int t = 0 ;
        for ( int si = xrange ( TALIVE_SIZE ) ;
        si < TALIVE_SIZE ;
        ++ si ) {
          if ( ( TALIVE_SIZE & ( 1 << si ) ) != 0 ) continue ;
          int newTALIVE_SIZE = sused_SIZE | ( 1 << si ) ;
          for ( int killable : TALIVE_SIZE ) {
            int newTALIVE_SIZE = sused_SIZE & ~ ( 1 << killable ) ;
            reachable [ newTALIVE_SIZE ] [ newTALIVE_SIZE ] = ( i , killable ) ;
            int killed = TALIVE_SIZE - 1 ;
            if ( TALIVE_SIZE > killed ) {
              bestkill = killed ;
              best = newTALIVE_SIZE ;
            }
          }
        }
      }
      System . out . println ( "Case #%d: %d" , T + 1 , bestkill ) ;
      Arrays . fill ( turrets , best ) ;
      Arrays . fill ( soldiers , best ) ;
      Arrays . fill ( soldiers , best ) ;
      Arrays . fill ( soldiers , best ) ;
      Arrays . fill ( soldiers , best ) ;
    }
    Arrays . fill ( turrets , best ) ;
    Arrays . fill ( soldiers , best ) ;
    Arrays . fill ( soldiers , best ) ;
    return "" ;
  }
  else {
    return DEDENT