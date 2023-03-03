public static String [ ] [ ] getHW ( int H , int W ) {
  String [ ] [ ] Ss = new String [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    Ss [ i ] = new String [ W ] ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      Ss [ i ] [ j ] = input . substring ( i , j + 1 ) ;
    }
  }
  Arrays . sort ( Ss [ 0 ] ) ;
  Arrays . sort ( Ss [ 0 ] ) ;
  String [ ] [ ] ans = new String [ Ss [ 0 ] . length ] [ ] ;
  for ( int i = 1 ;
  i < Ss . length - 1 ;
  i ++ ) {
    String [ ] nums = new String [ Ss [ i ] . length - 1 ] ;
    for ( int j = 1 ;
    j < Ss [ i ] . length - 1 ;
    j ++ ) {
      int num = 0 ;
      if ( Ss [ i ] [ j ] . equals ( "." ) ) {
        if ( Ss [ i + 1 ] [ j ] . equals ( "#" ) ) num ++ ;
        if ( Ss [ i + 1 ] [ j + 1 ] . equals ( "#" ) ) num ++ ;
        if ( Ss [ i + 1 ] [ j - 1 ] . equals ( "#" ) ) num ++ ;
        if ( Ss [ i + 1 ] [ j - 1 ] . equals ( "#" ) ) num ++ ;
        if ( Ss [ i - 1 ] [ j ] . equals ( "#" ) ) num ++ ;
        if ( Ss [ i ] [ j + 1 ] . equals ( "#" ) ) num ++ ;
        if ( Ss [ i ] [ j - 1 ] . equals ( "#" ) ) num ++ ;
        nums [ i ] [ j ] = Integer . toString ( num ) ;
      }
      else nums [ i ] [ j ] = "#" ;
    }
  }
  System . out . println ( Arrays . toString ( nums ) ) ;
  return ans ;
}
