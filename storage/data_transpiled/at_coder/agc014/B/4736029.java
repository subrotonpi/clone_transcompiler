public static String N ( ) {
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < Integer > e = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int ta = Integer . parseInt ( input . nextLine ( ) ) ;
    final int tb = Integer . parseInt ( input . nextLine ( ) ) ;
    e . add ( ta ) ;
  }
  final Collection < Integer > c = new ArrayList < > ( ) ;
  c . addAll ( e ) ;
  String ans = "YES" ;
  for ( int i : c ) {
    if ( c . size ( ) % 2 != 0 ) {
      ans = "NO" ;
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
