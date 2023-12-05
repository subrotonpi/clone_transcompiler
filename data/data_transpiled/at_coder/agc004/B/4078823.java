public static double N ( int x ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > aList = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) aList . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  List < Integer > exList = aList . stream ( ) . map ( Integer :: parseInt ) . collect ( toList ( ) ) ;
  exList . addAll ( aList ) ;
  double ans = Double . MAX_VALUE ;
  double [ ] costList = new double [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    double cost = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( i == 0 ) {
        cost += exList . get ( N + j ) ;
        costList [ j ] = exList . get ( N + j ) ;
      }
      else {
        double tmp = costList [ j ] ;
        if ( tmp > exList . get ( N - i + j ) ) {
          costList [ j ] = exList . get ( N - i + j ) ;
          cost += exList . get ( N - i + j ) ;
        }
        else {
          cost += tmp ;
        }
      }
    }
    cost += x * i ;
    ans = Math . min ( ans , cost ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
