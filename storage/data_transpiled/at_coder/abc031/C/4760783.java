public static double max ( ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > S = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) S . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  double ans = - Double . MAX_VALUE ;
  for ( int n = 0 ;
  n < N ;
  n ++ ) {
    double T = - Double . MAX_VALUE ;
    double A = - Double . MAX_VALUE ;
    for ( int m = 0 ;
    m < N ;
    m ++ ) {
      if ( n != m ) {
        int a = Math . min ( n , m ) ;
        int b = Math . max ( n , m ) ;
        double tT = sum ( S . subList ( a , b + 1 ) ) ;
        double tA = sum ( S . subList ( a + 1 , b + 1 ) ) ;
        if ( A != tA ) {
          T = max ( T , A ) ;
          A = max ( T , tA ) ;
        }
      }
    }
    ans = max ( ans , T ) ;
  }
  System . out . println ( ans ) ;
  return T ;
}
