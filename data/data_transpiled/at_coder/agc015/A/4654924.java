public static int N ( int N , int A , int B ) {
  int ans ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  A = Integer . parseInt ( input . nextLine ( ) ) ;
  B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( N == 1 && A != B ) || A > B ) {
    System . out . println ( 0 ) ;
  }
  else {
    ans = 1 + Math . max ( 0 , ( N - 2 ) ) * ( B - A ) ;
    System . out . println ( ans ) ;
  }
  return ans ;
}
