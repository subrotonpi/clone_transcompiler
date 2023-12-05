public static void print ( int a , int b , int k , int l ) {
  int m = Integer . parseInt ( input ( ) ) ;
  m = k / l ;
  System . out . println ( b * m + Math . min ( b , a * ( k - l * m ) ) ) ;
}
