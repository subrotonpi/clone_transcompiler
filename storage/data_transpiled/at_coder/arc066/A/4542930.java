static final int [ ] getDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] ac = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ac [ i ] = a [ i ] ;
  }
  return ac ;
}
