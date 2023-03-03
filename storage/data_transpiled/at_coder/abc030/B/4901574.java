public static void print ( int n , int m ) {
  int b = m * 6 ;
  int a = n % 12 * 30 ;
  a += m / 2 ;
  System . out . println ( Math . min ( Math . abs ( a - b ) , 360 - Math . abs ( a - b ) ) ) ;
}
