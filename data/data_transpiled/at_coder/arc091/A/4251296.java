public static int getSumOfDigits ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == 1 && m == 1 ) {
    System . out . println ( 1 ) ;
  }
  else if ( n == 1 || m == 1 ) {
    System . out . println ( Math . max ( Math . max ( n , m ) - 2 , 0 ) ) ;
  }
  else {
    System . out . println ( ( n - 2 ) * ( m - 2 ) ) ;
  }
  return n ;
}
