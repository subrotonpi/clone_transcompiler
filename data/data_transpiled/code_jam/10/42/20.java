static final String getSolution ( ) throws IOException {
  final String line = "" ;
  final String solution = line . substring ( 0 , line . length ( ) - 1 ) ;
  final Map < String , String > map = map . get ( line ) ;
  if ( className . equals ( "org.glpsol.util.Solution" ) ) {
    final int numberOfCases = Integer . parseInt ( line ) ;
    for ( int caseNumber = 0 ;
    caseNumber < numberOfCases ;
    caseNumber ++ ) {
      final int P = Integer . parseInt ( line ) ;
      final Map < String , Integer > prices = new HashMap < > ( ) ;
      final List < String > constraints = readList ( ) ;
      final StringBuilder objective = new StringBuilder ( ) ;
      for ( int r = 0 ;
      r < P ;
      r ++ ) {
        final String [ ] thisRound = System . lineSeparator ( ) . split ( line ) ;
        objective . append ( thisRound [ match ] ) . append ( " x_" ) . append ( r ) . append ( "_" ) . append ( match ) ;
      }
      objective . append ( " minimize " ) . append ( '+' ) ');objective.append(' + ').append(' ▁ ').append(' ▁ ').append("x_").append(r).append("_").append(team/2*(r+1)).append(" >= ").append(P-constraints.get(team)).append(' ▁ ').append(' ▁ ' ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " ▁ " ) . append ( " \n " ) ;