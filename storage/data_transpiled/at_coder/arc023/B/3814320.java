private static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int D = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    A . add ( Collections . singletonList ( i ) ) ;
  }
  int maxNum = 0 ;
  for ( int y = 0 ;
  y < Math . min ( R , D + 1 ) ;
  y ++ ) {
    List < Integer > l = A . get ( y ) . subList ( D , Math . min ( C , D - y + 1 ) ) ;
    if ( l != null ) maxNum = Math . max ( maxNum , Math . max ( l ) ) ;
  }
  return maxNum ;
}
