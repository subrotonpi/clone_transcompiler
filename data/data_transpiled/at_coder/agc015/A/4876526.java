public static int n ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  return Math . max ( ( ( n - 1 ) * b + a ) - ( ( n - 1 ) * a + b ) + 1 , 0 ) ;
}
