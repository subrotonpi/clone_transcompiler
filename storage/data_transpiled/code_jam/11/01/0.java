static int doit ( List < Point > points ) throws IOException {
  final int [ ] lastPos = {
    1 , 1 }
    ;
    final int [ ] lastTime = {
      0 , 0 }
      ;
      int lastPress = 0 ;
      for ( int i = 0 ;
      i < points . size ( ) ;
      i ++ ) {
        final int x = points . get ( i ) . x ;
        final int diff = Math . abs ( x - lastPos [ i ] ) ;
        lastTime [ i ] += diff ;
        lastPos [ i ] = x ;
        lastTime [ i ] = Math . max ( lastTime [ i ] , lastPress ) ;
        lastTime [ i ] ++ ;
        lastPress = lastTime [ i ] ;
      }
      if ( className == null ) {
        BufferedReader br = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
        if ( args . size ( ) >= 2 ) {
          final String fn = args . get ( 1 ) ;
          if ( fn != null ) {
            br . close ( ) ;
          }
        }
        final int t = Integer . parseInt ( br . readLine ( ) ) ;
        final HashMap < String , Integer > map = new HashMap < String , Integer > ( ) ;
        map . put ( 'O' , 0 ) ;
        map . put ( 'B' , 1 ) ;
        for ( int _t : xrange ( t ) ) {
          final String [ ] s = br . readLine ( ) . split ( " " ) ;
          points = new ArrayList < Point > ( ) ;
          for ( int i = xrange ( 0 , s . length , 2 ) ;
          i < points . size ( ) ;
          i ++ ) {
            points . add ( new Point ( map . get ( s [ i ] ) , Integer . parseInt ( s [ i + 1 ] ) ) ) ;
          }
          final int n = doit ( points ) ;
          System . out . println ( "Case #" + ( _t + 1 ) + ": " + n ) ;
        }
      }
      return lastPress ;
    }
    