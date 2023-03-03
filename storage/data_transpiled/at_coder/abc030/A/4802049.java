public static void print ( int ia , int ib , int ic , int id ) {
  int i = Integer . parseInt ( input ( ) ) ;
  if ( ib / ia == id / ic ) {
    System . out . println ( "DRAW" ) ;
  }
  else {
    System . out . println ( ib / ia > id / ic ? "TAKAHASHI" : "AOKI" ) ;
  }
}
