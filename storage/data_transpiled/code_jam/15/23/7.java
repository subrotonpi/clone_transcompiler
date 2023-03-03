@ VisibleForTesting static void fractions ( ) {
  final Scanner in = new Scanner ( new File ( "C-small-1-attempt0.in" ) ) ;
  final PrintWriter out = new PrintWriter ( new BufferedWriter ( new FileWriter ( "C.out" ) ) ) ;
  final int ncases = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= ncases ;
  testCase ++ ) {
    final int nlines = Integer . parseInt ( in . nextLine ( ) ) ;
    final List < Pair < Integer , Integer >> hikers = new ArrayList < > ( ) ;
    for ( int L = 0 ;
    L < nlines ;
    L ++ ) {
      final int D = Integer . parseInt ( in . nextLine ( ) ) ;
      final int H = Integer . parseInt ( in . nextLine ( ) ) ;
      final int M = Integer . parseInt ( in . nextLine ( ) ) ;
      for ( int i = 0 ;
      i < H ;
      i ++ ) hikers . add ( new Pair < > ( D , M + i ) ) ;
    }
    Collections . sort ( hikers ) ;
    final double time1 = ( ( double ) hikers . get ( 0 ) . second ) * ( 360 - hikers . get ( 0 ) . first ) / 360 ;
    final double laps2 = time1 * 1 / ( double ) hikers . get ( 1 ) . second + ( ( double ) hikers . get ( 1 ) . first ) / 360 ;
    final double time2 = ( ( double ) hikers . get ( 1 ) . second ) * ( 360 - hikers . get ( 1 ) . first ) / 360 ;
    final double laps1 = time2 * 1 / ( double ) hikers . get ( 0 ) . second + ( ( double ) hikers . get ( 0 ) . first ) / 360 ;
    final int sol1 ;
    if ( laps2 <= 1 ) sol1 = 1 ;
    else sol1 = ( int ) laps2 - 1 ;
    if ( laps1 <= 1 ) sol2 = 1 ;
    else sol2 = ( int ) laps1 - 1 ;
    out . println ( "Case #" + testCase + ": " + Math . min ( sol1 , sol2 ) ) ;
  }
}
