public static void serch ( int x , int y , int [ ] p ) {
  if ( x < 0 || W <= y || y < 0 || H <= x || meiro [ x ] [ y ] == "#" ) {
    return ;
  }
  if ( memo [ x ] [ y ] != null ) {
    p = new int [ ] {
      x , y }
      ;
      return ;
    }
    memo [ x ] [ y ] = 1 ;
    kyo [ x ] [ y ] = kyo [ p [ 0 ] ] [ p [ 1 ] ] + 1 ;
    p = new int [ ] {
      x , y }
      ;
      serch ( x + 1 , y , p ) ;
      serch ( x - 1 , y , p ) ;
      serch ( x , y + 1 , p ) ;
      serch ( x , y - 1 , p ) ;
    }
    int H = Integer . parseInt ( input . nextLine ( ) ) ;
    int W = Integer . parseInt ( input . nextLine ( ) ) ;
    int sx = 0 , sy = 0 ;
    int gx = H - 1 , gy = W - 1 ;
    meiro = new String [ H ] ;
    for ( int l = 0 ;
    l < H ;
    l ++ ) {
      meiro [ l ] = new String ( input . nextLine ( ) ) ;
    }
    int counter = 0 ;
    for ( int a = 0 ;
    a < H ;
    a ++ ) {
      for ( int b = 0 ;
      b < W ;
      b ++ ) {
        int n = meiro [ a ] [ b ] == "." ? 1 : 0 ;
        counter += n ;
      }
    }
    int [ ] dx = {
      1 , 0 , - 1 , 0 }
      ;
      int [ ] dy = {
        0 , 1 , 0 , - 1 }
        ;
        Stack < Integer > stk = new Stack < Integer > ( ) ;
        for ( int l = 0 ;
        l < W ;
        l ++ ) {
          stk . push ( new Integer ( sx ) ) ;
          stk . push ( new Integer ( sy ) ) ;
        }
        memo = new int [ W ] [ H ] ;
        memo [ sx ] = 1 ;
        dis = new int [ W ] [ H ] ;
        while ( stk . size ( ) > 0 ) {
          x = stk . pop ( ) ;
          y = stk . pop ( ) ;
          for ( int i = 0 ;
          i < 4 ;
          i ++ ) {
            int xx = x + dx [ i ] , yy = y + dy [ i ] ;
            if ( xx < 0 ||