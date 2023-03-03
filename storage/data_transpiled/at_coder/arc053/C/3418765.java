public static void print ( int n ) {
  ArrayList < Point > x = new ArrayList < Point > ( ) , y = new ArrayList < Point > ( ) , ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int a = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    int b = ( Integer . parseInt ( input . readLine ( ) ) ) ;
    if ( a < b ) x . add ( new Point ( a , b ) ) ;
    else y . add ( new Point ( b , a ) ) ;
  }
  x . clear ( ) ;
  y . clear ( ) ;
  for ( int i = 0 ;
  i < x . size ( ) ;
  i ++ ) {
    int j = x . get ( i ) ;
    m += j ;
    ans = Math . max ( ans , m ) ;
    m = m - j ;
  }
  System . out . println ( ans ) ;
}
