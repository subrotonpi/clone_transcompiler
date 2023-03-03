public static void show ( int [ ] [ ] a ) {
  for ( int i = 0 ;
  i < a . length ;
  i ++ ) {
    System . out . println ( a [ i ] ) ;
  }
  System . out . println ( ) ;
  {
    int [ ] table = new int [ n + 2 ] ;
    for ( int i = 0 ;
    i < m ;
    i ++ ) {
      table [ a [ i ] [ 0 ] ] ++ ;
      table [ a [ i ] [ 1 ] + 1 ] -- ;
    }
    for ( int i = 1 ;
    i < table . length ;
    i ++ ) {
      table [ i ] += table [ i - 1 ] ;
    }
    for ( int i = 1 ;
    i < table . length ;
    i ++ ) {
    }
  }
}
