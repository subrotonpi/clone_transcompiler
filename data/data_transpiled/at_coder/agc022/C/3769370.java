public static int N = Integer . parseInt ( input ) {
  List < Integer > A = Lists . newArrayList ( ) ;
  List < Integer > B = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
    B . add ( Integer . parseInt ( input . readLine ( ) ) ) ;
  }
  if ( CollectionUtils . isEmpty ( A ) ) {
    System . out . println ( - 1 ) ;
    exit ( ) ;
  }
  if ( A . equals ( B ) ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  return A . size ( ) == B . size ( ) ? 1 : 0 ;
}
