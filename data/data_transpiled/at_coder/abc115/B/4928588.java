public static void print ( int n ) {
  n = Integer . parseInt ( input ( ) ) ;
  p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = Integer . parseInt ( input ( ) ) ;
  System . out . println ( ( int ) ( sum ( p ) - max ( p ) / 2 ) ) ;
}
