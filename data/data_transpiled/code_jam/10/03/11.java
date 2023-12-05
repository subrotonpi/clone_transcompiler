public static RideResult < Integer > createRideResult ( ) {
  RideResult < Integer > result = new RideResult < Integer > ( ) {
    @ Override public void init ( int cashGained , int nextIndex ) {
      this . cashGained = cashGained ;
      this . nextIndex = nextIndex ;
    }
    @ Override public String toString ( ) {
      return "(+" + result . cashGained + ",->" + result . nextIndex + ")" ;
    }
  }
  ;
  RideResult < Integer > getRiskResult = new RideResult < Integer > ( ) {
    @ Override public RideResult < Integer > getRideResult ( int [ ] groups , int numGroups , int startIndex , int people ) {
      int index = startIndex ;
      int acceptedPeople = 0 ;
      int acceptedGroups = 0 ;
      while ( acceptedGroups < numGroups ) {
        int nextGroupSize = groups [ index ] ;
        if ( nextGroupSize > people ) {
          return new RideResult < Integer > ( acceptedPeople , index ) ;
        }
        acceptedPeople += nextGroupSize ;
        acceptedGroups ++ ;
        people -= nextGroupSize ;
        index = ( index + 1 ) % numGroups ;
      }
      return new RideResult < Integer > ( acceptedPeople , index ) ;
    }
    @ Override public RideResult < Integer > multiplyRideResults ( RideResult < Integer > firstResults , RideResult < Integer > secondResults ) {
      if ( secondResults == null ) {
        secondResults = firstResults ;
      }
      return new RideResult < Integer > ( firstResults . cashGained + secondResults . nextIndex , secondResults . nextIndex ) ;
    }
    @ Override public void solve ( int runsInDay , int karSize , int numGroups , int [ ] groups ) {
      int peopleInAFullCycle = Integer . parseInt ( groups [ 0 ] ) ;
      int [ ] groupsAccepted = new int [ numGroups ] ;
      Result < Integer > [ ] resultsAfterNRides = new Result [ numGroups ] ;
      for ( int i = 1 ;
      i < numGroups ;
      i ++ ) {
        int n = Integer . parseInt ( groups [ i ] ) ;
        groupsAccepted [ i ] = ( result . cashGained + result . nextIndex ) ;
      }
      for ( int x : xrange ( 1 , 30 ) ) {
        int n = 1 << x ;
        resultsAfterNRides [ n ] = ( Result < Integer > ) multiplyRideResults ( resultsAfterNRides [ n / 2 ] ) ;
      }
      int index = 0 ;
      