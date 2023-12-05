public static int [ ] readIntLine ( ) {
  int x1 = Integer . parseInt ( input . readLine ( ) ) ;
  int y1 = Integer . parseInt ( input . readLine ( ) ) ;
  int x2 = Integer . parseInt ( input . readLine ( ) ) ;
  int y2 = Integer . parseInt ( input . readLine ( ) ) ;
  int fx = 1 ;
  int fy = 1 ;
  if ( x1 > x2 ) {
    x1 = x2 ;
    x2 = x1 ;
    fx = - 1 ;
  }
  if ( y1 > y2 ) {
    y1 = y2 ;
    y2 = y1 ;
    fy = - 1 ;
  }
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  Point [ ] p = new Point [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    if ( x1 <= x && x <= x2 && y1 <= y && y <= y2 ) {
      p [ i ] = new Point ( fx * x , fy * y ) ;
    }
  }
  Arrays . sort ( p ) ;
  @ SuppressWarnings ( "unchecked" ) List < Point > b = new ArrayList < > ( ) ;
  for ( Point y : p ) {
    int pos = bl ( b , y ) ;
    if ( b . size ( ) <= pos ) {
      b . add ( y ) ;
    }
    else {
      b . set ( pos , y ) ;
    }
  }
  @ SuppressWarnings ( "unchecked" ) int l = b . size ( ) ;
  if ( l == Math . min ( x2 - x1 , y2 - y1 ) + 1 ) {
    System . out . println ( 100 * ( x2 - x1 + y2 - y1 ) + ( 5 * PI - 20 ) * ( l - 1 ) + ( 10 * PI - 20 ) ) ;
  }
  else {
    System . out . println ( 100 * ( x2 - x1 + y2 - y1 ) + ( 5 * PI - 20 ) * l ) ;
  }
  return b . toArray ( ) ;
}
