public static void print ( int n ) {
  int s = 0 , a = 0 , b = 0 ;
  boolean f = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int p = t - s - ( Math . abs ( x - a ) + Math . abs ( y - b ) ) ;
    if ( p % 2 == 1 || p < 0 ) f = false ;
    s = t ;
    a = x ;
    b = y ;
  }
  System . out . println ( f ? "Yes" : "No" ) ;
}
