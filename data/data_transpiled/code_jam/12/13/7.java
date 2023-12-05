@ VisibleForTesting static String [ ] [ ] findCollisions ( List < String > cars ) {
  final List < String [ ] > [ ] [ ] result = new ArrayList < String [ ] > [ cars . size ( ) ] [ 2 ] ;
  int i ;
  int t1 = 0 ;
  int t2 = 0 ;
  if ( can1 ) {
    List < String [ ] > cars1 = new ArrayList < String [ ] > ( cars . size ( ) ) ;
    cars1 . get ( 1 ) [ 0 ] = ! cars . get ( 1 ) [ 0 ] ;
    t1 = getTime ( t + tCol , cars1 ) ;
    if ( can2 ) {
      String s = "Case #" + i + ": " ;
      s = s + result ;
      return s . split ( s ) ;
    }
  }
  else {
    String s = "Case #" + i + ": " ;
    s = s + result ;
  }
  int n ;
  String [ ] [ ] cars = new String [ cars . size ( ) ] [ 2 ] ;
  for ( i = 0 ;
  i <= n ;
  i ++ ) {
    String line = cars . remove ( 0 ) ;
    String c = line . substring ( 1 , 2 ) ;
    String p = line . substring ( 2 , 3 ) ;
    c = ( c . equals ( "__main__" ) ) ? "" : c ;
    s = Double . parseDouble ( p ) ;
    cars [ 0 ] = new String [ ] {
      s , p }
      ;
    }
    if ( className . equals ( "__main__" ) ) {
      main ( argv [ 1 ] , argv [ 2 ] ) ;
    }
    else {
      return max ( t1 , t2 ) ;
    }
    /* update cars */
    for ( int t = 0 ;
    t < cars . size ( ) ;
    t ++ ) {
      String [ ] [ ] car = cars . get ( t ) ;
      car [ 0 ] = car [ 0 ] . substring ( 0 , 2 ) ;
      String s = ( car [ 1 ] . equals ( "__main__" ) ) ? "" : car [ 1 ] ;
      String p = ( car [ 2 ] . equals ( "__main__" ) ) ? "" : car [ 2 ] ;
      Arrays . sort ( car ) ;
    }
    return result ;
  }
  