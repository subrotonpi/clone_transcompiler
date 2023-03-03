public static void ans ( ) {
  List < Integer > D = Lists . newArrayList ( ) ;
  List < Integer > J = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 7 ;
  i ++ ) {
    cnt += Math . max ( D . get ( i ) , J . get ( i ) ) ;
  }
  System . out . println ( cnt ) ;
}
