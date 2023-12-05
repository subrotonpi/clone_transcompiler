public static int a ( ) {
  int [ ] list = Integer . parseInt ( input ( ) ) ;
  boolean flag = false ;
  int ans = 30 ;
  for ( int i = 0 ;
  i < 31 ;
  i ++ ) {
    for ( int j : list ) {
      if ( j % ( 2 * i ) != 0 ) {
        if ( ! ( flag ) ) {
          flag = true ;
          ans = i - 1 ;
        }
      }
    }
  }
  return ans ;
}
