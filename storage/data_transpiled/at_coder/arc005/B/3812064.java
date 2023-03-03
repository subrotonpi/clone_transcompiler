public static void input ( ) {
  X = input . nextInt ( ) ;
  Y = input . nextInt ( ) ;
  C = new int [ 9 ] [ ] ;
  for ( int i = 0 ;
  i < 9 ;
  i ++ ) {
    C [ i ] = input . nextInt ( ) ;
  }
  X = X - 1 ;
  Y = Y - 1 ;
  Map < String , Integer > map = new HashMap < String , Integer > ( ) ;
  map . put ( "L" , new Integer ( - 1 ) ) ;
  map . put ( "R" , new Integer ( 1 ) ) ;
  map . put ( "U" , new Integer ( 0 ) ) ;
  map . put ( "D" , new Integer ( 0 ) ) ;
  int d_x = 0 , d_y = 0 ;
  for ( int w : W ) {
    int x = map . get ( w ) ;
    int y = map . get ( x ) ;
    d_x = d_x + x ;
    d_y = d_y + y ;
  }
  int t = C [ Y ] [ X ] ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    if ( ! ( 0 <= X + d_x < 9 ) ) {
      d_x *= - 1 ;
    }
    if ( ! ( 0 <= Y + d_y < 9 ) ) {
      d_y *= - 1 ;
    }
    X += d_x ;
    Y += d_y ;
    t += C [ Y ] [ X ] ;
  }
  System . out . println ( t ) ;
}
