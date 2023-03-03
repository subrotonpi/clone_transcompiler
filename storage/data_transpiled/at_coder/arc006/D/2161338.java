public static int [ ] [ ] calc ( int i0 , int j0 , int i1 , int j1 ) {
  int H = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  int W = Integer . parseInt ( input ( ) . nextLine ( ) ) ;
  int index = ".o" . index ;
  int [ ] [ ] C = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) C [ i ] = new int [ W ] ;
  Arrays . fill ( C [ i ] , index ) ;
  int [ ] CNT = {
    12 , 16 , 11 }
    ;
    int [ ] [ ] E = new int [ W ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < W ;
      j ++ ) {
        if ( C [ i ] [ j ] != null ) {
          ++ tmp ;
        }
        else {
          tmp = 0 ;
        }
        E [ i ] [ j ] = tmp ;
      }
    }
    int ans = 0 ;
    System . arraycopy ( C , 0 , E , 0 , W ) ;
    int [ ] Ei = E [ i ] ;
    int a = 0 ;
    int b = W ;
    for ( int j = W - 1 ;
    j >= 0 ;
    j -- ) {
      int e = Ei [ j ] ;
      while ( a > e ) {
        st [ -- j ] = e ;
        a = st [ e ] ;
        b = st [ e - 1 ] ;
      }
      if ( a < e ) {
        st [ j ] = new Integer ( e ) ;
        a = e ;
        b = j ;
      }
      Ei [ j ] = Math . min ( b - j + 1 , a ) ;
    }
    int [ ] [ ] D = new int [ W + 1 ] [ H + 1 ] ;
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      int tmp = 0 ;
      int [ ] Dj = D [ i ] ;
      int [ ] Di = D [ i + 1 ] ;
      for ( int j = 0 ;
      j < D . length ;
      j ++ ) {
        int v = C [ i ] [ j ] ;
        tmp += v ;
        Di [ j + 1 ] = tmp + Dj [ j + 1 ] ;
      }
    }
    / * ▁ int ▁ p ▁ = ▁ D [ i1 + 1 ] [ j1 + 1 ] - D [ i1 + 1 ] [ j0 ] - D [ i0 ]