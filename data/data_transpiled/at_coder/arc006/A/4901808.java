public static List < Integer > convert ( String input ) {
  int E = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  List < Integer > L = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < input . length ( ) ;
  i ++ ) {
    L . add ( Integer . parseInt ( input ) ) ;
  }
  Set < Integer > e = Sets . newHashSet ( E ) ;
  Set < Integer > l = Sets . newHashSet ( L ) ;
  int res = e . stream ( ) . filter ( l :: contains ) . count ( ) ;
  if ( res == 6 ) {
    System . out . println ( 1 ) ;
  }
  else if ( res == 5 && L . contains ( B ) ) {
    System . out . println ( 2 ) ;
  }
  else if ( 6 > res >= 3 ) {
    System . out . println ( 8 - res ) ;
  }
  else {
    System . out . println ( 0 ) ;
  }
  return L ;
}
