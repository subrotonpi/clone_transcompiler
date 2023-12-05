public static void a ( int a , int b , int k , int l ) {
  int m = Integer . parseInt ( input ( ) ) ;
  int res = b * m ;
  k -= l * m ;
  res += Math . min ( a * k , b ) ;
  System . out . println ( res ) ;
}
