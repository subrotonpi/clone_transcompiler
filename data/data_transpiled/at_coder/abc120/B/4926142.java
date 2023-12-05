public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = Math . min ( a , b ) + 1 ;
  i > 0 ;
  i -- ) {
    if ( a % i == 0 && b % i == 0 ) {
      k -- ;
    }
    if ( k == 0 ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return k ;
}
