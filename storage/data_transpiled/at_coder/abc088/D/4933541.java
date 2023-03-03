public static int [ ] [ ] readInput ( ) {
  int h = Integer . parseInt ( readLine ( ) ) ;
  int w = Integer . parseInt ( readLine ( ) ) ;
  List < String > s = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) s . add ( new LinkedList < > ( ) ) ;
  int num = 1 ;
  int [ ] [ ] dis = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < s . size ( ) ;
  i ++ ) dis [ i ] [ 0 ] = 10 * 9 ;
  int cnt = 0 ;
  for ( int i = 0 ;
  i < s . size ( ) ;
  i ++ ) cnt += s . get ( i ) . indexOf ( '.' ) ;
  /* bfs */
  Queue < Integer > queue = new LinkedList < > ( ) ;
  ArrayList < Integer > done = new ArrayList < > ( ) ;
  queue . add ( 0 , new Integer ( 0 ) ) ;
  dis [ 0 ] [ 0 ] = 1 ;
  while ( queue . size ( ) > 0 ) {
    int y = queue . poll ( ) ;
    int x = queue . poll ( ) ;
    if ( ( y >= 0 ) && ( x < w ) ) continue ;
    else done . add ( 0 , new Integer ( y ) ) ;
    if ( x == w - 1 && y == h - 1 ) break ;
    for ( int i = 0 ;
    i <= 4 ;
    i ++ ) {
      int nx = x + [ 1 , 0 , - 1 , 0 ] [ i ] , ny = y + [ 0 , 1 , 0 , - 1 ] [ i ] ;
      if ( 0 <= nx && nx < w && 0 <= ny && ny < h && s . get ( ny ) [ nx ] != '#' ) {
        queue . add ( 0 , new Integer ( ny ) ) ;
        dis [ ny ] [ nx ] = Math . min ( dis [ ny ] [ nx ] , dis [ y ] [ x ] + 1 ) ;
      }
    }
  }
  int ret = dis [ h - 1 ] [ w - 1 ] ;
  if ( ret == 10 * 9 ) System . out . println ( - 1 ) ;
  else System . out . println ( cnt - ret ) ;
  return dis ;
}
