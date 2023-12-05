public static int N = Integer . parseInt ( input ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  final Map < Integer , Integer > a = new LinkedHashMap < Integer , Integer > ( A ) ;
  int ans = 0 ;
  for ( Map . Entry < Integer , Integer > i : a . entrySet ( ) ) {
    if ( ( i . getKey ( ) != i . getValue ( ) ) ) {
      ans += ( i . getValue ( ) < i . getKey ( ) ) ? i . getValue ( ) : ( i . getValue ( ) - i . getKey ( ) ) ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
