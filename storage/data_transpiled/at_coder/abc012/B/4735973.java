static final long millisecondFromSeconds ( ) {
  int sec = Integer . parseInt ( input . nextLine ( ) ) ;
  Calendar cal = Calendar . getInstance ( ) ;
  cal . setTimeInMillis ( sec ) ;
  if ( cal . getTimeInMillis ( ) < 10 ) {
    System . out . print ( "0" + cal . getTimeInMillis ( ) + " " ) ;
  }
  else {
    System . out . println ( cal . getTimeInMillis ( ) ) ;
  }
  return cal . getTimeInMillis ( ) ;
}
