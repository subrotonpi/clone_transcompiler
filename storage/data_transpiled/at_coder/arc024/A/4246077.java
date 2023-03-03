@ VisibleForTesting static LinkedHashMap < String , Integer > map ( String input ) {
  int L , R = Integer . parseInt ( input ) ;
  return inputL . entrySet ( ) . stream ( ) . map ( entry -> Math . min ( inputR , entry . getValue ( ) ) ) ;
}
