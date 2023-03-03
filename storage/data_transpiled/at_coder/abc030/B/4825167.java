public static void print ( int n , int m ) {
  double n2 = ( n % 12 ) * 5 + m * 5 / 60.0 ;
  double d = Math . abs ( n2 * 6 - m * 6 ) ;
  System . out . println ( Math . min ( d , 360 - d ) ) ;
}
