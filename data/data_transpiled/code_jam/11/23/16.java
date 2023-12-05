@ VisibleForTesting static void print ( List < Room > rooms , int U , int V ) {
  for ( int i = 0 ;
  i < rooms . size ( ) ;
  i ++ ) {
    Room room = rooms . get ( i ) ;
    if ( room . contains ( U ) && room . contains ( V ) ) {
      int u = room . indexOf ( U ) ;
      int v = room . indexOf ( V ) ;
      int u = Math . min ( u , v ) ;
      int v = Math . max ( u , v ) ;
      Room room1 = CollectionUtils . find ( rooms , new Predicate < Room > ( ) {
        @ Override public boolean apply ( Room x ) {
          return x . isBefore ( u ) && x . isAfter ( v ) ;
        }
      }
      , new Predicate < Room > ( ) {
        @ Override public boolean apply ( Room x ) {
          return x . isBefore ( u ) && x . isAfter ( v ) ;
        }
      }
      , new Predicate < Room > ( ) {
        @ Override public boolean apply ( Room x ) {
          return x . isBefore ( u ) && x . isBefore ( v ) ;
        }
      }
      , new Predicate < Room > ( ) {
        @ Override public boolean apply ( Room x ) {
          return x . isBefore ( u ) && x . isBefore ( v ) ;
        }
      }
      , new Predicate < Room > ( ) {
        @ Override public boolean apply ( Room x ) {
          return x . isBefore ( u ) && x . isBefore ( v ) ;
        }
      }
      , new Predicate < Room > ( ) {
        @ Override public boolean apply ( Room x ) {
          return x . isBefore ( u ) || x . isBefore ( v ) ;
        }
      }
      ) ;
      rooms . remove ( i ) ;
      return rooms . stream ( ) . map ( Room :: getName ) . map ( Room :: getName ) . collect ( Collectors . toList ( ) ) . stream ( ) . allMatch ( name -> name . startsWith ( "#" ) ) ;
    }
  }
}
