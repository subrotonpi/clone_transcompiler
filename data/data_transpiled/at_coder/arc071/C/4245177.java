static int getN ( ) throws IOException {
  return Integer . parseInt ( input . readLine ( ) ) ;
  /* getMN() */
  String [ ] a = input . split ( " " ) ;
  int [ ] b = new int [ a . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( a [ i ] ) ;
  }
  /* getlist() */
  String [ ] a = input . split ( " " ) ;
  int [ ] b = new int [ a . length ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    b [ i ] = Integer . parseInt ( a [ i ] ) ;
  }
  /* get queries */
  String [ ] astr = input . split ( " " ) ;
  String [ ] bstr = input . split ( " " ) ;
  int n = getN ( ) ;
  ArrayList < ArrayList < String >> queries = new ArrayList < ArrayList < String >> ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    queries . add ( asList ( a ) ) ;
  }
  int s1 = astr [ 0 ] . equals ( "A" ) ? 1 : 2 ;
  int t1 = bstr [ 0 ] . equals ( "A" ) ? 1 : 2 ;
  int [ ] sAcc = new int [ s1 ] ;
  int [ ] tAcc = new int [ t1 ] ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < astr . length ;
  i ++ ) {
    if ( astr [ i ] . equals ( "A" ) ) {
      sAcc [ tmp ++ ] = sAcc [ tmp ++ ] + 1 ;
    }
    else {
      sAcc [ tmp ++ ] = sAcc [ tmp ++ ] + 2 ;
    }
  }
  for ( int i = 0 ;
  i < bstr . length ;
  i ++ ) {
    if ( bstr [ i ] . equals ( "A" ) ) {
      tAcc [ tmp ++ ] = tAcc [ tmp ++ ] + 1 ;
    }
    else {
      tAcc [ tmp ++ ] = tAcc [ tmp ++ ] + 2 ;
    }
  }
  for ( ArrayList < String > q : queries ) {
    int x = q . get ( 0 ) ;
    int y = q . get ( 1 ) ;
    int z = q . get ( 2 ) ;
    int w = q . get ( 3 ) ;
    if