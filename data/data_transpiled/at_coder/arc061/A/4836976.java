public static void input ( ) {
  s = input ;
  int l = s . length ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < 1 << ( l - 1 ) ;
  i ++ ) {
    int res = 0 ;
    int tmp = Integer . parseInt ( s . substring ( 0 , 1 ) ) ;
    for ( int j = 0 ;
    j < l - 1 ;
    j ++ ) {
      if ( ( ( i >> j ) & 1 ) == 1 ) {
        res += tmp ;
        tmp = Integer . parseInt ( s . substring ( j + 1 , 1 ) ) ;
      }
      else {
        tmp = tmp * 10 + Integer . parseInt ( s . substring ( j + 1 , 1 ) ) ;
      }
    }
    res += tmp ;
    ans += res ;
  }
  System . out . println ( ans ) ;
}
