@ VisibleForTesting static int [ ] [ ] map ( int R , int C ) {
  int sy = Integer . parseInt ( input ( ) ) ;
  int sx = Integer . parseInt ( input ( ) ) ;
  int gy = Integer . parseInt ( input ( ) ) ;
  int gx = Integer . parseInt ( input ( ) ) ;
  HashMap < String , Integer > _d = new HashMap < > ( 1 ) ;
  _d . put ( "#" , 1 ) ;
  _d . put ( "." , 0 ) ;
  int [ ] [ ] _map = new int [ R ] [ C ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) _map [ i ] = new int [ C ] ;
  for ( int j = 0 ;
  j < R ;
  j ++ ) _map [ i ] [ j ] = _d . get ( j ) ;
  List < Integer > moves = Arrays . asList ( new Integer [ ] {
    0 , 1 }
    , new Integer [ ] {
      1 , 0 }
      , new Integer [ ] {
        0 , - 1 }
        , new Integer [ ] {
          - 1 , 0 }
          ) ;
          Deque < Tuple > dq = new ArrayDeque < Tuple > ( ) ;
          Set < Tuple > visited = new HashSet < Tuple > ( ) ;
          for ( int i = 0 ;
          i < C ;
          i ++ ) {
            int y = dq . poll ( ) . intValue ( ) ;
            int x = dq . poll ( ) . intValue ( ) ;
            int dist = dq . poll ( ) . intValue ( ) ;
            for ( Integer m : moves ) {
              int nextY = y + m . intValue ( ) ;
              int nextX = x + m . intValue ( ) ;
              if ( nextY == gy && nextX == gx ) {
                System . out . println ( dist + 1 ) ;
                break ;
              }
              if ( ( nextY < 0 ) && ( nextX < 0 ) ) {
                if ( _map [ nextY - 1 ] [ nextX - 1 ] == 0 ) {
                  dq . add ( new Tuple ( nextY , nextX , dist + 1 ) ) ;
                  visited . add ( new Tuple ( nextY , nextX ) ) ;
                }
              }
            }
            else {
              continue ;
            }
            break ;
          }
          else {
            System . out . println ( "Something wrong" ) ;
          }
          return _map ;
        }
        