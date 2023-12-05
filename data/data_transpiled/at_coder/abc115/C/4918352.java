public static int [ ] scan ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) , K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] hArray = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    hArray [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( hArray ) ;
  int sa [ ] = 0 ;
  return sa ;
}
