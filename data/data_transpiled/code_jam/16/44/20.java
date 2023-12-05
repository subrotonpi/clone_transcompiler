static private boolean possible ( Set < Integer > Workers , Set < Integer > Machines , List < List < Integer >> can ) {
  if ( Workers . isEmpty ( ) ) {
    return true ;
  }
  for ( int worker : Workers ) {
    boolean result = false ;
    for ( int machine : Machines ) {
      if ( can . get ( worker ) . get ( machine ) . equals ( "1" ) ) {
        Workers . remove ( worker ) ;
        Machines . remove ( machine ) ;
        boolean r = possible ( Workers , Machines , can ) ;
        Workers . add ( worker ) ;
        Machines . add ( machine ) ;
        if ( r == false ) {
          return false ;
        }
        else {
          result = true ;
        }
      }
    }
    if ( result == false ) {
      return false ;
    }
  }
  return true ;
}
