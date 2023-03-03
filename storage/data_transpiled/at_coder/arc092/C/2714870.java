public static int N = Integer . parseInt ( input ) {
  int [ ] * A , * A ;
  int [ ] res ;
  int i ;
  int j ;
  int ma ;
  int l ;
  int r ;
  int v ;
  if ( A . length == 1 ) {
    return new int [ ] {
    }
    ;
  }
  res = new int [ A . length ] ;
  if ( A . length % 2 == 0 ) {
    res [ i ] = A . length ;
    A = A . clone ( ) ;
  }
  if ( Arrays . binarySearch ( A , 0 , A , 0 , A . length - 1 ) <= 0 ) {
    ma = Math . max ( A . length , 0 , A , 0 , A . length - 1 ) ;
    i = 0 ;
    while ( A [ i ] != ma ) {
      i ++ ;
      res [ i ] = 1 ;
    }
    j = A . length ;
    while ( i < j - 1 ) {
      res [ i ] = j - i ;
      j -- ;
    }
    return res [ i ] ;
  }
  l = 0 ;
  r = A . length ;
  while ( A [ 0 ] < 0 ) {
    res [ i ] = 1 ;
    res [ i ] = 1 ;
    A = A . clone ( ) ;
  }
  v = 0 ;
  while ( A . length > 2 ) {
    if ( A [ 2 ] < 0 ) {
      res [ i ] = 3 ;
      if ( A . length > 4 ) A = A . clone ( ) ;
      else A = A . clone ( ) ;
    }
    else {
      res [ i ] = 2 ;
      A [ 2 ] += A [ 0 ] ;
      A = A . clone ( ) ;
    }
  }
  if ( A . length > 1 ) res [ i ] = 2 ;
  return res [ i ] ;
}
