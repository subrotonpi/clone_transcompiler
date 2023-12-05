public static void print ( String a , String b ) {
  int num = Integer . parseInt ( input . nextLine ( ) ) ;
  boolean flag = false ;
  for ( int i = 0 ;
  i < 350 ;
  i ++ ) {
    if ( i * i == num ) {
      flag = true ;
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
