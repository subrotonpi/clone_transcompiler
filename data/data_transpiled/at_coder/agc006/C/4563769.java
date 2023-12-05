@ SafeVarargs public static void from ( String ... args ) {
  int n = Integer . parseInt ( args [ 0 ] ) ;
  int ... a = args . length ;
  int s = 0 , t = arange ( n - 1 ) ;
  for ( int i = a . length - a [ n ] ;
  i > 0 ;
  i -- ) t [ [ i - 2 ] ] = t [ i - 1 ] ;
  int k = a [ n + 1 ] ;
  while ( k > 0 ) s -- ;
}
