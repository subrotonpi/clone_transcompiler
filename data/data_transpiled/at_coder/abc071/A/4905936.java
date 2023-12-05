public static int x ( int a , int b ) {
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . abs ( a - x ) > Math . abs ( b - x ) ) {
    System . out . println ( "B" ) ;
  }
  else {
    System . out . println ( "A" ) ;
  }
  return a ;
}
