@ VisibleForTesting static String readLine ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  String s = scanner . nextLine ( ) ;
  while ( s . equals ( "" ) ) {
    s = scanner . nextLine ( ) ;
  }
  return s ;
}
