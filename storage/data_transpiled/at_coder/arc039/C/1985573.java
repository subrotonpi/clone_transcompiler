public static int K = Integer . parseInt ( input ) {
  String S = input . nextLine ( ) ;
  int [ ] dxdys = {
    'R' , ( short ) 1 , ( short ) - 1 , ( short ) 0 , ( short ) 1 , ( short ) 0 , ( short ) - 1 }
    ;
    char [ ] inv = {
      'R' , 'L' , 'R' , 'U' , 'D' , 'U' }
      ;
      int x = 0 , y = 0 ;
      Map < Integer , Integer > boundary = new HashMap < Integer , Integer > ( ) ;
      for ( int i = 0 ;
      i < K ;
      i ++ ) {
        char c = S . charAt ( i ) ;
        int nx = boundary . get ( new Integer ( x ) ) . intValue ( ) ;
        int ny = boundary . get ( new Integer ( y ) ) . intValue ( ) ;
        nx += dxdys [ c ] [ 0 ] ;
        ny += dxdys [ c ] [ 1 ] ;
        boundary . put ( new Integer ( nx ) , new Integer ( ny ) ) ;
        for ( int cc : dxdys ) {
          int nnx = nx + dxdys [ cc ] [ 0 ] ;
          int nny = ny + dxdys [ cc ] [ 1 ] ;
          if ( ( nnx < nny ) || ( nny < nny ) ) {
            boundary . put ( new Integer ( nx ) , new Integer ( ny ) ) ;
            boundary . put ( new Integer ( nny ) , new Integer ( cc ) ) ;
            boundary . put ( new Integer ( nnx ) , new Integer ( nny ) ) ;
            boundary . put ( new Integer ( cc ) , new Integer ( nnx ) ) ;
            boundary . put ( new Integer ( nny ) , new Integer ( nny ) ) ;
          }
        }
        x = nx ;
        y = ny ;
      }
      System . out . println ( x + " " + y ) ;
      return x ;
    }
    