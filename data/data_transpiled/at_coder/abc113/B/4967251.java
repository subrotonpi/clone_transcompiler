public static void input ( ) {
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  t = Integer . parseInt ( input . nextLine ( ) ) ;
  a = Integer . parseInt ( input . nextLine ( ) ) ;
  h = Integer . parseInt ( input . nextLine ( ) ) ;
  double nr = 10 * 10 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double tmp = t - h . get ( i ) * 0.006 ;
    tmp = Math . abs ( a - tmp ) ;
    if ( tmp < nr ) {
      nr = tmp ;
      ans = i ;
    }
  }
  System . out . println ( ans + 1 ) ;
}
