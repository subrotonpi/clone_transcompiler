static final Map < Integer , Map < Integer , Integer >> constructGraph ( int [ ] A , int [ ] B , int [ ] C ) {
  int M = A . length ;
  Map < Integer , Map < Integer , Integer >> graph = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int a = A [ i ] ;
    int b = B [ i ] ;
    int c = C [ i ] ;
    if ( a < 0 || b > A [ i ] ) graph . put ( a , new HashMap < > ( ) ) ;
    if ( b < 0 || b > A [ i ] ) graph . put ( b , new HashMap < > ( ) ) ;
    graph . get ( a ) . put ( b , c ) ;
    System . out . println ( solve ( r , A , B ) ) ;
  }
  if ( __name__ . equals ( "__main__" ) ) {
    main ( ) ;
  }
  return graph ;
}
