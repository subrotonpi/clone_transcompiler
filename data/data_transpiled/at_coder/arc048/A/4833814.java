public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a * b < 0 ) {
    System . out . println ( Math . abs ( a - b ) - 1 ) ;
  }
  else {
    System . out . println ( Math . abs ( a - b ) ) ;
  }
  return a ;
}
