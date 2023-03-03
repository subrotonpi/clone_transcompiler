public static String [ ] [ ] getStrings ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] [ ] c = new String [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] = new String [ ] {
      input . nextLine ( ) }
      ;
    }
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      System . out . println ( Arrays . toString ( Lists . reverse ( Arrays . asList ( c ) ) ) ) ;
    }
    return c ;
  }
  