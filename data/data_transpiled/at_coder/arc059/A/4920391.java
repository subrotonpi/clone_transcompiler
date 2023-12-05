public static void print ( int N ) {
  int [ ] a = Integer . parseInt ( input ( ) ) ;
  double sum = 0 ;
  double cost = 0 ;
  for ( int x : a ) {
    sum += x ;
  }
  int ave = Math . round ( sum / N ) ;
  for ( int x : a ) {
    cost += ( x - ave ) * ( x - ave ) ;
  }
  System . out . println ( cost ) ;
}
