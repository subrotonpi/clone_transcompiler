public static int [ ] readIntRange ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] w = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  return w ;
}
