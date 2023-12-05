@ InputFunction public static void input ( @ AggregationState HyperLogLogState state ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  class P {
    int x , y ;
  }
  List < P > A = new ArrayList < P > ( N ) ;
  int ax_sum = 0 , ay_sum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    ax_sum += x ;
    ay_sum += y ;
    A . add ( P . create ( x , y ) ) ;
  }
  List < P > B = new ArrayList < P > ( N ) ;
  int bx_sum = 0 , bysum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    bx_sum += x ;
    bysum += y ;
    B . add ( P . create ( x , y ) ) ;
  }
  P A_w = state . add ( P . create ( ax_sum / N , ay_sum / N ) ) ;
  P B_w = state . add ( P . create ( bx_sum / N , bysum / N ) ) ;
  double max_distance_A2 = 0 ;
  double max_distance_B2 = 0 ;
  for ( P a : A ) {
    double distance_2 = ( a . x - A_w . x ) * ( a . y - A_w . y ) + ( b . y - B_w . y ) * ( b . x - B_w . x ) ;
    if ( distance_2 > max_distance_A2 ) {
      max_distance_B2 = distance_2 ;
    }
  }
  System . out . println ( Math . sqrt ( max_distance_B2 / max_distance_A2 ) ) ;
}
