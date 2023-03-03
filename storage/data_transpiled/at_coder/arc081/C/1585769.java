static final String description ( ) {
  final int inf = 10 ;
  final double gosa = 1.0 / 10 ;
  final int mod = 10 * 9 + 7 ;
  /* LI */
  /* LI_ */
  final int LI_ = inf - 1 ;
  /* LF */
  /* LS */
  /* I */
  /* F */
  /* S */
  input = "" ;
  /* S */
  char [ ] a = "S" . toCharArray ( ) ;
  int l = a . length ;
  int [ ] t = new int [ l ] ;
  for ( char c : string ) {
    t [ c ] = l ;
  }
  /* L */
  long [ ] b = new long [ l ] ;
  for ( int i = 0 , j = 0 ;
  i < l ;
  i ++ ) {
    t [ j ++ ] = l ;
  }
  /* L */
  b [ l ] = 1 ;
  b [ l ] = 0 ;
  for ( int i = 0 , j = 0 ;
  i < l ;
  i ++ ) {
    t [ j ++ ] = l ;
  }
  /* L */
  b [ l ] = 1 ;
  b [ l ] = 0 ;
  for ( int i = 0 , j = 0 ;
  i < l ;
  i ++ , j ++ ) {
    t [ j ] = i ;
    b [ j ] = Math . min ( b [ t [ j ] + 1 ] [ 0 ] + 1 , d , t [ j ] + 1 ) ;
  }
  String r = "" ;
  int i = 0 ;
  while ( i < l ) {
    r += b [ i ] . charAt ( 1 ) ;
    i = b [ i ] . length ( ) ;
  }
  return r ;
}
