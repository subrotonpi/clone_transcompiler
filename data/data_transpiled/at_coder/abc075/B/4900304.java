public static int [ ] [ ] getS ( ) {
  int H = Integer . parseInt ( input . readLine ( ) ) ;
  int W = Integer . parseInt ( input . readLine ( ) ) ;
  String [ ] [ ] S = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    String [ ] S_temp = input . split ( " " ) ;
    for ( String s : S_temp ) {
      S [ i ] [ i ] = s ;
    }
  }
  int [ ] [ ] T = new int [ W ] [ H ] ;
  for ( int j = 0 ;
  j < H ;
  j ++ ) {
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < S [ i ] . length ;
      j ++ ) {
        String sj = S [ i ] [ j ] ;
        if ( sj != '.' ) {
          T [ i ] [ j ] = sj ;
          continue ;
        }
        int count = 0 ;
        if ( 0 <= i - 1 && 0 <= j - 1 && S [ i - 1 ] [ j - 1 ] == '#' ) count ++ ;
        if ( 0 <= i - 1 && S [ i - 1 ] [ j ] == '#' ) count ++ ;
        if ( 0 <= i - 1 && S [ i - 1 ] [ j ] == '#' ) count ++ ;
        if ( 0 <= i - 1 && j + 1 < W && S [ i - 1 ] [ j + 1 ] == '#' ) count ++ ;
        if ( 0 <= i - 1 && S [ i ] [ j ] == '#' ) count ++ ;
        if ( j + 1 < W && S [ i ] [ j + 1 ] == '#' ) count ++ ;
        if ( i + 1 < H && 0 <= j - 1 && S [ i + 1 ] [ j - 1 ] == '#' ) count ++ ;
        if ( i + 1 < H && j + 1 < W && S [ i + 1 ] [ j + 1 ] == '#' ) count ++ ;
        T [ i ] [ j ] = count ;
      }
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      System . out . print ( T [ i ] [ j ] ) ;
    }
    System . out . println ( "