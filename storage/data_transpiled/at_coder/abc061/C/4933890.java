public static int N = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , Integer > dict = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( ( a >= b ) && ( b >= b ) ) dict . put ( a , b ) ;
  }
  int count = 0 ;
  int ans = 0 ;
  for ( Map . Entry e : dict . entrySet ( ) ) {
    count += e . getValue ( ) ;
    if ( ( count >= K ) && ( count < N ) ) {
      ans = e . getKey ( ) ;
      break ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
