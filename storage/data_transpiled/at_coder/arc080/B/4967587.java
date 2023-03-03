static final int [ ] [ ] resize ( int h , int w ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ h ] [ w ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] mat = new int [ h ] [ w ] ;
  int st = 0 ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    for ( int idx = st ;
    idx < st + a [ i ] ;
    idx ++ ) {
      mat [ idx / w ] [ idx % w ] = i + 1 ;
    }
    st += a [ i ] ;
  }
  for ( int i = 1 ;
  i < h ;
  i += 2 ) {
    mat [ i ] = mat [ i ] . clone ( ) ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      System . out . print ( mat [ i ] [ j ] + " " ) ;
    }
    System . out . println ( "" ) ;
  }
  return mat ;
}
