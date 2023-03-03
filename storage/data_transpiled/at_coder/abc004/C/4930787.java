static final String getString ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] card = new int [ 6 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) card [ ( i % 5 ) ] = i + 1 ;
  return card [ n ] ;
}
