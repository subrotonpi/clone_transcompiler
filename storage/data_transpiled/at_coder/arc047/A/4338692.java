public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = input . nextLine ( ) ;
  int cnt = 1 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '+' ) {
      cnt ++ ;
    }
    else {
      cnt -- ;
    }
    if ( cnt > b ) {
      cnt = 1 ;
      ans ++ ;
    }
  }
  return ans ;
}
