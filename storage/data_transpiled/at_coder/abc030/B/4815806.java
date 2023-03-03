private static void input ( ) {
  int n , m = Integer . parseInt ( input . nextLine ( ) ) ;
  n = n % 12 ;
  n = ( n * 5 ) + ( m / 60 ) * 5 ;
  int ans = Math . min ( Math . abs ( n - m ) , 60 - Math . abs ( n - m ) ) ;
  ans *= 6 ;
  System . out . println ( ans ) ;
}
