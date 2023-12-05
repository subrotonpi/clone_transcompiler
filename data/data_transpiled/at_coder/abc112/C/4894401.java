public static int N = Integer . parseInt ( input ) {
  int [ ] x = new int [ N ] ;
  int [ ] y = new int [ N ] ;
  int [ ] h = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int b = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int c = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    x [ i ] = a ;
    y [ i ] = b ;
    h [ i ] = c ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( h [ i ] != 0 ) s = i ;
    break ;
  }
  for ( int cx = 0 ;
  cx < 101 ;
  cx ++ ) for ( int cy = 0 ;
  cy < 101 ;
  cy ++ ) {
    int H = h [ s ] + Math . abs ( x [ s ] - cx ) + Math . abs ( y [ s ] - cy ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( h [ i ] != Math . max ( 0 , H - Math . abs ( x [ i ] - cx ) - Math . abs ( y [ i ] - cy ) ) ) break ;
      if ( i == N - 1 ) System . out . println ( cx + " " + cy + " " + H ) ;
      exit ( ) ;
    }
  }
  return 0 ;
}
