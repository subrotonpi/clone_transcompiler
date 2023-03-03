public static int N = Integer . parseInt ( input ) {
  int [ ] A = list ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int [ ] count = new int [ 10 * 5 + 1 ] ;
  for ( int a : A ) count [ a ] ++ ;
  int ret = 0 ;
  for ( int i = 1 ;
  i < 10 * 5 ;
  i ++ ) ret = Math . max ( ret , count [ i - 1 ] + count [ i ] + count [ i + 1 ] ) ;
  System . out . println ( ret ) ;
  return ret ;
}
