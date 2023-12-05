public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) , k = Integer . parseInt ( input . readLine ( ) ) ;
  int m = 10 * 9 + 7 ;
  int c = 1 ;
  int s , r ;
  if ( n > k ) s = n + k - 1 ;
  else s = n ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) c *= ( s - i ) * pow ( i + 1 , m - 2 , m ) % m ;
  System . out . println ( c % m ) ;
}
