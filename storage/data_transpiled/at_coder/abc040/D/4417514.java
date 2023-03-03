@ VisibleForTesting static LinkedHashMap < Integer , Integer > map ( int n ) {
  final int [ ] par = new int [ n ] ;
  final int [ ] rank = new int [ n ] ;
  final int [ ] size = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  Collections . sort ( ans , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      System . out . println ( o1 ) ;
      return o2 ;
    }
  }
  ) ;
  final int [ ] I = new int [ n ] ;
  final int [ ] LS = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    System . out . println ( i ) ;
  }
  final int [ ] S = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  }
  final int [ ] IR = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i == j ) {
          par [ i ] = i ;
        }
      }
    }
    final int [ ] [ ] ir = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          int x = ir [ i ] [ j ] ;
          int y = ir [ i ] [ j ] ;
          int w = ir [ i ] [ j ] ;
          unite ( x , y ) ;
          j ++ ;
        }
      }
    }
  }
  final int [ ] [ ] n = new int [ n ] [ ] ;
  final int m = n ;
  final int [ ] [ ] v = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    n [ i ] = n [ i ] ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    n [ i ] = n [ i ] ;
  }
  return ans ;
}
