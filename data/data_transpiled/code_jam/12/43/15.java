public static void readInput ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  int [ ] x = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  }
  /* solve 2 */
  int l = l - 1 ;
  int r = r - 1 ;
  int [ ] x = new int [ n ] ;
  for ( int i = l ;
  i < r ;
  i ++ ) {
    x [ i ] = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  }
  /* solve 2 */
  if ( l == r ) {
    /* return 0; */
  }
  int hl = ( int ) ( p - ( r - l ) * s ) - 1 ;
  int [ ] heads = new int [ l ] ;
  for ( int i = l ;
  i < r ;
  i ++ ) {
    if ( x [ i ] == r ) {
      heads [ i ] = i ;
    }
  }
  /* return */
  int [ ] result = new int [ l ] ;
  int oh = l - 1 ;
  for ( int i = 0 ;
  i < heads . length ;
  i ++ ) {
    int h = heads [ i ] ;
    float ss = ( float ) ( p - hl ) / ( r - h ) ;
    int [ ] res = solve2 ( oh + 1 , h , x , hl , ss ) ;
    result += ( res . clone ( ) ) ;
    oh = h ;
  }
  /* return */
  if ( x [ l ] != r ) {
    int [ ] r1 = solve ( l , x [ l ] , x ) ;
    int [ ] r2 = solve ( x [ l ] + 1 , r , x ) ;
    System . out . println ( ">" + r1 [ 0 ] ) ;
    System . out . println ( ">" + r2 [ 0 ] ) ;
    int r2h = Math . max ( r2 , 0 ) ;
    if ( r1 [ r1 . length - 1 ] <= r2h ) {
      int hh = r1 [ r1 . length - 1 ] ;
      r1 = Arrays . copyOf ( r1 , r1 . length + r2h - hh + 1 ) ;
    }
  }
  else {
    /* return 0; */
  }
  /* main */
  int t = Integer . parseInt ( readLine ( ) ) ;
  for ( int tt = 0 ;
  tt < t ;
  tt ++ ) {
    int