public static int N ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > l = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int m = Collections . max ( l ) ;
    ans += m ;
    l . set ( l . indexOf ( m ) ) ;
  }
  return ans ;
}
