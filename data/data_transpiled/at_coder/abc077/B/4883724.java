public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int i = 0 ;
  while ( i * i <= N ) {
    i ++ ;
  }
  System . out . println ( ( i - 1 ) * i ) ;
  return i ;
}
