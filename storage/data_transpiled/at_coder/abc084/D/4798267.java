public static int Q = Integer . parseInt ( input ) {
  List < List < Integer >> Qs = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) Qs . add ( Collections . singletonList ( Integer . parseInt ( input . nextLine ( ) ) ) ) ;
  int [ ] Prime = new int [ 100001 ] ;
  int count = 0 ;
  {
    for ( int j = 2 ;
    j <= ( int ) ( i * ( 0.5 ) ) ;
    j ++ ) {
      if ( i % j == 0 ) {
        return false ;
      }
    }
    return true ;
  }
  for ( int i = 3 ;
  i <= 100001 ;
  i += 2 ) {
    if ( i > 0 && i < ( ( i + 1 ) / 2 ) ) {
      Prime [ i ] = 1 ;
      count ++ ;
    }
  }
  for ( int i = 1 ;
  i <= 100001 ;
  i ++ ) Prime [ i ] = Prime [ i ] + Prime [ i - 1 ] ;
  for ( List < Integer > q : Qs ) System . out . println ( Prime [ q . get ( 1 ) ] - Prime [ q . get ( 0 ) - 1 ] ) ;
  return count ;
}
