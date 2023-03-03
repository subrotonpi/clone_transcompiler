public static int N ( ) {
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    L . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  /* Aoki */
  int maxi = - 100000000 ;
  for ( int j = 0 ;
  j < L . size ( ) ;
  j ++ ) {
    int tmp = 0 ;
    if ( j != i ) {
      if ( j < i ) {
        int [ ] T = new int [ j ] ;
        for ( int k = 0 ;
        k < T . length ;
        k ++ ) {
          if ( k % 2 == 1 ) {
            tmp += T [ k ] ;
          }
        }
        if ( maxi < tmp ) {
          choice = j ;
          maxi = tmp ;
        }
      }
    }
  }
  int maxi = - 10000000000000 ;
  for ( int i = 0 ;
  i < L . size ( ) ;
  i ++ ) {
    int aokiChoice = aoki ( i , L ) ;
    int tmp = 0 ;
    if ( i < aokiChoice ) {
      int [ ] T = L . subList ( i , aokiChoice + 1 ) ;
      for ( int j = 0 ;
      j < T . length ;
      j ++ ) {
        if ( j % 2 == 0 ) {
          tmp += T [ j ] ;
        }
      }
    }
    else if ( i > aokiChoice ) {
      int [ ] T = L . subList ( aokiChoice , i + 1 ) ;
      for ( int j = 0 ;
      j < T . length ;
      j ++ ) {
        if ( j % 2 == 0 ) {
          tmp += T [ j ] ;
        }
      }
    }
    maxi = Math . max ( tmp , maxi ) ;
  }
  System . out . println ( maxi ) ;
  return maxi ;
}
