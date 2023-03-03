public static int N ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int tab = 1 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '+' ) tab ++ ;
    if ( S . charAt ( i ) == '-' ) tab -- ;
    if ( tab > L ) {
      tab = 1 ;
      ans ++ ;
    }
  }
  return ans ;
}
