public static int [ ] [ ] [ ] input ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] [ ] ahw = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    ahw [ i ] = new int [ W ] ;
    ahw [ i ] [ 0 ] = Integer . parseInt ( input . readLine ( ) ) ;
    ahw [ i ] [ 1 ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] [ ] ans = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( ( ahw [ i ] [ j ] & 1 ) != 0 ) {
        if ( j < W - 1 ) {
          if ( ( ahw [ i ] [ j + 1 ] & 1 ) != 0 ) {
            ahw [ i ] [ j ] -- ;
            ahw [ i ] [ j + 1 ] ++ ;
            ans [ i ] [ j ] = 1 ;
          }
        }
      }
      if ( ( ahw [ i ] [ j ] & 1 ) != 0 ) {
        if ( ( ahw [ i ] [ j + 1 ] & 1 ) != 0 ) {
          ahw [ i ] [ j ] -- ;
          ahw [ i ] [ j + 1 ] ++ ;
          ans [ i ] [ j ] = 1 ;
        }
      }
      if ( ( ahw [ i ] [ j ] & 1 ) != 0 ) {
        ahw [ i ] [ j ] -- ;
        ahw [ i ] [ j + 1 ] ++ ;
        ans [ i ] [ j ] = 1 ;
      }
      if ( ( ahw [ i ] [ j ] & 1 ) != 0 ) {
        ahw [ i ] [ j ] -- ;
        ahw [ i ] [ j + 1 ] ++ ;
        ans [ i ] [ j ] = 1 ;
      }
    }
  }
  System . out . println ( ans . length ) ;
  for ( int [ ] [ ] a : ans ) {
    System . out . println ( a [ 0 ] + 1 + "," + a [ 1 ] + 1 + "," + a [ 2 ] + 1 + "," + a [ 3 ] + 1 ) ;
  }
  return ans ;
}
