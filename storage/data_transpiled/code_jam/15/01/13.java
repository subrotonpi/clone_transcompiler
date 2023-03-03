static int solve ( String s ) {
  final int have = 0 ;
  int ret = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    int v = Integer . parseInt ( s . substring ( i , i + 1 ) ) ;
    if ( have < i ) {
      ret ++ ;
      have ++ ;
    }
    have += v ;
  }
  return ret ;
}
