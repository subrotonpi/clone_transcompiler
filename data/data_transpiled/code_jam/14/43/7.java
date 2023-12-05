@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] [ ] line ( ) {
  /* TODO Auto-generated method stub from java.util.Scanner */
  /* TODO Auto-generated method stub from java.util.Scanner */
  int T = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  /* TODO Auto-generated method stub from java.util.Scanner */
  int H = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  int B = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  char [ ] [ ] M = new char [ W ] [ H ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    M [ i ] = '.' ;
  }
  for ( int i = 0 ;
  i < B ;
  i ++ ) {
    int x1 = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int y1 = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int x2 = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int y2 = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    for ( int y = 0 ;
    y < y2 ;
    y ++ ) {
      M [ y ] = M [ y ] [ 0 ] + ( x1 >> 1 ? 1 : 0 ) + ( x2 - x1 + 1 ) * "#" + M [ y ] [ x2 + 1 ] ;
    }
  }
  Arrays . sort ( M ) ;
  int A = 0 ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    Queue < Integer > Q = new LinkedList < Integer > ( ) ;
    Q . add ( new Integer ( i ) ) ;
    int [ ] DIR = {
      new int [ ] {
        0 , 1 }
        , new int [ ] {
          - 1 , 0 }
          , new int [ ] {
            0 , - 1 }
            , new int [ ] {
              1 , 0 }
            }
            ;
            while ( Q . size ( ) > 0 ) {
              int x = Q . poll ( ) ;
              int y = Q . poll ( ) ;
              int D = Q . poll ( ) ;
              if ( x < 0 || y < 0 || x >= W || y >= H || M [ y ] [ x ] != '.' ) continue ;
              M [ y ] [ x ] = Integer . toString ( A ) . substring ( 0 ) ;
              if ( y