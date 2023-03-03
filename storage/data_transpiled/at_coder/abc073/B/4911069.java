public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i <= N ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    res += r - l + 1 ;
  }
  return res ;
}
