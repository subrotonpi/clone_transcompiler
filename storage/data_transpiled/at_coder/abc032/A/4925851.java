public static void print ( int a ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  while ( n % a > 0 || n % b > 0 ) {
    n ++ ;
  }
  System . out . println ( n ) ;
}
