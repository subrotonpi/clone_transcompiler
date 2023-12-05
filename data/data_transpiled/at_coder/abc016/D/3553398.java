public static int x1 = 0 , y1 = 0 , x2 = 0 , y2 = 0 ;
int [ ] r = {
  x2 - x1 , y2 - y1 }
  ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] p = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    p [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p1 = p [ i ] ;
    int q1 = p [ i ] ;
    int p2 = p [ ( i + 1 ) % N ] ;
    int q2 = p [ ( i + 1 ) % N ] ;
    int [ ] r0 = {
      p2 - p1 , q2 - q1 }
      ;
      int [ ] r1 = {
        p1 - x1 , q1 - y1 }
        ;
        int [ ] r2 = {
          p2 - x1 , q2 - y1 }
          ;
          int [ ] r3 = {
            x1 - p1 , y1 - q1 }
            ;
            int [ ] r4 = {
              x2 - p1 , y2 - q1 }
              ;
              int S1 = ( r1 [ 0 ] * r [ 1 ] - r1 [ 1 ] * r [ 0 ] ) * ( r2 [ 0 ] * r [ 1 ] - r2 [ 1 ] * r [ 0 ] ) ;
              int S2 = ( r3 [ 0 ] * r0 [ 1 ] - r3 [ 1 ] * r0 [ 0 ] ) * ( r4 [ 0 ] * r0 [ 1 ] - r4 [ 1 ] * r0 [ 0 ] ) ;
              if ( S1 < 0 && S2 < 0 ) ans ++ ;
            }
            ans /= 2 ;
            ans ++ ;
            System . out . println ( ans ) ;
            return ans ;
          }
          