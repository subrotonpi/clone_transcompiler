public static int S = Integer . parseInt ( input ) {
  int [ ] A = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > O = Arrays . asList ( A ) ;
  List < Integer > E = Arrays . asList ( A ) ;
  if ( O . size ( ) > 2 ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    A = O . subList ( 0 , Math . min ( O . size ( ) , 1 ) ) . stream ( ) . map ( E :: get ) . collect ( Collectors . toList ( ) ) ;
    int [ ] B = A . toArray ( ) ;
    B [ 0 ] = ( A . length == 1 ? 0 : 1 ) ;
    B [ B . length - 1 ] ++ ;
    if ( B [ 0 ] == 0 ) B = B . length - 1 ;
    System . out . println ( Arrays . toString ( A ) ) ;
    System . out . println ( B . length ) ;
    System . out . println ( Arrays . toString ( B ) ) ;
  }
  return A . length ;
}
