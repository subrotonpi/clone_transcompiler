static final String getInput ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = input . nextInt ( ) ;
  final int D = input . nextInt ( ) ;
  final int [ ] E = new int [ N ] ;
  int [ ] tt = new int [ N ] ;
  int ct = 0 ;
  for ( final int t = 0 ;
  t < tt ;
  t ++ ) {
    tt [ t ] = input . nextInt ( ) ;
    tt [ t ] = input . nextInt ( ) ;
    tt [ t ] -= tt [ t ] ;
  }
  final String T = input . next ( ) ;
  System . out . println ( "Case #" + ( caseNr + 1 ) + ": " + T ) ;
  return T ;
}
