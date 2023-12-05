public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > x = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    x . add ( Integer . parseInt ( input ) ) ;
  }
  List < Integer > x_s = new ArrayList < > ( x ) ;
  List < Integer > m_l = x_s . get ( N / 2 - 1 ) , m_r = x_s . get ( N / 2 ) ;
  Map < Integer , Integer > map = Maps . newHashMap ( ) ;
  for ( int i = 0 ;
  i < x_s . size ( ) ;
  i ++ ) {
    int s = x_s . get ( i ) ;
    if ( i < N / 2 ) {
      map . put ( s , m_r ) ;
    }
    else {
      map . put ( s , m_l ) ;
    }
  }
  for ( int i : x ) {
    System . out . println ( map . get ( i ) ) ;
  }
}
