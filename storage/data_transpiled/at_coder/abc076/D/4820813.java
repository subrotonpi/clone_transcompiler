public static void N ( Scanner input ) {
  int [ ] T = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] V = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] maxv = new int [ T . length ] ;
  for ( int i = 0 ;
  i < T . length ;
  i ++ ) {
    maxv [ i ] = 0 ;
  }
  for ( int t = T . length ;
  t < V . length ;
  t ++ ) {
    maxv [ T . length - 1 ] = Math . min ( maxv [ T . length - 1 ] , V [ t ] ) ;
    for ( int j = 0 ;
    j < t * 2 ;
    j ++ ) {
      maxv [ t ] = V [ j ] ;
    }
  }
  maxv [ T . length - 1 ] = 0 ;
  for ( int i = 0 ;
  i < maxv . length - 1 ;
  i ++ ) {
    maxv [ T . length - 1 ] = Math . min ( maxv [ T . length - 1 ] , maxv [ T . length ] + 0.5 ) ;
  }
  for ( int i = 0 ;
  i < maxv . length - 1 ;
  i ++ ) {
    maxv [ i ] = Math . min ( maxv [ i ] + maxv [ i + 1 ] , maxv [ i ] ) * 0.5 / 2 ;
  }
  System . out . println ( ans ) ;
}
