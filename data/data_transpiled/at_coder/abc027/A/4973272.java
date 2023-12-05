public static int l1 ( int l1 , int l2 , int l3 ) {
  int i = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( l1 == l2 ) {
    System . out . println ( l3 ) ;
  }
  else if ( l1 == l3 ) {
    System . out . println ( l2 ) ;
  }
  else if ( l2 == l3 ) {
    System . out . println ( l1 ) ;
  }
  return i ;
}
