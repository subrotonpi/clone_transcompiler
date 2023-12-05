public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  double ans = Math . pow ( 10 , 15 ) ;
  for ( int a = 1 ;
  a < n ;
  a ++ ) {
    int b = n - a ;
    double adg = 0 , bdg = 0 ;
    while ( a != 0 ) {
      adg += a % 10 ;
      a /= 10 ;
    }
    while ( b != 0 ) {
      bdg += b % 10 ;
      b /= 10 ;
    }
    if ( ans > adg + bdg ) {
      ans = adg + bdg ;
    }
  }
  System . out . println ( ans ) ;
}
