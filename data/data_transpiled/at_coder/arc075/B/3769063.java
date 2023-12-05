@ GwtIncompatible ( "System.out" ) public static boolean isFinish ( List < Integer > L , int n , int bomb , int atk ) {
  int cnt = 0 ;
  for ( int v : L ) {
    int tmp = v - n * atk ;
    cnt += Math . max ( 0 , - ( - tmp / bomb ) ) ;
  }
  return cnt <= n ;
}
