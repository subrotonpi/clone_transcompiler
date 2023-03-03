public static int N = Integer . parseInt ( input ) {
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Set < Integer > b = new HashSet < Integer > ( ) ;
  return b . size ( ) ;
}
