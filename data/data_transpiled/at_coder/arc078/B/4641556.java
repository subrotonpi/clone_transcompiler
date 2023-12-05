@ VisibleForTesting static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int [ ] board = new int [ n ] ;
  int [ ] [ ] edge = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    edge [ a - 1 ] [ b - 1 ] = b - 1 ;
    edge [ b - 1 ] [ a - 1 ] = a ;
  }
  Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  q . add ( new Integer ( 1 ) ) ;
  q . add ( new Integer ( - 1 ) ) ;
  while ( q . size ( ) > 0 ) {
    int from = q . poll ( ) ;
    int color = q . poll ( ) ;
    if ( board [ from ] != 0 ) {
      continue ;
    }
    board [ from ] = color ;
    for ( int i : edge [ from ] ) {
      q . add ( new Integer ( i ) ) ;
    }
  }
  if ( Arrays . binarySearch ( board , 0 ) > 0 ) {
    System . out . println ( "Fennec" ) ;
  }
  else {
    System . out . println ( "Snuke" ) ;
  }
}
