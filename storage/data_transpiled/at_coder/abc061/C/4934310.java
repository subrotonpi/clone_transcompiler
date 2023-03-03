static final Scanner getScanner ( ) {
  final Scanner fastInput = new Scanner ( System . in ) ;
  final int N = fastInput . nextInt ( ) ;
  final int K = fastInput . nextInt ( ) ;
  final int [ ] [ ] data = new int [ N ] [ K ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    data [ j ] [ k ] = fastInput . nextInt ( ) ;
  }
  final List < Integer > ab = new ArrayList < > ( Arrays . asList ( data ) ) ;
  Collections . sort ( ab ) ;
  int number = 0 ;
  for ( int a = 0 ;
  a < K ;
  a ++ ) {
    int b = ab . get ( a ) ;
    number += b ;
    if ( number >= K ) {
      System . out . println ( a ) ;
      break ;
    }
  }
  return new Scanner ( System . in ) ;
}
