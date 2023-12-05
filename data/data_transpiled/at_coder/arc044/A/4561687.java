public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  if ( n != 1 && ( n == 2 || n == 3 || n == 5 || ( n % 2 != 0 && n % 3 != 0 && n % 5 != 0 ) ) ) System . out . println ( "Prime" ) ;
  else System . out . println ( "Not Prime" ) ;
}
