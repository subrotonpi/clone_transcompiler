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
    final int key = a . get ( index ) ;
    if ( key > k ) {
      ans += a . get ( key ) ;
    }
  }
  System . out . println ( ans ) ;
}
