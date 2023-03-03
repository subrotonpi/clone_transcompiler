static final Supplier < Integer > getNr ( ) {
  final Supplier < String > ns = ( ) -> System . in . nextLine ( ) . replaceAll ( "\\s+" , "" ) ;
  final Supplier < Integer > ni = ( ) -> Integer . parseInt ( ns . get ( ) ) ;
  final Supplier < List < Integer >> nm = ( ) -> Integer . parseInt ( ni . get ( ) ) ;
  final Supplier < List < Integer >> nl = ( ) -> Collections . singletonList ( n ) ;
  final int n = nm . get ( ) ;
  final int k = n ;
  final List < Integer > l = nl . get ( ) ;
  Collections . sort ( l , Collections . reverseOrder ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    ans += l . get ( i ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
