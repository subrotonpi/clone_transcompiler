public static int [ ] readIntArrayInRange ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  int [ ] aArray = new int [ N ] ;
  int [ ] bArray = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    aArray [ i ] = a ;
    bArray [ i ] = b ;
  }
  int [ ] cArray = new int [ M ] ;
  int [ ] dArray = new int [ M ] ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int c = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    cArray [ i ] = c ;
    dArray [ i ] = d ;
  }
  int ans ;
  int key ;
  int sum = 1000000000 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sum = 1000000000 ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      key = Math . abs ( aArray [ i ] - cArray [ j ] ) + Math . abs ( bArray [ i ] - dArray [ j ] ) ;
      if ( sum > key ) {
        ans = j + 1 ;
        sum = key ;
      }
    }
  }
  System . out . println ( ans ) ;
  return aArray ;
}
