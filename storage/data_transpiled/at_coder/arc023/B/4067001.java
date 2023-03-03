public static int inpl ( ) {
  return Lists . newArrayList ( Integer . parseInt ( input ( ) ) ) ;
  int ans = 0 ;
  int R = inpl ( ) ;
  int C = inpl ( ) ;
  int D = inpl ( ) ;
  for ( int i = 0 ;
  i < Math . min ( R , D + 1 ) ;
  i ++ ) {
    int [ ] I = inpl ( ) . subList ( ( D + i ) % 2 , D - i + 1 , 2 ) ;
    ans = Math . max ( ans , Math . max ( I . length , 0 ) ) ;
  }
  System . out . println ( ans ) ;
}
