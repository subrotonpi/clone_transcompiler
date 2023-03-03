public static int [ ] [ ] [ ] A ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] [ ] A = new int [ N ] [ 101 ] [ 101 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = new int [ N ] [ ] ;
    for ( int j = 0 ;
    j < A [ i ] . length ;
    j ++ ) {
      A [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int D = 0 ;
  for ( int Cx = 0 ;
  Cx < 101 ;
  Cx ++ ) {
    for ( int Cy = 0 ;
    Cy < 101 ;
    Cy ++ ) {
      int H = 0 ;
      boolean F = true ;
      for ( int j = 0 ;
      j < A . length ;
      j ++ ) {
        if ( H < 1 ) {
          if ( A [ i ] [ 2 ] == 0 ) {
            continue ;
          }
          H = A [ i ] [ 2 ] + Math . abs ( A [ i ] [ 0 ] - Cx ) + Math . abs ( A [ i ] [ 1 ] - Cy ) ;
        }
        else if ( A [ i ] [ 2 ] == Math . max ( H - Math . abs ( A [ i ] [ 0 ] - Cx ) - Math . abs ( A [ i ] [ 1 ] - Cy ) , 0 ) ) {
          continue ;
        }
        else {
          F = false ;
          break ;
        }
      }
      for ( int j = 0 ;
      j < A . length ;
      j ++ ) {
        if ( ! ( A [ i ] [ 2 ] == Math . max ( H - Math . abs ( A [ i ] [ 0 ] - Cx ) - Math . abs ( A [ i ] [ 1 ] - Cy ) , 0 ) ) ) {
          F = false ;
          break ;
        }
      }
      if ( F == true && H >= 1 && D == 0 ) {
        D = 1 ;
        System . out . println ( Cx + " " + Cy + " " + H ) ;
      }
    }
  }
  return A ;
}
