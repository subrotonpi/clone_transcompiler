public static void print ( int n ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  int [ ] b = new int [ n ] ;
  HashSet < Integer > yo = new HashSet < Integer > ( ) ;
  int ans = 0 ;
  int migi = 0 ;
  int hida = 0 ;
  while ( migi < n ) {
    yo . add ( a [ migi ] ) ;
    if ( migi == hida ) hida ++ ;
    if ( hida < n && ! yo . contains ( a [ hida ] ) ) {
      yo . add ( a [ hida ] ) ;
      hida ++ ;
    }
    else {
      ans = Math . max ( ans , yo . size ( ) ) ;
      yo . remove ( a [ migi ] ) ;
      migi ++ ;
    }
  }
  System . out . println ( ans ) ;
}
