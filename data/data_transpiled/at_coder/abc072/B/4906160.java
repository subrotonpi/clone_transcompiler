public static String moziretu ( ) {
  String s = input . nextLine ( ) ;
  StringBuilder a = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( ( ( i + 1 ) % 2 ) != 0 ) {
      a . append ( s . charAt ( i ) ) ;
    }
  }
  String moziretu = a . toString ( ) ;
  return moziretu ;
}
