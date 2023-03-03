public static void print ( int n = input ) {
  int s = 0 , a = 0 , b = 0 ;
  boolean f = true ;
  for ( ;
  ;
  ) {
    int t = Integer . parseInt ( input . readLine ( ) ) ;
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int p = t - s - ( x - a ) ;
    if ( p % 2 == 1 || p < 0 ) {
      f = false ;
    }
  }
  System . out . println ( f ? "Yes" : "No" ) ;
}
