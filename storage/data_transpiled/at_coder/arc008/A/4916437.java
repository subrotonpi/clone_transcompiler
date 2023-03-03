public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  System . out . println ( Math . min ( ( n / 10 ) * 100 + ( n % 10 ) * 15 , ( ( n - 1 ) / 10 + 1 ) * 100 ) ) ;
}
