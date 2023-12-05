public static int N ( ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = l -- ;
    d [ r ] *= - 1 ;
    d [ l ] *= - 1 ;
  }
  int now = 0 ;
  return now ;
}
