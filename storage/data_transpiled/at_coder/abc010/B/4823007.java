public static void n ( ) {
  int n = Integer . parseInt ( input ( ) ) ;
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int a : A ) {
    if ( a % 2 == 0 ) {
      ans ++ ;
      a -- ;
    }
    if ( a % 3 == 2 ) {
      ans += 2 ;
    }
  }
  System . out . println ( ans ) ;
}
