@ BUTTONS "ABXY" ) public static void main ( String [ ] args ) {
  final int length = Integer . parseInt ( input ( ) ) ;
  final char [ ] c = input . toCharArray ( ) ;
  System . out . println ( solve ( c ) ) ;
  /* solve */
  double m = Double . MAX_VALUE ;
  for ( char a : shortcuts ( ) ) {
    for ( char b : shortcuts ( ) ) {
      if ( b <= a ) continue ;
      m = Math . min ( m , minStep ( c , a , b ) ) ;
    }
  }
  /* min step */
}
