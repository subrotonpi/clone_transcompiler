public static List < Integer > ints ( ) {
  return Lists . newArrayList ( ) ;
  for ( String s : input . nextLine ( ) . split ( " " ) ) {
    int m = 10 * 9 + 7 ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] A = ints ( ) ;
    int [ ] B = ints ( ) ;
    int [ ] Ainv = new int [ n ] ;
    int [ ] Binv = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      Ainv [ A [ i ] ] = i ;
      Binv [ B [ i ] ] = i ;
    }
    int [ ] v2NanameIndex = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      v2NanameIndex [ i ] = 0 ;
    }
    for ( int v = 0 ;
    v < n ;
    v ++ ) {
      v2NanameIndex [ v ] = Ainv [ v ] - Binv [ v ] + ( n - 1 ) ;
    }
    int [ ] [ ] dp = new int [ 2 * n ] [ n - 1 ] ;
    int [ ] [ ] nanameDp = new int [ 2 * n - 1 ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        if ( i == 0 || j == 0 ) {
          dp [ i ] [ j ] = 1 ;
        }
        else {
          dp [ i ] [ j ] = ( dp [ i ] [ j - 1 ] + dp [ i - 1 ] [ j ] ) % m ;
        }
        if ( A [ i ] == B [ j ] ) {
          int v = A [ i ] ;
          int nanaI = v2NanameIndex [ v ] ;
          int [ ] naDp = nanameDp [ nanaI ] ;
          dp [ i ] [ j ] = ( dp [ i ] [ j ] - ( naDp [ naDp . length - 1 ] + m ) ) % m ;
          naDp [ naDp . length - 1 ] = dp [ i ] [ j ] ;
          for ( int k = 1 ;
          k < naDp . length ;
          k ++ ) {
            naDp [ k ] = ( naDp [ k ] + naDp [ k - 1 ] ) % m ;
          }
        }
      }
    }
    