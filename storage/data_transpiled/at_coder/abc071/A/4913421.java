public static int x ( int a , int b ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( Math . abs ( x - a ) > Math . abs ( x - b ) ) ) {
    System . out . println ( "B" ) ;
  }
  else {
    System . out . println ( "A" ) ;
  }
  return a ;
}
