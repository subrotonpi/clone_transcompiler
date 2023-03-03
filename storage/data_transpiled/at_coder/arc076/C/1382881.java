public static void put ( int i , int x , int y ) {
  if ( x == 0 ) onTop . add ( new Integer ( y ) ) ;
  else if ( x == r ) onBottom . add ( new Integer ( y ) ) ;
  else if ( y == 0 ) onLeft . add ( new Integer ( x ) ) ;
  else onRight . add ( new Integer ( x ) ) ;
  onTop = new ArrayList < Integer > ( ) ;
  onBottom = new ArrayList < Integer > ( ) ;
  onLeft = new ArrayList < Integer > ( ) ;
  onRight = new ArrayList < Integer > ( ) ;
  r = Integer . parseInt ( input . readLine ( ) ) ;
  c = Integer . parseInt ( input . readLine ( ) ) ;
  n = input . readInt ( ) ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    int x1 = Integer . parseInt ( input . readLine ( ) ) ;
    int y1 = Integer . parseInt ( input . readLine ( ) ) ;
    int x2 = Integer . parseInt ( input . readLine ( ) ) ;
    int y2 = Integer . parseInt ( input . readLine ( ) ) ;
    if ( 0 < x1 && y1 < x2 && y2 < c ) continue ;
    put ( i , x1 , y1 ) ;
    put ( i , x2 , y2 ) ;
  }
}
