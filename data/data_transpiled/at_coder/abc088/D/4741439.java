@ VisibleForTesting static void input ( LinkedHashMap < Integer , Integer > maze ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] maze = new String [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) maze [ i ] = input . nextLine ( ) ;
  int [ ] [ ] reached = new int [ W ] [ H ] ;
  int score = - 1 ;
  int count = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    count += maze [ i ] . indexOf ( '#' ) ;
  }
  Deque < Integer > que = new ArrayDeque < > ( ) ;
  que . add ( new Integer [ ] {
    0 , 0 }
    ) ;
    boolean flag = false ;
    while ( que . size ( ) > 0 ) {
      int py = que . pop ( ) ;
      int px = que . pop ( ) ;
      int [ ] dy = new int [ ] {
        0 , 1 , 0 , - 1 }
        ;
        int [ ] dx = new int [ ] {
          1 , 0 , - 1 , 0 }
          ;
          for ( int j = 0 , i = 0 ;
          j < dx ;
          j ++ ) {
            int ny = py + j ;
            int nx = px + i ;
            if ( ny < 0 || ny >= H || nx < 0 || nx >= W ) continue ;
            if ( maze [ ny ] . charAt ( nx ) == '#' ) continue ;
            if ( reached [ ny ] [ nx ] > 0 ) continue ;
            que . add ( new Integer [ ] {
              ny , nx }
              ) ;
              reached [ ny ] [ nx ] += reached [ py ] [ px ] + 1 ;
              if ( ny == H - 1 && nx == W - 1 ) {
                score = reached [ ny ] [ nx ] ;
                flag = true ;
                break ;
              }
            }
            if ( flag ) break ;
          }
          if ( flag ) {
            score = H * W - score - count - 1 ;
            System . out . println ( score ) ;
          }
          else System . out . println ( score ) ;
        }
        