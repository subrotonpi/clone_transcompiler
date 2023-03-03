public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  String S = new String ( input . nextLine ( ) ) ;
  boolean flag = true ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( i == A ) {
      if ( S . charAt ( i ) != '-' ) {
        flag = false ;
      }
    }
    else {
      if ( ! S . charAt ( i ) . equals ( '0123456789' ) ) {
        flag = false ;
      }
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
  return B ;
}
