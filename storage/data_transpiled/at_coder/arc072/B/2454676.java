public static int X = Integer . parseInt ( input ) {
  int X = Integer . parseInt ( input . nextLine ( ) ) ;
  int Y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( Math . max ( X , Y ) - Math . min ( X , Y ) > 1 ) {
    System . out . println ( "Alice" ) ;
  }
  else {
    System . out . println ( "Brown" ) ;
  }
  return X ;
}
