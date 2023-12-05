static final double [ ] range ( int i ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] r = new int [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) r [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( r ) ;
  r = new int [ n ] ;
  r [ n ] = r ;
  c = 0 ;
  return r ;
}
