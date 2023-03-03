public static String xa , double ya , double xb , double yb , double T , double V ) {
  double R = T * V ;
  int n = Integer . parseInt ( input ( ) ) ;
  String ans = "NO" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    double x = Integer . parseInt ( input ( ) ) ;
    double y = Integer . parseInt ( input ( ) ) ;
    if ( ( ( x - xa ) * x + ( y - ya ) * y ) * 0.5 + ( ( x - xb ) * x + ( y - yb ) * y ) * 0.5 <= R ) {
      ans = "YES" ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
