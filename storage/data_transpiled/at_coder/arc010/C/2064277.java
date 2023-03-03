static void print ( int n , int m , int Y , int Z ) {
  Map < Integer , Integer > D = new HashMap < > ( ) ;
  IntList C = new IntList ( ) ;
  IntList P = new IntList ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    int c = input . nextInt ( ) ;
    int p = input . nextInt ( ) ;
    C . add ( c ) ;
    P . add ( Integer . parseInt ( p ) ) ;
  }
  int * B = C . indexOf ( ' ' ) ;
  int ALL = 2 * m - 1 ;
  Map < Integer , Integer > S = new HashMap < > ( ) ;
  S . put ( ( byte ) 0 , 0 ) ;
  int INF = 10 * 8 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Map < Integer , Integer > T = new HashMap < > ( ) ;
    for ( int state = 0 ;
    state < S . size ( ) ;
    state ++ ) {
      int col = S . get ( state ) ;
      int score = S . get ( state , col ) ;
      if ( ( score > 0 ) && ( score < INF ) ) {
        T . put ( state , col , Math . max ( T . get ( state , col ) , score + Y + P . get ( col ) ) ) ;
      }
      else {
        T . put ( state , col , score + Y + P . get ( col ) ) ;
      }
    }
    S = T ;
  }
  System . out . println ( max ( S . get ( key ) + Z * ( key . intValue ( ) == ALL ) ) ) ;
}
