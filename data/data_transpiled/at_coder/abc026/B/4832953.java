static final double [ ] range ( int n ) {
  int r [ ] = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) r [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  r = new ArrayList < > ( r ) ;
  r [ n ] = r ;
  r [ n ] = r ;
  return r ;
}
