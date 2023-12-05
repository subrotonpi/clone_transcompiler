public static void print ( int n ) {
  int [ ] a = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  a = new ArrayList ( new HashSet ( a ) ) ;
  a . sort ( ) ;
  System . out . println ( a [ 1 ] ) ;
}
