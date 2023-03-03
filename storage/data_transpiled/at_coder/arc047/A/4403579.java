public static int N ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = input . nextLine ( ) ;
  int tmp = 1 ;
  int res = 0 ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) == '+' ) tmp ++ ;
    else tmp -- ;
    if ( tmp > L ) {
      tmp = 1 ;
      res ++ ;
    }
  }
  return res ;
}
