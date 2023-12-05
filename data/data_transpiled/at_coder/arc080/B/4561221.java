@ VisibleForTesting static Statistics mean = new Statistics ( ) {
  private static final long serialVersionUID = - 5947906269998L ;
  @ Override public void j ( int q ) {
    if ( q == 1 ) System . out . println ( "YES" ) ;
    else System . out . println ( "NO" ) ;
    exit ( 0 ) ;
  }
  @ Override public void ct ( int x , int y ) {
    if ( ( x > y ) && ( x < y ) ) System . out . print ( "+" ) ;
    else if ( ( x < y ) && ( x < y ) ) System . out . print ( "-" ) ;
    else System . out . print ( "?" ) ;
  }
  @ Override public int ip ( ) {
    return Integer . parseInt ( input . nextLine ( ) ) ;
  }
}
