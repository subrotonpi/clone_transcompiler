public static boolean isSafe ( String string , int n , int k ) {
  String n = Integer . parseInt ( input . nextLine ( ) ) ;
  int len = s . length ( ) ;
  ArrayList < Integer > s_list = new ArrayList < Integer > ( Arrays . asList ( s . split ( " " ) ) ) ;
  Collections . sort ( s_list ) ;
  /* Check if the string is safe */
  {
    int [ ] c = new int [ len ] ;
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      char ch = s . charAt ( i ) ;
      if ( c [ ch ] >= 0 ) {
        c [ ch ] ++ ;
      }
      else {
        c [ ch ] = 1 ;
      }
    }
    for ( int i = 0 ;
    i < len ;
    i ++ ) {
      char ch = s . charAt ( i ) ;
      if ( c [ ch ] >= 0 && c [ ch ] > 0 ) {
        c [ ch ] -- ;
      }
      else {
        return false ;
      }
    }
  }
  /* Return true if the string is safe */
  return true ;
}
