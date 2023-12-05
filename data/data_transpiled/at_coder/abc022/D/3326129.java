@ InputFunction public static void input ( @ AggregationState HyperLogLogState state ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  class P {
    int x , y ;
  }
  List < P > A = new ArrayList < P > ( N ) ;
  int axSum = 0 , aySum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    axSum += x ;
    aySum += y ;
    A . add ( P . create ( x , y ) ) ;
  }
  List < P > B = new ArrayList < P > ( N ) ;
  int bxSum = 0 , bySum = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    bxSum += x ;
    bySum += y ;
    B . add ( P . create ( x , y ) ) ;
  }
  P A_w = new P ( axSum / N , aySum / N ) ;
  P B_w = new P ( bxSum / N , bySum / N ) ;
  double maxDistanceA = 0 ;
  double maxDistanceB = 0 ;
  for ( P a : A ) {
    double distance = Math . sqrt ( ( a . x - A_w . x ) * ( a . x - A_w . x ) + ( b . y - B_w . y ) * ( b . y - B_w . y ) ) ;
    if ( distance > maxDistanceA ) {
      maxDistanceA = distance ;
    }
  }
  System . out . println ( maxDistanceB / maxDistanceA ) ;
}
