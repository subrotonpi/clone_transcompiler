@ GwtIncompatible ( "java.util.concurrent.atomic.Scanner" ) public static void bfs ( char [ ] [ ] maze , int [ ] [ ] visited , int sy , int sx , int gy , int gx ) {
  LinkedList < int [ ] > queue = new LinkedList < > ( ) ;
  queue . add ( new int [ ] {
    sy , sx }
    ) ;
    visited [ sy ] [ sx ] = 0 ;
    while ( queue . size ( ) > 0 ) {
      int [ ] y = queue . poll ( ) ;
      int [ ] x = queue . poll ( ) ;
      if ( Arrays . equals ( y , x ) ) {
        return ;
      }
      for ( int j = 1 , k = 0 ;
      j < 4 ;
      j ++ , k = - 1 ) {
        int newY = y + j , newX = x + k ;
        if ( maze [ newY ] [ newX ] == '.' && visited [ newY ] [ newX ] == - 1 ) {
          visited [ newY ] [ newX ] = visited [ y ] [ x ] + 1 ;
          queue . add ( new int [ ] {
            newY , newX }
            ) ;
          }
        }
      }
      if ( getClass ( ) . isPrimitive ( ) ) {
        int R = Integer . parseInt ( input ( ) ) ;
        int C = Integer . parseInt ( input ( ) ) ;
        sy = Integer . parseInt ( input ( ) ) ;
        sx = Integer . parseInt ( input ( ) ) ;
        gy = Integer . parseInt ( input ( ) ) ;
        gx = Integer . parseInt ( input ( ) ) ;
        sy = sy - 1 ;
        sx = sx - 1 ;
        gy = gy - 1 ;
        gx = gx - 1 ;
        char [ ] [ ] maze = new char [ R ] [ C ] ;
        for ( int i = 0 ;
        i < R ;
        i ++ ) maze [ i ] = input ( maze [ i ] ) ;
        visited = new int [ C ] [ C ] ;
        for ( int j = 0 ;
        j < C ;
        j ++ ) visited [ j ] [ sy ] = - 1 ;
        System . out . println ( bfs ( maze , visited , sy , sx , gy , gx ) ) ;
      }
    }
    