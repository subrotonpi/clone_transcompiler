public static int [ ] [ ] parse ( String input ) {
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] L = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    L [ i ] = new int [ W ] ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      L [ i ] [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
  }
  int i = 0 ;
  int j = 0 ;
  int cnt = 0 ;
  int [ ] [ ] ansArray = new int [ H ] [ W ] ;
  int num = 0 ;
  while ( num < H * W - 1 ) {
    if ( L [ i ] [ j ] % 2 == 0 ) {
      if ( i % 2 == 0 && j == W - 1 ) {
        i ++ ;
      }
      else if ( i % 2 == 0 ) {
        j ++ ;
      }
      else if ( i % 2 != 0 && j == 0 ) {
        i ++ ;
      }
      else {
        j -- ;
      }
    }
    else {
      int befi = i + 1 , befj = j + 1 ;
      L [ i ] [ j ] -- ;
      if ( i % 2 == 0 && j == W - 1 ) {
        i ++ ;
      }
      else if ( i % 2 == 0 ) {
        j ++ ;
      }
      else if ( i % 2 != 0 && j == 0 ) {
        i ++ ;
      }
      else {
        j -- ;
      }
      L [ i ] [ j ] ++ ;
      int afti = i + 1 , aftj = j + 1 ;
      ansArray [ num ] [ 0 ] = befi ;
      ansArray [ num ] [ 1 ] = befj ;
      ansArray [ num ] [ 2 ] = afti ;
      ansArray [ num ] [ 3 ] = aftj ;
      cnt ++ ;
    }
    num ++ ;
  }
  System . out . println ( cnt ) ;
  for ( int i = 0 ;
  i < ansArray . length ;
  i ++ ) {
    System . out . println ( ansArray [ i ] [ 0 ] + " " + ansArray [ i ] [ 1 ] + " " + ansArray [ i ] [ 2 ] + " " + ansArray [ i ] [ 3 ] ) ;
  }
  return L ;
}
