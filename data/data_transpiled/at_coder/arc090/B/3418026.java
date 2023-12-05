public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  List < Set < Integer >> edge = new ArrayList < > ( N + 1 ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    int d = Integer . parseInt ( input ) ;
    edge . get ( l ) . add ( new Integer ( r ) ) ;
    edge . get ( r ) . add ( new Integer ( d ) ) ;
    edge . get ( l ) . add ( new Integer ( l ) ) ;
    edge . get ( r ) . add ( new Integer ( - d ) ) ;
  }
  HashMap < Integer , Integer > loc = new HashMap < > ( ) ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    Stack < Integer > stack = new Stack < > ( ) ;
    if ( ! loc . containsKey ( i ) ) {
      loc . put ( i , 0 ) ;
      stack . push ( i ) ;
    }
    while ( stack . size ( ) > 0 ) {
      int s = stack . pop ( ) ;
      for ( int t : edge . get ( s ) ) {
        int d = edge . get ( t ) ;
        if ( ! loc . containsKey ( t ) ) {
          loc . put ( t , loc . get ( s ) + d ) ;
          stack . push ( t ) ;
        }
        else if ( loc . get ( t ) != loc . get ( s ) + d ) {
          System . out . println ( "No" ) ;
          exit ( ) ;
        }
      }
    }
  }
  System . out . println ( "Yes" ) ;
}
