@ CollectionsFunction public static int solve ( List < Tribe > tribes ) throws IOException {
  HashMap < String , ArrayList < Attack >> attacks = new HashMap < String , ArrayList < Attack >> ( ) ;
  for ( Tribe tribe : tribes ) {
    for ( int i = 0 ;
    i < tribe . times ;
    i ++ ) {
      Attack attack = new Attack ( ) ;
      attack . day = tribe . firstDay + tribe . period * i ;
      attack . west = tribe . west + tribe . move * i ;
      attack . east = tribe . east + tribe . move * i ;
      attack . str = tribe . str + tribe . deltaStr * i ;
      if ( attack . str > 0 ) {
        String day = attack . day ;
        if ( ! attacks . containsKey ( day ) ) {
          attacks . put ( day , new ArrayList < Attack > ( ) ) ;
        }
        attacks . get ( day ) . add ( attack ) ;
      }
    }
  }
  int [ ] wall = new int [ 100000 ] ;
  for ( int i = 0 ;
  i < attacks . keySet ( ) . size ( ) ;
  i ++ ) {
    wall [ i ] = 0 ;
  }
  int ans = 0 ;
  for ( String day : new ArrayList < Attack > ( attacks . keySet ( ) ) ) {
    boolean add_wall = false ;
    for ( Attack a : attacks . get ( day ) ) {
      boolean win = false ;
      for ( int i = a . west ;
      i < a . east ;
      i ++ ) {
        if ( wall [ i ] < a . str ) {
          win = true ;
          add_wall = true ;
          break ;
        }
      }
      if ( win ) {
        ans ++ ;
      }
    }
    if ( add_wall ) {
      for ( Attack a : attacks . get ( day ) ) {
        for ( int i = a . west ;
        i < a . east ;
        i ++ ) {
          wall [ i ] = Math . max ( wall [ i ] , a . str ) ;
        }
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
