static final int findLongest ( int u , int forb , Map < Integer , List < Integer >> rev ) {
  int ans = 0 ;
  if ( ! rev . containsKey ( u ) ) {
    return 1 ;
  }
  for ( int x : rev . get ( u ) ) {
    if ( x == forb ) {
      continue ;
    }
    ans = Math . max ( ans , findLongest ( x , - 1 , rev ) ) ;
  }
  return 1 + ans ;
}
