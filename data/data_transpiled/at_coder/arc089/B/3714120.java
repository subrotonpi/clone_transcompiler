@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input [ 0 ] ) ;
  int K = Integer . parseInt ( input [ 1 ] ) ;
  int m [ ] = new int [ 3 * K ] , L = 2 * K , o = 0 ;
  for ( ;
  0 < N ;
  N ++ ) x = input [ N ++ ] ;
  int y = input [ N ++ ] ;
  char c = input [ N ++ ] ;
  int t = c == 'W' ? 0 : 1 ;
  m [ ( int ) x % L ] [ y % L ] += 2 * t - 1 ;
  o += t ;
  for ( ;
  0 <= t ;
  t ++ ) m [ t ] [ 0 ] = m [ t ] ;
  m = cumsum ( m , 0 ) ;
  m [ t ] -= m [ t ] ;
  m = m [ t ] ;
  System . out . println ( o - ( int ) ( ( m + roll ( roll ( m , K , 0 ) , K , 1 ) ) . min ( ) ) ) ;
  return m ;
}
