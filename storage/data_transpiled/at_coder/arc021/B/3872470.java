public static LinkedList < Integer > inpl ( ) {
  return LinkedList . LinkedList . of ( Integer . parseInt ( input . readLine ( ) ) ) ;
  int L = Integer . parseInt ( input . readLine ( ) ) ;
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) {
    B [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int [ ] A = new int [ L ] ;
  A [ 0 ] = 0 ;
  for ( int i = 1 ;
  i < L ;
  i ++ ) {
    A [ i ] = A [ i - 1 ] ^ B [ i - 1 ] ;
  }
  if ( A [ A . length - 1 ] ^ B [ B . length - 1 ] == A [ 0 ] ) {
    System . out . println ( ( int ) A [ 0 ] ) ;
  }
  else {
    System . out . println ( - 1 ) ;
  }
  return new LinkedList < Integer > ( ) ;
}
