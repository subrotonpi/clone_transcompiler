static final String [ ] base = {
  "Q" , "W" , "E" , "R" , "A" , "S" , "D" , "F" }
  ;
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    String [ ] data = System . console ( ) . readLine ( ) . split ( "\\s+" ) ;
    int pos = 0 ;
    int n = Integer . parseInt ( data [ pos ] ) ;
    Map < String , String > combine = new HashMap < String , String > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      pos ++ ;
      String pair = data [ pos ] . substring ( 0 , 2 ) ;
      String nov = data [ pos ] . substring ( 2 ) ;
      combine . put ( pair , combine . get ( pair . substring ( 0 , pair . length ( ) - 1 ) ) ) ;
    }
    pos ++ ;
    n = Integer . parseInt ( data [ pos ] ) ;
    Set < String > opposed = new HashSet < String > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      pos ++ ;
      opposed . add ( data [ pos ] ) ;
      opposed . add ( data [ pos ] . substring ( 0 , data [ pos ] . length ( ) - 1 ) ) ;
    }
    String sez = "" ;
    for ( int i = 0 ;
    i < data . length - 1 ;
    i ++ ) {
      sez += data [ i ] ;
      if ( sez . length ( ) >= 2 && combine . containsKey ( sez . substring ( sez . length ( ) - 2 ) ) ) {
        sez = sez . substring ( 0 , sez . length ( ) - 2 ) + combine . get ( sez . substring ( sez . length ( ) - 2 ) ) ;
      }
      else if ( sez . length ( ) >= 2 ) {
        boolean destroy = false ;
        for ( int w = 0 ;
        w < sez . length ( ) ;
        w ++ ) {
          if ( opposed . contains ( sez + w ) ) {
            destroy = true ;
            break ;
          }
        }
        if ( destroy ) sez = "" ;
      }
    }
    System . out . println ( String . format ( "Case #%i:" , t + 1 ) + "[%s]" ) ;
  }
  