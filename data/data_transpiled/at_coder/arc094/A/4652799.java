public static int A = Integer . parseInt ( input ) {
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = C - B ;
  int y = C - A ;
  /* Calculate the sum of the two numbers */
  int sum = ( ( y - x ) / 2 + x ) ;
  if ( ( ( x - y ) % 2 ) == 1 ) {
    System . out . println ( 1 + sum + sum + 1 ) ;
  }
  else {
    System . out . println ( sum + sum ) ;
  }
  return sum ;
}
