@ OperatorFactory public static String [ ] [ ] getOperators ( ) {
  Scanner fi = new Scanner ( System . in ) ;
  int maxn = 500 ;
  int cnt = 0 ;
  for ( int run = 0 ;
  run < Integer . parseInt ( fi . nextLine ( ) ) ;
  run ++ ) {
    int R = Integer . parseInt ( fi . nextLine ( ) ) ;
    int C = Integer . parseInt ( fi . nextLine ( ) ) ;
    int D = Integer . parseInt ( fi . nextLine ( ) ) ;
    int [ ] [ ] a = new int [ R ] [ D ] ;
    for ( int i = 0 ;
    i < R ;
    i ++ ) {
      int row = Integer . parseInt ( fi . nextLine ( ) ) ;
      a [ i ] = row ;
    }
    int K = - 1 ;
    for ( int i1 = 0 ;
    i1 < R ;
    i1 ++ ) {
      for ( int i2 = i1 + 2 ;
      i2 < R ;
      i2 ++ ) {
        for ( int j1 = 0 ;
        j1 < C ;
        j1 ++ ) {
          int j2 = j1 + ( i2 - i1 ) ;
          if ( j2 >= C ) continue ;
          double cx = ( i1 + i2 ) * 0.5 ;
          double cy = ( j1 + j2 ) * 0.5 ;
          double dx = 0 , dy = 0 ;
          for ( int i = i1 ;
          i <= i2 ;
          i ++ ) {
            for ( int j = j1 ;
            j <= j2 ;
            j ++ ) {
              if ( ( i >= i1 && j >= i2 ) || ( j >= j1 && j >= j2 ) ) continue ;
              dx += ( i - cx ) * a [ i ] [ j ] ;
              dy += ( j - cy ) * a [ i ] [ j ] ;
            }
          }
          if ( dx == 0.0 && dy == 0.0 ) K = Math . max ( K , i2 - i1 + 1 ) ;
        }
      }
    }
  }
  String res ;
  if ( K == - 1 ) {
    res = "IMPOSSIBLE" ;
  }
  else {
    res = K ;
  }
  System . out . println ( "Case #" + ( run + 1 ) + ": " + res ) ;
  return a ;
}
