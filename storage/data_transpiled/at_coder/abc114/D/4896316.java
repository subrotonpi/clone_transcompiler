@ VisibleForTesting static Statistics mean = new Statistics ( ) {
  private static final long serialVersionUID = 1L ;
  @ Override public void print ( int q ) {
    if ( q == 1 ) System . out . println ( "Yay!" ) ;
    else System . out . println ( ":(" ) ;
    exit ( 0 ) ;
  }
  @ Override public void ct ( int x , int y ) {
    if ( ( x > y ) && ( x < y ) ) System . out . println ( "+" ) ;
    else if ( ( x < y ) && ( x > y ) ) System . out . println ( "-" ) ;
    else System . out . println ( "?" ) ;
  }
  @ Override public int ip ( ) {
    return ( int ) input . nextInt ( ) ;
  }
  @ Override public void printrow ( int [ ] a ) {
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) System . out . println ( a [ i ] ) ;
  }
  @ Override public int combinations ( int n , int r ) {
    if ( n < r ) return 0 ;
    return Math . factorial ( n ) / ( Math . factorial ( n - r ) * Math . factorial ( r ) ) ;
  }
  @ Override public int permutations ( int n , int r ) {
    if ( n < r ) return 0 ;
    return Math . factorial ( n ) / Math . factorial ( n - r ) ;
  }
}
