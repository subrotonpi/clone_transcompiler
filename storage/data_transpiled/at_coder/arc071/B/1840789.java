@ Function public static void apply ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  List < Integer > xs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    xs . add ( i ) ;
  }
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    ys . add ( i ) ;
  }
  int MOD = 10 * * 9 + 7 ;
  fX = sum ( xs , n , m ) % MOD ;
  fY = sum ( ys , m , m ) % MOD ;
  System . out . println ( ( fX * fY ) % MOD ) ;
}
