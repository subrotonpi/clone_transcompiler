private static void print ( int n , int m , int x , int y ) {
  int [ ] xWantTogether = new int [ n ] ;
  int [ ] yWantTogether = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xWantTogether [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    yWantTogether [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  }
  int z = 100 ;
  z = Math . max ( xWantTogether , z ) + 1 ;
  if ( ( x < z && z <= y ) && ( Math . max ( xWantTogether , z ) < z ) && ( Math . min ( yWantTogether , z ) >= z ) ) {
    System . out . println ( "No War" ) ;
  }
  else {
    System . out . println ( "War" ) ;
  }
}
