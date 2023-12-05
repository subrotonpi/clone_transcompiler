@ VisibleForTesting static List < Point > split4 ( Area area , List < Point > cranes ) {
  final int N = 100000 ;
  final List < Point > earns = new ArrayList < > ( ) ;
  final List < List < Point >> earns = new ArrayList < > ( ) ;
  final Set < String > names = new HashSet < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    names . add ( id ( i ) ) ;
    earns . add ( Arrays . asList ( currentFrame ( ) . getFrames ( ) ) . stream ( ) . map ( e -> e . name ( ) ) . collect ( Collectors . toList ( ) ) ) ;
    earns . add ( Arrays . stream ( e -> e . name ( ) . compareTo ( "???" ) + e . name ( ) ) . collect ( Collectors . toList ( ) ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
    earns . add ( Collections . max ( earns ) ) ;
  }
  return earns ;
}
