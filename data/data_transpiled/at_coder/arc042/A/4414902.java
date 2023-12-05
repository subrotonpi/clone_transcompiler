static final void main ( String [ ] args ) throws IOException {
  System . setIn ( args ) ;
  Scanner input = new Scanner ( System . in ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int M = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] l = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    l [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    N ++ ;
    int n = Integer . parseInt ( input . nextLine ( ) ) - 1 ;
    l [ n ] [ 0 ] = N ;
  }
  Arrays . sort ( l ) ;
  for ( int v = 0 , i = 0 ;
  i < l . length ;
  i ++ ) {
    System . out . println ( l [ i ] [ 0 ] + " " + l [ i ] [ 1 ] ) ;
  }
}
