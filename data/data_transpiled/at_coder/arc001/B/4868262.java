public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  List < String > l = new LinkedList < String > ( ) ;
  l . add ( input ) ;
  int [ ] l2 = new int [ 5 ] ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) l2 [ i ] = l . indexOf ( String . valueOf ( i ) ) ;
  System . out . println ( max ( l2 ) + " " + min ( l2 ) ) ;
}
