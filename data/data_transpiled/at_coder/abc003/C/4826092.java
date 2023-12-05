public static void input ( ) {
  int n = Integer . parseInt ( input . readLine ( ) ) ;
  int k = Integer . parseInt ( input . readLine ( ) ) ;
  double c = 0.000000 ;
  List < Integer > rates = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    rates . add ( i ) ;
  }
  rates . sort ( ) ;
  rates . remove ( 0 ) ;
  rates . remove ( k ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c = ( c + i ) / 2 ;
  }
  System . out . println ( c ) ;
}
