@ VisibleForTesting static void minimumDistance ( ) {
  int R = ( Integer ) input . nextInt ( ) ;
  int C = ( Integer ) input . nextInt ( ) ;
  int sy = ( Integer ) input . nextInt ( ) ;
  int sx = ( Integer ) input . nextInt ( ) ;
  int gy = ( Integer ) input . nextInt ( ) ;
  int gx = ( Integer ) input . nextInt ( ) ;
  List < List < String >> maze = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) maze . add ( Collections . singletonList ( input . next ( ) ) ) ;
  int [ ] [ ] distanceFromStart = new int [ R ] [ C ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    maze . add ( Arrays . asList ( input . next ( ) ) ) ;
  }
  int [ ] [ ] move = {
    {
      1 , 0 }
      , {
        - 1 , 0 }
        , {
          0 , 1 }
          , {
            0 , - 1 }
          }
          ;
          Deque < Integer > que = new LinkedList < > ( ) ;
          que . add ( new Integer ( sx ) ) ;
          que . add ( new Integer ( sy ) ) ;
          distanceFromStart [ sy - 1 ] [ sx - 1 ] = 0 ;
          /* Minimum distance */
          while ( que . size ( ) != 0 ) {
            int x = que . removeFirst ( ) ;
            int y = que . removeFirst ( ) ;
            for ( int i = 0 ;
            i < 4 ;
            i ++ ) {
              int nextX = x + move [ i ] [ 0 ] ;
              int nextY = y + move [ i ] [ 1 ] ;
              if ( nextX <= 0 || nextX > C || nextY <= 0 || nextY > R || distanceFromStart [ nextY - 1 ] [ nextX - 1 ] != - 1 || maze . get ( nextY - 1 ) [ nextX - 1 ] == "#" ) {
                continue ;
              }
              distanceFromStart [ nextY - 1 ] [ nextX - 1 ] = distanceFromStart [ y - 1 ] [ x - 1 ] + 1 ;
              que . add ( new Integer ( nextX ) ) ;
            }
          }
          /* Minimum distance */
          System . out . println ( distanceFromStart [ gy - 1 ] [ gx - 1 ] ) ;
        }
        