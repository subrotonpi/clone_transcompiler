public static int N = Integer . parseInt ( input ) {
  int * A , * B , mid ;
  int * A = Integer . parseInt ( input . nextLine ( ) ) ;
  int * B = Integer . parseInt ( input . nextLine ( ) ) ;
  Arrays . sort ( A , Integer . reverseOrder ( ) ) ;
  Arrays . sort ( B , Integer . reverseOrder ( ) ) ;
  /* Check mid */
  int j = 0 ;
  int res = 0 ;
  for ( int a : A ) {
    while ( j < N && a * B [ j ] <= mid ) {
      j ++ ;
    }
    res += j ;
  }
  return K <= res ;
}
