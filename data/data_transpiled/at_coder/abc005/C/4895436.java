public static int T = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ M ] ;
  for ( int i = 0 ;
  i < B . length ;
  i ++ ) B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < A . length ;
  i ++ ) {
    if ( B [ i ] > 0 ) {
      if ( 0 <= B [ i ] - A [ i ] <= T ) B [ i ] -- ;
    }
    else {
      System . out . println ( "yes" ) ;
      exit ( ) ;
    }
  }
  if ( B [ 0 ] > 0 ) System . out . println ( "no" ) ;
  else System . out . println ( "yes" ) ;
  return N ;
}
