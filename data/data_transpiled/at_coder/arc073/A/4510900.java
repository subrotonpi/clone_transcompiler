public static int N ( String input ) {
  int T = Integer . parseInt ( input ) ;
  int [ ] t = new int [ N ] ;
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input ) ;
  }
  int res = T ;
  int pre = t [ 0 ] ;
  for ( int i = 1 ;
  i < t . length ;
  i ++ ) {
    if ( t [ i ] < pre + T ) {
      res += t [ i ] - pre ;
    }
    else {
      res += T ;
    }
    pre = t [ i ] ;
  }
  System . out . println ( res ) ;
  return res ;
}
