public static String [ ] [ ] [ ] getHW ( int H , int W ) {
  String [ ] a = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) a [ i ] = new String [ W ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) a [ i ] [ i ] = new String ( input ) ;
  String [ ] [ ] ans = new String [ H ] [ W ] ;
  ans [ 0 ] = new String [ W ] ;
  ans [ 1 ] [ 0 ] = "r" ;
  for ( int i = 0 ;
  i < H - 2 ;
  i ++ ) ans [ 1 ] [ i ] = new String [ W ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) ans [ 1 ] [ i ] [ 0 ] = "p" ;
  for ( int i = 0 ;
  i < H - 2 ;
  i ++ ) ans [ 1 ] [ i ] [ 0 ] = "r" ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( a [ i ] [ j ] . equals ( "#" ) ) ans [ 1 ] [ j ] = "p" ;
      else if ( j % 2 == 0 ) ans [ 1 ] [ j ] = "r" ;
      else ans [ 1 ] [ j ] = "b" ;
    }
  }
  String [ ] [ ] r = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) r [ i ] = new String [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) for ( int j = 0 ;
  j < H ;
  j ++ ) for ( int i = 0 ;
  j < W ;
  j ++ ) if ( ans [ i ] [ j ] . equals ( "p" ) || ans [ i ] [ j ] . equals ( "b" ) ) r [ i ] [ j ] = "#" ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) System . out . println ( Arrays . toString ( r [ i ] ) ) ;
  System . out . println ( Arrays . toString ( b [ i ] ) ) ;
  return ans ;
}
