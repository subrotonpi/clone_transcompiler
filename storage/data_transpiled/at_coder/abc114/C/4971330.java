static final int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  for ( int r = 1 ;
  r <= 10 ;
  r ++ ) {
    for ( String s : Splitter . on ( "357" ) . split ( " " ) ) {
      int d = Integer . parseInt ( StringUtils . trimToEmpty ( s ) ) ;
      if ( '3' . equals ( s ) && '5' . equals ( s ) && '7' . equals ( s ) && d <= n ) {
        ans ++ ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
