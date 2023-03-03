@ VisibleForTesting static void input ( LocalDateTime date ) {
  date = input . nextGaussian ( ) ;
  LocalDateTime newDate = LocalDateTime . parse ( date , DateTimeFormatter . ISO_LOCAL_DATE ) ;
  if ( newDate . isAfter ( date ) ) {
    System . out . println ( "Heisei" ) ;
  }
  else {
    System . out . println ( "TBD" ) ;
  }
}
