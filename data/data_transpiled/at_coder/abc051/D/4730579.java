@ VisibleForTesting static void dijkstra ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] edges = new int [ n ] [ n ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    edges [ a - 1 ] [ b - 1 ] = c ;
    edges [ b - 1 ] [ a - 1 ] = c ;
    query [ i ] = a - 1 ;
    edges [ b - 1 ] [ a ] = b ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    edges [ a ] [ b ] = c ;
    int dist_ = dijkstra ( edges , false , a ) [ b ] ;
    if ( dist_ < c ) {
      ans ++ ;
    }
    edges [ a ] [ b ] = c ;
    edges [ b ] [ a ] = c ;
  }
  System . out . println ( ans ) ;
}
