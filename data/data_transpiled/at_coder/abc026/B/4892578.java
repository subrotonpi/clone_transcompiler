static final double [ ] square ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Arrays . sort ( a ) ;
  double ans = 0 ;
  return a ;
}
