public static int N ( ) {
  int N = Integer . parseInt ( input ) ;
  String s = input . nextLine ( ) ;
  int ans = 0 ;
  int x = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == 'I' ) x ++ ;
    else x -- ;
    if ( x > ans ) ans = x ;
  }
  return ans ;
}
