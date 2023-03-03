public static int N = Integer . parseInt ( input ) {
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] li = new int [ N ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = r - 1 ;
    j >= l ;
    j -= 1 ) {
      li [ j ] = t ;
    }
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    System . out . println ( li [ i ] ) ;
  }
  return N ;
}
