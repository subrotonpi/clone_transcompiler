public static void ruiseki ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int q = Integer . parseInt ( input ) ;
  int [ ] l = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int [ ] a = new int [ n ] ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      a [ j ] = Integer . parseInt ( input ) ;
    }
    l [ a [ 0 ] - 1 ] ++ ;
    l [ a [ 1 ] ] -- ;
  }
  int [ ] li = new int [ n ] ;
  {
    li [ 0 ] = 0 ;
  }
  {
    for ( int i = 0 ;
    i < li . length ;
    i ++ ) {
      li [ i ] = li [ i ] + a [ i ] ;
    }
  }
}
