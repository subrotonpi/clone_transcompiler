public static String hhmm2min ( String time ) throws IOException {
  final String hh = time . substring ( 0 , time . indexOf ( ':' ) ) ;
  final String mm = time . substring ( time . indexOf ( ':' ) + 1 ) ;
  final int hh = Integer . parseInt ( hh ) ;
  final int mm = Integer . parseInt ( mm ) ;
  return hh * 60 + mm ;
}
else if ( aTrips . size ( ) > 0 ) {
  final int hh = Integer . parseInt ( aTrips . get ( 0 ) ) ;
  final int mm = Integer . parseInt ( aTrips . get ( 0 ) ) ;
  final int hh = Integer . parseInt ( aTrips . get ( 0 ) ) ;
  final int mm = Integer . parseInt ( aTrips . get ( 0 ) ) ;
  final String aTrainsNeeded = String . format ( "%02d:%02d" , hh , mm ) ;
  final Scanner input = new Scanner ( input ) ;
  final Scanner output = new Scanner ( output ) ;
  final int numCases = new Integer ( input . nextInt ( ) ) ;
  for ( int testCase = 0 ;
  testCase < numCases ;
  testCase ++ ) {
    final int turnAround = new Integer ( input . nextInt ( ) ) ;
    final int a2bTrips = input . nextInt ( ) ;
    final int b2Trips = input . nextInt ( ) ;
    final int [ ] aTrips = new int [ a2bTrips ] ;
    for ( int a = 0 ;
    a < a2bTrips ;
    a ++ ) {
      final String line = input . nextLine ( ) ;
      final String depart = line . substring ( 0 , a ) ;
      final String arrive = line . substring ( a + 1 ) ;
      aTrips [ a ] = new int [ ] {
        hhmm2min ( depart ) , hhmm2min ( arrive ) + turnAround }
        ;
      }
      input . close ( ) ;
      output . close ( ) ;
    }
    final int [ ] bTrips = new int [ b2Trips ] ;
    for ( int b = 0 ;
    b < bTrips . length ;
    b ++ ) {
      final String line = input . nextLine ( ) ;
      final String depart = line . substring ( 0 , b ) ;
      final String arrive = line . substring ( b + 1 ) ;
      bTrips [ b ] = new int [ ] {
        hhmm2min ( depart ) , hhmm2min ( arrive ) +