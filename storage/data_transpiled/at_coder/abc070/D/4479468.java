public static String solve ( int N , List < Integer > ABCs , int Q , int K , List < Integer > XYs ) {
  List < List < Integer >> path = new ArrayList < > ( N + 1 ) ;
  Iterator < Integer > it = ABCs . iterator ( ) ;
  while ( it . hasNext ( ) ) {
    path . add ( new ArrayList < > ( ) ) ;
    it . next ( ) ;
  }
  path . get ( a ) . add ( new ArrayList < > ( ) ) ;
  path . get ( b ) . add ( new ArrayList < > ( ) ) ;
  path . get ( a ) . add ( new ArrayList < > ( ) ) ;
  List < Integer > dst = new ArrayList < > ( N + 1 ) ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    dst . add ( 0 ) ;
  }
  Queue < Integer > q = new LinkedList < > ( ) ;
  q . add ( K ) ;
  while ( q . size ( ) > 0 ) {
    int index = q . poll ( ) ;
    for ( int n = 0 ;
    n < path . get ( index ) . size ( ) ;
    n ++ ) {
      int w = path . get ( index ) . get ( n ) ;
      if ( dst . get ( n ) == 0 ) {
        dst . set ( n , dst . get ( index ) + w ) ;
        q . add ( n ) ;
      }
    }
  }
  StringBuilder ans = new StringBuilder ( ) ;
  for ( int i = 0 ;
  i < XYs . size ( ) ;
  i ++ ) {
    ans . append ( String . valueOf ( dst . get ( i ) + dst . get ( i ) ) ) ;
  }
  return ans . toString ( ) ;
}
