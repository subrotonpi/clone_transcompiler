static final String print ( String input ) {
  final Scanner input = new Scanner ( System . in ) ;
  @ SuppressWarnings ( "resource" ) final int n = input . nextInt ( ) ;
  final int m = input . nextInt ( ) ;
  final int [ ] [ ] E = new int [ n ] [ m ] ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    E [ i ] = new int [ n ] ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int a = input . nextInt ( ) ;
    int b = input . nextInt ( ) ;
    a -- ;
    b -- ;
    E [ a ] [ b ] = b ;
    E [ b ] [ a ] = a ;
  }
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  return q . size ( ) ;
}
