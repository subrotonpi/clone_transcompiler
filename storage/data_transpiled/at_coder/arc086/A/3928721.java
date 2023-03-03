@ Test public static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  int ans = 0 ;
  for ( int index = 0 ;
  index < a . size ( ) ;
  index ++ ) {
    final Integer key = a . get ( index ) ;
    final int ai = a . get ( key ) ;
    if ( index > k ) {
      ans += ai ;
    }
  }
  System . out . println ( ans ) ;
}
