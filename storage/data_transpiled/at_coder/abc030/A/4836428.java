public static int a = Integer . parseInt ( input ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int l1 = b / a ;
  int l2 = d / c ;
  if ( ( l1 > l2 ) && ( l2 > l1 ) ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( ( l2 > l1 ) && ( l2 > l1 ) ) {
    System . out . println ( "AOKI" ) ;
  }
  else {
    System . out . println ( "DRAW" ) ;
  }
  return l1 ;
}
