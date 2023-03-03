static final double floor ( double a ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    ans += b * a ;
  }
  System . out . println ( Math . floor ( ans * 1.05 ) ) ;
}
