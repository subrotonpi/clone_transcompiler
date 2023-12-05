public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] n = new int [ a ] ;
  int [ ] r = new int [ a ] ;
  r [ 0 ] = 1 ;
  for ( int i = 0 ;
  i < b ;
  i ++ ) {
    int ta = Integer . parseInt ( input . nextLine ( ) ) ;
    int tb = Integer . parseInt ( input . nextLine ( ) ) ;
    ta -- ;
    tb -- ;
    if ( r [ ta ] == 1 ) {
      n [ ta ] = 1 ;
    }
  }
  return n [ a ] ;
}
