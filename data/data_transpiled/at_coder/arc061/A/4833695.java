public static int input ( ) {
  int ans = 0 ;
  for ( int i = 0 ;
  i < 1 << ( S . length - 1 ) ;
  i ++ ) {
    List < Integer > li = new ArrayList < Integer > ( ) ;
    int last = 0 ;
    for ( int j = 0 ;
    j < S . length - 1 ;
    j ++ ) {
      if ( ( ( i >> j & 1 ) == 1 ) && ( i != j ) ) {
        li . add ( Integer . parseInt ( S . substring ( last , j + 1 ) ) ) ;
        last = j + 1 ;
      }
    }
    if ( ( last != S . length ) && ( i != last ) ) {
      li . add ( Integer . parseInt ( S . substring ( last ) ) ) ;
    }
    ans += Integer . parseInt ( li . toString ( ) ) ;
  }
  return ans ;
}
