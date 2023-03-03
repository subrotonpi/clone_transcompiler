static final String [ ] [ ] getSwitches ( ) {
  /* Sort Cars */
  List < Pair < String , String >> s = new ArrayList < Pair < String , String >> ( ) ;
  s . addAll ( Arrays . asList ( cars ) ) ;
  /* Sort Cars */
  String [ ] [ ] firstCars = s . toArray ( new Pair [ s . size ( ) ] [ ] ) ;
  int earlyTime = lastCars . length ;
  int lastCars [ ] = new int [ s . length - 1 ] [ ] ;
  s . sort ( s ) ;
  /* Sort Cars */
  String [ ] [ ] fileLines = new String [ s . length - 1 ] [ ] ;
  int index = 0 ;
  int numCases = Integer . parseInt ( fileLines [ index ] [ 0 ] ) ;
  index ++ ;
  for ( int i = 0 ;
  i < numCases ;
  i ++ ) {
    String caseStr = fileLines [ index ] [ 0 ] ;
    index ++ ;
    String [ ] data = caseStr . split ( "\\s+" ) ;
    int lOrR = data [ 0 ] . length ( ) ;
    int pos = Integer . parseInt ( data [ 1 ] ) ;
    cars [ 0 ] [ 0 ] = lOrR ;
    if ( firstCollision == 0 ) {
      firstCollision = 0 ;
    }
    else {
      firstCollision = 0 ;
    }
    System . out . println ( "Case #" + ( caseNum + 1 ) + ": " + ( pos < 0 ? "" : "" ) ) ;
  }
  /* Sort Cars */
  String [ ] [ ] firstCars = new String [ cars . length - 1 ] [ ] ;
  for ( int i = 0 ;
  i < firstCars . length ;
  i ++ ) {
    firstCars [ i ] = new String [ ] {
      firstCars [ i ] [ 0 ] , firstCars [ i ] [ 1 ] + time * cars [ i ] [ 1 ] }
      ;
    }
    /* Sort Cars */
    int [ ] [ ] lastCars = new int [ cars . length - 1 ] [ ] ;
    for ( int i = 0 ;
    i < lastCars . length ;
    i ++ ) {
      lastCars [ i ] = lastCars [ i ] [ 0 ] ;
    }
    /* Sort Cars */
    for ( int i = 0 ;
    i < last @ @