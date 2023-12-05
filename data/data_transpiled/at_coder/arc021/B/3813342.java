public static int [ ] getDigits ( ) {
  int L = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] B = new int [ L ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) B [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ L + 1 ] ;
  for ( int i = 0 ;
  i < L ;
  i ++ ) a [ i + 1 ] = a [ i ] ^ B [ i ] ;
  if ( a [ 0 ] == a [ a . length - 1 ] ) {
    for ( int a_i = a . length - 1 ;
    a_i >= 0 ;
    a_i -- ) System . out . println ( a_i ) ;
  }
  else System . out . println ( - 1 ) ;
  return a ;
}
