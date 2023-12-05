@ BeforeClass public static void solve ( ) {
  int h = Integer . parseInt ( input . readLine ( ) ) ;
  int w = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] maze = new String [ h ] ;
  for ( int j = 0 ;
  j < h ;
  j ++ ) maze [ j ] = input . readLine ( ) ;
  int [ ] [ ] visited = new int [ w ] [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    if ( maze [ i ] . contains ( "S" ) ) {
      int sy = i ;
      int sx = maze [ i ] . indexOf ( "S" ) ;
    }
  }
  Queue < Integer > queue = new LinkedList < Integer > ( ) ;
  queue . add ( new Integer [ ] {
    sy , sx }
    ) ;
    visited [ sy ] [ sx ] = 0 ;
    int r = 10 * 18 ;
    while ( queue . size ( ) > 0 ) {
      int y = queue . poll ( ) ;
      int x = queue . poll ( ) ;
      r = min ( r , y , x , h - 1 - y , w - 1 - x ) ;
      if ( visited [ y ] [ x ] == k ) continue ;
      for ( int i = 1 , j = 0 ;
      i < h ;
      i ++ , j ++ ) {
        int newY = y + i , newX = x + j ;
        if ( newY < 0 || newY >= h ) continue ;
        if ( newX < 0 || newX >= w ) continue ;
        if ( maze [ newY ] . charAt ( newX ) == '.' && visited [ newY ] [ newX ] == - 1 ) {
          visited [ newY ] [ newX ] = visited [ y ] [ x ] + 1 ;
          queue . add ( new Integer [ ] {
            newY , newX }
            ) ;
          }
        }
      }
      System . out . println ( 1 - ( - r / k ) ) ;
    }
    