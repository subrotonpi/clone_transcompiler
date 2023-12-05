@ VisibleForTesting static void from ( LinkedHashMap < String , Integer > input ) {
  int row = input . nextInt ( ) ;
  int col = input . nextInt ( ) ;
  int sy = input . nextInt ( ) ;
  int sx = input . nextInt ( ) ;
  int gy = input . nextInt ( ) ;
  int gx = input . nextInt ( ) ;
  char [ ] [ ] c = new char [ row ] [ col ] ;
  for ( int i = 0 ;
  i < row ;
  i ++ ) c [ i ] [ 0 ] = input . charAt ( i ) ;
  char [ ] [ ] w = {
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
          Queue < int [ ] > queue = new LinkedList < > ( ) ;
          int [ ] [ ] check = new int [ col ] [ row ] ;
          for ( int k = 0 ;
          k < row ;
          k ++ ) {
            for ( int [ ] move : w ) {
              int y = v [ 0 ] + move [ 0 ] ;
              int x = v [ 1 ] + move [ 1 ] ;
              if ( c [ y - 1 ] [ x - 1 ] == '.' && check [ y ] [ x ] == - 1 ) {
                check [ y ] [ x ] = check [ v [ 0 ] ] [ v [ 1 ] ] + 1 ;
                queue . add ( y , x ) ;
              }
            }
          }
          System . out . println ( check [ gy ] [ gx ] ) ;
        }
        