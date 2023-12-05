public static void print ( int n ) {
  int [ ] arr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Set < Integer > set = new HashSet < Integer > ( ) ;
  set . addAll ( arr ) ;
  System . out . println ( set . get ( arr . size ( ) - 2 ) ) ;
}
