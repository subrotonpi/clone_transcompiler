public static void print ( int a , int b , int k , int l ) {
  int n = k / l ;
  int m = k - n * l ;
  System . out . println ( min ( b * ( n + 1 ) , a * m + b * n ) ) ;
}
