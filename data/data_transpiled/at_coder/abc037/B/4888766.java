static int n = Integer . parseInt ( input ) {
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = Integer . parseInt ( input . nextLine ( ) ) ;
    int r = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    for ( int j = l - 1 ;
    j < r ;
    j ++ ) {
      a [ j ] = t ;
    }
  }
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
  return a . length ;
}
