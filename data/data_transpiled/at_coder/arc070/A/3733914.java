public static int N ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = 0 ;
  int i = 0 ;
  while ( a < N ) {
    i ++ ;
    a += i ;
  }
  System . out . println ( i ) ;
  return i ;
}
