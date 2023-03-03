public static void print ( int n ) {
  n = input ( ) ;
  ten = n / 10 ;
  one = n % 10 ;
  System . out . println ( min ( ( ten + 1 ) * 100 , ten * 100 + one * 15 ) ) ;
}
