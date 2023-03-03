public static void solve ( String s , int x , int y ) {
  /* update move */
  Set < Integer > ncx = new HashSet < Integer > ( ) ;
  Set < Integer > cx = cxy . get ( isX ) ;
  for ( Integer x : cx ) {
    ncx . add ( x + move ) ;
    ncx . add ( x - move ) ;
  }
  cxy . put ( isX , ncx ) ;
  List < List < Integer >> spl = CollectionUtils . split ( s . split ( "T" ) ) ;
  isX = 1 ;
  cxy = new ArrayList < Integer > ( ) ;
  cxy . add ( new Integer ( spl . size ( ) ) ) ;
  for ( List < Integer > l : spl ) {
    update ( l ) ;
    isX ^= 1 ;
  }
}
