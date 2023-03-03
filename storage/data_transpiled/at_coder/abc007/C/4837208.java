@ VisibleForTesting static void input ( ) {
  int R = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int sy = Integer . parseInt ( input . nextLine ( ) ) ;
  int sx = Integer . parseInt ( input . nextLine ( ) ) ;
  int gy = Integer . parseInt ( input . nextLine ( ) ) ;
  int gx = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> roadList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    int [ ] r = input . nextLine ( ) . split ( " " ) ;
    List < Integer > road = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < r . length ;
    j ++ ) {
      road . add ( r [ j ] ) ;
    }
    roadList . add ( road ) ;
  }
  double inf = 1e18 ;
  int [ ] [ ] dist = new int [ R ] [ C ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    dist [ i ] [ i ] = inf ;
  }
  Queue < Integer > Q = new LinkedList < > ( ) ;
  Q . add ( new Integer ( sy - 1 ) ) ;
  Q . add ( new Integer ( sx - 1 ) ) ;
  dist [ sy - 1 ] [ sx - 1 ] = 0 ;
  while ( Q . size ( ) > 0 ) {
    int y = Q . poll ( ) ;
    int x = Q . poll ( ) ;
    if ( roadList . get ( y - 1 ) . get ( x ) == '.' && dist [ y - 1 ] [ x ] > dist [ y ] [ x ] + 1 ) {
      dist [ y - 1 ] [ x ] = dist [ y ] [ x ] + 1 ;
      Q . add ( new Integer ( y - 1 ) ) ;
    }
    if ( roadList . get ( y ) . get ( x - 1 ) == '.' && dist [ y ] [ x - 1 ] > dist [ y ] [ x ] + 1 ) {
      dist [ y ] [ x + 1 ] = dist [ y ] [ x ] + 1 ;
      Q . add ( new Integer ( y ) ) ;
    }
  }
  System . out . println ( dist [ gy - 1 ] [ gx - 1 ] ) ;
}
