public static String print ( int n ) {
  int len = input . nextInt ( ) ;
  String s = input . next ( ) ;
  for ( char [ ] c = 'SS' , 'SW' , 'WS' , 'WW' ] ;
  c [ 0 ] = 'S' ;
  c [ 1 ] = 'SW' ;
  c [ 2 ] = 'WS' ;
  c [ 3 ] = 'W' ;
  for ( int d = 1 ;
  d < n - 1 ;
  d ++ ) {
    if ( c [ d ] == 'S' ) {
      if ( s . charAt ( d ) == 'o' ) {
        c [ d - 1 ] ++ ;
      }
      else if ( c [ d - 1 ] == 'S' ) {
        c [ d - 1 ] ++ ;
      }
      else {
        c [ d - 1 ] ++ ;
      }
    }
    else {
      if ( s . charAt ( i ) == 'S' ) {
        c [ i ] ++ ;
      }
      else {
        c [ i ] ++ ;
      }
    }
  }
  if ( res . equals ( s ) ) {
    System . out . println ( c ) ;
    exit ( ) ;
  }
  return s ;
}
