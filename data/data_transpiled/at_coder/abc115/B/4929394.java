public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  p = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) p [ i ] = Integer . parseInt ( input ( ) ) ;
  p . sort ( ) ;
  System . out . println ( sum ( p ) - p [ p . length - 1 ] / 2 ) ;
}
