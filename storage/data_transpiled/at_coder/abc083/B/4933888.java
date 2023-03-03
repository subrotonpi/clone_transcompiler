public static void input ( String N , String A , String B ) {
  int Sum2 = 0 ;
  for ( int i = 1 ;
  i <= Integer . parseInt ( N ) ;
  i ++ ) {
    List < Integer > Nnum = Lists . newArrayList ( Integer . parseInt ( String . valueOf ( i ) ) ) ;
    int Sum1 = 0 ;
    for ( int j = 0 ;
    Nnum . size ( ) > 0 ;
    j ++ ) {
      Sum1 += Nnum . get ( j ) ;
    }
    if ( Integer . parseInt ( A ) <= Sum1 && Sum1 <= Integer . parseInt ( B ) ) {
      Sum2 += i ;
    }
  }
  System . out . println ( Sum2 ) ;
}
