@ GwtIncompatible ( "java.util.concurrent.atomic.LinkedList" ) public static int [ ] [ ] breadthFirstSearch ( String [ ] map_ , int s_y , int s_x , char wall ) {
  Queue < Integer > ques = new LinkedList < > ( ) ;
  ques . add ( new Integer ( s_y ) ) ;
  int [ ] [ ] counts = new int [ map_ . length ] [ 2 ] ;
  for ( int y = 0 ;
  y < H + 2 ;
  y ++ ) {
    for ( int x = 0 ;
    x < W + 2 ;
    x ++ ) {
      if ( map_ [ y ] . charAt ( x ) == 's' ) {
        s_y = y ;
        s_x = x ;
      }
    }
  }
  int a = breadthFirstSearch ( map_ , s_y , s_x ) ;
  if ( a == - 1 || a > 2 ) {
    System . out . println ( "NO" ) ;
  }
  else {
    System . out . println ( "YES" ) ;
  }
  while ( ( ques . size ( ) ) > 0 ) {
    Integer x_y = ques . poll ( ) ;
    int y = x_y . intValue ( ) ;
    int x = x_y . intValue ( ) ;
    if ( counts [ y ] [ x ] == - 1 ) {
      int [ ] i_js = {
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
              int new_count = 100 ;
              char now_map = map_ [ y ] . charAt ( x ) ;
              boolean goal = false ;
              for ( int i = 0 ;
              i < i_js . length ;
              i ++ ) {
                int i = i_js [ i ] ;
                int j = i_js [ i ] ;
                int tmp = counts [ y + i ] [ x + j ] ;
                char tmp2 = map_ [ y + i ] . charAt ( x + j ) ;
                if ( tmp != - 1 ) {
                  if ( map_ [ y ] . charAt ( x ) == '#' ) {
                    if ( new_count > tmp + 1 ) {
                      new_count = tmp + 1 ;
                    }
                  }
                  else {
                    if ( new_count > tmp ) {
                      new_count = tmp ;
                    }
                  }
                }
                else if ( tmp2 != '+' ) {
                  if ( tmp2 == '#' ) {
                    ques . add ( new Integer ( y + i ) ) ;
                  }
                  else {
                    if ( tmp2 == 'g' ) {
                      goal = - true ;
                    }
                    ques . add ( new Integer ( i