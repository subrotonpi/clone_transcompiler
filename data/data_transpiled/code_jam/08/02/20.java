@ Sys public static PrintStream out ( ) throws IOException {
  /* read from stdin */
  String line ;
  /* write the line */
  String hourStr = line . substring ( 0 , 1 ) ;
  String minStr = line . substring ( 1 , 2 ) ;
  /* time to get the time */
  String hourStr = hourStr . substring ( 0 , 2 ) ;
  String minStr = minStr . substring ( 2 , 3 ) ;
  /* get earliest trip */
  EarliestTrip earliestTrip = null ;
  for ( EarliestTrip trip : trips ) {
    if ( ( trip . getTime ( ) >= currentTime ) && ( ( earliestTrip == null ) || ( trip . getTime ( ) < earliestTrip . getTime ( ) ) ) ) {
      earliestTrip = trip ;
    }
  }
  /* read the trip */
  int numCases = Integer . parseInt ( line ) ;
  for ( int caseNum : xrange ( numCases ) ) {
    int turnAroundTime = Integer . parseInt ( line ) ;
    String line = line . substring ( 0 , caseNum ) ;
    int [ ] numTrips = new int [ numTrips . length ] ;
    for ( int entry : line . split ( " " ) ) {
      numTrips [ caseNum ] = Integer . parseInt ( entry ) ;
    }
    List < EarliestTrip > trips = new ArrayList < EarliestTrip > ( ) ;
    for ( int stationNum : xrange ( 2 ) ) {
      for ( int tripNum : xrange ( numTrips [ stationNum ] ) ) {
        String [ ] timeStrs = line . split ( " " ) ;
        EarliestTrip trip = new EarliestTrip ( timeStrs [ 0 ] , timeStrs [ 1 ] ) ;
        trips [ stationNum ] . add ( trip ) ;
      }
    }
    int [ ] numTrains = {
      0 , 0 }
      ;
      while ( StringUtils . isNotBlank ( hourStr ) ) {
        EarliestTrip earliestTrips = new EarliestTrip ( trips [ 0 ] ) ;
        earliestTrips . add ( earliestTrips ) ;
        if ( ( earliestTrips [ 1 ] == null ) || ( ( earliestTrips [ 0 ] != null ) && ( earliestTrips [ 0 ] . getTime ( ) < earliestTrips [ 1 ] . getTime ( ) ) ) ) {
          int st @ @