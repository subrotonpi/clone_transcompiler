@ VisibleForTesting static void main ( String [ ] args ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] s = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    s [ i ] = input . nextLine ( ) ;
  }
  Counter counter = new Counter ( ) ;
  for ( String line : s ) {
    counter . update ( line ) ;
  }
}
