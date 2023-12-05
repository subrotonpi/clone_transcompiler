public static int solve ( String s , int k ) {
  for ( int i = 0 ;
  i < Integer . MAX_VALUE ;
  i ++ ) {
    int d = Integer . parseInt ( s . substring ( i , i + 1 ) ) ;
    if ( d > 1 ) return d ;
  }
  return 1 ;
}
