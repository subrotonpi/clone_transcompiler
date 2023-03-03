public static String index ( @ NonNull String s , int idx ) {
  return s . substring ( idx - 1 ) ;
  if ( getClass ( ) . equals ( String . class ) ) {
    s = input . nextLine ( ) ;
    idx = Integer . parseInt ( input . nextLine ( ) ) ;
    String ans = index ( s , idx ) ;
    System . out . println ( ans ) ;
  }
  return s ;
}
