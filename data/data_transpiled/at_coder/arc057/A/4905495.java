public static int A , int K = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( K == 0 ) {
    System . out . println ( X - A ) ;
    exit ( ) ;
  }
  int day = 0 ;
  while ( A < X ) {
    A = 1 + ( K + 1 ) * A ;
    day ++ ;
  }
  return day ;
}
