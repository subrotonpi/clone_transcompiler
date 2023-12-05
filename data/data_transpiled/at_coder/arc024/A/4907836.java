@ VisibleForTesting static void main ( String [ ] args ) {
  final int size = Integer . parseInt ( input . nextLine ( ) ) ;
  final Map < String , Integer > ll = new HashMap < > ( size ) ;
  final Map < String , Integer > rr = new HashMap < > ( size ) ;
  for ( int i = 0 ;
  i < size ;
  i ++ ) {
    ll . put ( i , i ) ;
  }
  int res = 0 ;
  for ( String l : ll . keySet ( ) ) {
    if ( rr . containsKey ( l ) ) {
      res += Math . min ( ll . get ( l ) , rr . get ( l ) ) ;
    }
  }
  System . out . println ( res ) ;
}
