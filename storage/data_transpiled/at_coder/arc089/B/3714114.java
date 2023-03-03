@ GwtIncompatible ( "java.util.BitSet" ) public static int [ ] [ ] input ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int K = Integer . parseInt ( input ( ) ) ;
  DenseMatrix64F m = new DenseMatrix64F ( 3 * K , 3 * K ) ;
  int L = 2 * K ;
  int o = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double x = input . nextDouble ( ) ;
    double y = input . nextDouble ( ) ;
    x = ( int ) x % L ;
    y = ( int ) y % L ;
    boolean t = c == 'W' ;
    m . set ( x , y ) ;
    m . add ( 2 * t - 1 ) ;
    o += t ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    m . set ( i , i ) ;
  }
  m . clear ( ) ;
  m . set ( 0 , 0 ) ;
  System . out . println ( o - ( int [ ] [ ] ) ( m . add ( roll ( roll ( m , K , 0 ) , K , 1 ) ) . min ( ) ) ) ;
  return m ;
}
