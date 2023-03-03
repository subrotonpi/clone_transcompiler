public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  Set < Integer > a2 = new HashSet < Integer > ( a . length ) ;
  a . sort ( ) ;
  Set < Integer > a3 = new HashSet < Integer > ( a . length ) ;
  System . out . println ( a2 . size ( ) ^ a3 . size ( ) / 2 ) ;
}
