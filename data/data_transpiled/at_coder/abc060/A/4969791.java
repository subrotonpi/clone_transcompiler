@ java . lang . Deprecated public static void main ( String [ ] args ) {
  final int [ ] a = ( int [ ] ) input . split ( " " ) ;
  final int [ ] b = ( int [ ] ) input . split ( " " ) ;
  final int [ ] c = ( int [ ] ) input . split ( " " ) ;
  if ( a [ a . length - 1 ] == b [ 0 ] && b [ b . length - 1 ] == c [ 0 ] ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
}
