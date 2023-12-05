public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    res += b - a + 1 ;
  }
  return res ;
}
