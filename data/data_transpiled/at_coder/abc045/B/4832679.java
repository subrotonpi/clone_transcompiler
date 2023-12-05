static final String getStrings ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int INT = scanner . nextInt ( ) ;
  final int MAP = scanner . nextInt ( ) ;
  final int LIST = scanner . nextInt ( ) ;
  scanner . close ( ) ;
  INF = Double . MAX_VALUE ;
  MOD = 10 * 9 + 7 ;
  final String SA = scanner . next ( ) ;
  final String SB = scanner . next ( ) ;
  final String SC = scanner . next ( ) ;
  final HashMap < String , String > S = new HashMap < String , String > ( ) ;
  String turn = "a" ;
  while ( true ) {
    if ( S . get ( turn ) . size ( ) == 0 ) break ;
    turn = S . get ( turn ) . iterator ( ) . next ( ) ;
  }
}
