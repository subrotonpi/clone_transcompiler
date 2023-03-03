static boolean doPart ( int [ ] idx , int [ ] h , int x1 , int x2 ) {
  if ( x2 - x1 < 2 ) return true ;
  int h1 = h [ x1 ] ;
  int h2 = h [ x2 ] ;
  int [ ] y = new int [ x2 ] ;
  int i = x1 + 1 ;
  while ( i < x2 ) {
    int [ ] data = parse ( ) ;
    int result = compute ( ( int [ ] ) data ) ;
    System . out . println ( "Case #" + ( i + 1 ) + ": " + result ) ;
  }
  return ( h [ x1 ] == 0 ) ;
}
