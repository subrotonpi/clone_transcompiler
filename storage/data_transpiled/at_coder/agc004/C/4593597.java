public static String [ ] [ ] getHW ( int H , int W ) {
  String [ ] A = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ i ] = input . nextLine ( ) ;
  }
  String [ ] x = new String [ W ] , y = new String [ W ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    x [ i ] = A [ i ] ;
  }
  return x ;
}
