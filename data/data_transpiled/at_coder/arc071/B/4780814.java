public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int m = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > xlist = Lists . newArrayList ( ) ;
  List < Integer > ylist = Lists . newArrayList ( ) ;
  long xsum = 0 ;
  for ( int i = 0 ;
  i < xlist . size ( ) ;
  i ++ ) {
    xsum += i * x - ( n - i - 1 ) * x ;
  }
  long ysum = 0 ;
  for ( int i = 0 ;
  i < ylist . size ( ) ;
  i ++ ) {
    ysum += i * y - ( m - i - 1 ) * y ;
  }
  System . out . println ( xsum * ysum % 1000000007 ) ;
}
