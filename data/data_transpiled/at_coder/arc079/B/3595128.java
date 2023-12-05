public static int [ ] getN ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = 50 ;
  if ( K <= N ) {
    ans = new int [ K ] ;
    ans [ 0 ] = N ;
    System . out . println ( N ) ;
    System . arraycopy ( ans , 0 , ans , 1 , N ) ;
    exit ( ) ;
  }
  return ans ;
}
