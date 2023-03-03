public static int [ ] [ ] [ ] createList ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] D = new int [ A ] [ B ] ;
  for ( int i = 0 ;
  i < D . length ;
  i ++ ) {
    D [ i ] = Lists . newArrayList ( ) ;
    for ( int j = 0 ;
    j < D [ i ] . length ;
    j ++ ) {
      D [ i ] [ j ] = Lists . newArrayList ( ) ;
    }
  }
  int N = 101 ;
  int [ ] [ ] F = new int [ N ] [ N ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    for ( int b = 0 ;
    b < N ;
    b ++ ) {
      int res = 0 ;
      for ( int x = 0 ;
      x < A ;
      x ++ ) {
        for ( int y = 0 ;
        y < B ;
        y ++ ) {
          res = Math . max ( res , D [ x ] [ y ] - ( x + 1 ) * a - ( y + 1 ) * b ) ;
        }
      }
      F [ a ] [ b ] = res ;
    }
  }
  for ( int x = 0 ;
  x < N ;
  x ++ ) {
    for ( int y = 0 ;
    y < N ;
    y ++ ) {
      F [ x ] [ y ] [ x ] = 1 ;
    }
  }
  return F ;
}
