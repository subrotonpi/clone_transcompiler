public static int [ ] [ ] [ ] tree ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] [ ] tree = new int [ n ] [ m ] [ n ] ;
  double [ ] [ ] kyori = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int tmp1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int tmp2 = Integer . parseInt ( input . nextLine ( ) ) ;
    tree [ tmp1 - 1 ] [ tmp2 - 1 ] = 1 ;
    tree [ tmp2 - 1 ] [ tmp1 - 1 ] = 1 ;
    kyori [ tmp1 - 1 ] [ tmp2 - 1 ] = 1 ;
    kyori [ tmp2 - 1 ] [ tmp1 - 1 ] = 1 ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    kyori [ i ] [ i ] = 0 ;
  }
  for ( int k = 0 ;
  k < n ;
  k ++ ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        kyori [ i ] [ j ] = Math . min ( kyori [ i ] [ j ] , kyori [ i ] [ k ] + kyori [ k ] [ j ] ) ;
      }
    }
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( kyori [ i ] [ j ] == 2 ) {
        ans = ans + 1 ;
      }
    }
  }
  System . out . println ( ans ) ;
  return tree ;
}
