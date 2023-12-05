public static void a ( int a , int b , int c , int d ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  int sum = a * n + b * m ;
  if ( ( n + m ) >= d ) {
    sum -= ( n + m ) * c ;
  }
  System . out . println ( sum ) ;
}
