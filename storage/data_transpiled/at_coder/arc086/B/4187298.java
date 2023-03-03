public static int [ ] [ ] solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > A = Arrays . asList ( input . nextLine ( ) . split ( " " ) ) ;
  int maxI = A . indexOf ( max ( A ) ) ;
  int minI = A . indexOf ( min ( A ) ) ;
  int absMaxI = Collections . max ( maxI , minI , Comparator . comparing ( Integer :: compareTo ) ) ;
  System . out . println ( 2 * N - 2 ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) Arrays . stream ( A ) . sorted ( ( absMaxI + 1 ) ? A [ i ] : null ) . limit ( absMaxI + 1 ) . forEach ( System . out :: println ) ;
  if ( A . get ( absMaxI ) > 0 ) {
    for ( int i = 0 ;
    i < N - 1 ;
    i ++ ) System . out . println ( i + 1 + 2 ) ;
  }
  else {
    for ( int i = N - 1 ;
    i > 0 ;
    i -- ) System . out . println ( i + 1 ) ;
  }
  return A . toArray ( ) ;
}
