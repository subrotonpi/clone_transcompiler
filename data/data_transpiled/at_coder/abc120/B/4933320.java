public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int counter = 0 ;
  for ( int i = 0 ;
  i <= Math . min ( A , B ) ;
  i ++ ) {
    if ( A % i == 0 && B % i == 0 ) counter ++ ;
    if ( counter == K ) {
      System . out . println ( i ) ;
      break ;
    }
  }
  return counter ;
}
