@ VisibleForTesting static int from ( int q ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    b = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( Math . min ( b - a , Math . max ( ( ( a * b ) * * 0.5 - a ) - 1 ) * 2 , ( ( ( - ( 2 * a - 1 ) + ( 1 + 4 * a * b ) * * 0.5 ) / 2 ) - 1 ) * 2 - 1 , 0 ) + 2 * ( a - 1 ) ) ;
  }
  return a ;
}
