public static String print ( String n , int a , int b ) {
  int num = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( num == 0 ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( num <= a ? "Ant" : "Bug" ) ;
  }
  return num ;
}
