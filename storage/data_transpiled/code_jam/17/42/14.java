public static PrintStream inputF = new PrintStream ( new File ( "B-large.in" ) ) {
  private PrintStream output = new PrintStream ( new FileOutputStream ( "B-large.out" ) ) ;
  int numCases = Integer . parseInt ( inputF . readLine ( ) ) ;
  {
    HashMap < Integer , Integer > custCounts = new HashMap < Integer , Integer > ( ) ;
    HashMap < Integer , Integer > seatCounts = new HashMap < Integer , Integer > ( ) ;
    for ( int i = 1 ;
    i <= numCusts ;
    i ++ ) custCounts . put ( i , 0 ) ;
    for ( int i = 1 ;
    i <= numSeats ;
    i ++ ) seatCounts . put ( i , 0 ) ;
    Iterator < Integer > iter = ticketCustomerPairs . iterator ( ) ;
    while ( iter . hasNext ( ) ) {
      Integer pi = iter . next ( ) ;
      Integer ci = ticketCustomerPairs . get ( pi ) ;
      custCounts . put ( ci , 1 ) ;
      seatCounts . put ( pi , 1 ) ;
    }
    int lowerBound = Collections . max ( custCounts . values ( ) ) ;
    int freeSeats = 0 ;
    for ( int i = 1 ;
    i <= numSeats ;
    i ++ ) {
      if ( seatCounts . get ( i ) <= lowerBound ) freeSeats += lowerBound - seatCounts . get ( i ) ;
      else {
        freeSeats -= seatCounts . get ( i ) - lowerBound ;
        while ( freeSeats < 0 ) {
          lowerBound ++ ;
          freeSeats += i ;
        }
      }
    }
    int upgrades = 0 ;
    for ( int i = 1 ;
    i <= numSeats ;
    i ++ ) {
      if ( seatCounts . get ( i ) > lowerBound ) upgrades += seatCounts . get ( i ) - lowerBound ;
    }
    return new PrintStream ( output ) ;
  }
}
