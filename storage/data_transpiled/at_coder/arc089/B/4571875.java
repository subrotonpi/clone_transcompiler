@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int K = Integer . parseInt ( input [ 1 ] ) ;
  int m [ ] = new int [ 3 * K ] , L = 2 * K , o = 0 ;
  for ( ;
  ;
  ) {
    int x = input [ 2 ] ;
    int y = input [ 3 ] ;
    char c = input [ 4 ] ;
    int t = c == 'W' ? 1 : 2 * t - 1 ;
    o += t ;
  }
  for ( ;
  ;
  ) {
    m [ L ] = m [ 0 ] ;
    m = cumsum ( m , 0 ) ;
    m [ L ] -= m [ K ] ;
  }
  m = m [ L ] ;
  System . out . println ( o - ( int [ ] [ ] ) ( m + roll ( roll ( m , K , 0 ) , K , 1 ) ) . min ( ) ) ;
}
