@ VisibleForTesting static Iterable < Integer > combinations ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int r = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] g = new int [ m ] [ n ] ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    int z = Integer . parseInt ( input . nextLine ( ) ) ;
    g [ x - 1 ] [ y - 1 ] = z ;
  }
  int ans = 0 ;
  for ( int xs : combinations ( n , p , q ) ) {
    int [ ] gs = new int [ n ] ;
    for ( int y = 0 ;
    y < m ;
    y ++ ) {
      gs [ y ] = Arrays . copyOf ( g [ x ] [ y ] , xs ) ;
    }
    Arrays . sort ( gs , Collections . reverseOrder ( ) ) ;
    ans = Math . max ( ans , Arrays . asList ( gs ) ) ;
  }
  System . out . println ( ans ) ;
  return g ;
}
