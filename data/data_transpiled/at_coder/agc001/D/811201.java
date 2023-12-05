public static int S = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = new LinkedList < > ( ) ;
  List < Integer > O = new ArrayList < > ( ) ;
  List < Integer > E = new ArrayList < > ( ) ;
  for ( int a = 0 ;
  a < A . size ( ) ;
  a ++ ) {
    O . add ( A . get ( a ) ) ;
  }
  E . add ( A . get ( a ) ) ;
  if ( O . size ( ) > 2 ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    A = O . subList ( 0 , Math . min ( O . size ( ) , 1 ) ) . addAll ( E ) . addAll ( O ) . subList ( 1 , O . size ( ) ) ;
    int [ ] B = A . toArray ( ) + ( N == 1 ? new int [ 0 ] : new int [ N ] ) ;
    B [ 0 ] -- ;
    B [ B . length - 1 ] ++ ;
    if ( B [ 0 ] == 0 ) B = B . clone ( ) ;
    System . out . println ( ( int ) A . size ( ) ) ;
    System . out . println ( ( int ) B . size ( ) ) ;
  }
  return S ;
}
