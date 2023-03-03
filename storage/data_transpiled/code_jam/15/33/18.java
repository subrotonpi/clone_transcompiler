public static int solve ( int C , int [ ] D , int V ) {
  int d = 0 ;
  int v = 0 ;
  List < Integer > N = new ArrayList < > ( ) ;
  while ( v < V ) {
    if ( d < D . length && D [ d ] <= v + 1 ) {
      d ++ ;
    }
    else {
      N . add ( v + 1 ) ;
    }
    v = ( Arrays . stream ( D , 0 , d ) . collect ( Collectors . toList ( ) ) ) . sum ( ) ;
  }
  return N . size ( ) ;
}
for ( int t = 0 ;
t < input . nextInt ( ) ;
t ++ ) {
  C = Integer . parseInt ( input . nextLine ( ) ) ;
  final int V = Integer . parseInt ( input . nextLine ( ) ) ;
  D = Integer . parseInt ( input . nextLine ( ) ) ;
  System . out . println ( "Case #" + ( t + 1 ) + ": " + solve ( C , D , V ) ) ;
}
