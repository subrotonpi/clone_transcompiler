static final int getBase ( ) {
  int lim = 1000 ;
  int mod = ( int ) ( 1e9 + 7 ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > xs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) xs . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  lim = Math . min ( b , lim ) ;
  int t = ( b - lim ) / n ;
  double [ ] ys = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ys [ i ] = Math . log ( xs . get ( i ) ) + Math . log ( a ) * t ;
  double [ ] zs = new double [ n ] ;
  for ( int i = 0 ;
  i < b - t * n ;
  i ++ ) zs [ i ] = t ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int i = ys . indexOf ( Math . min ( ys [ i ] , ys [ i ] ) ) ;
    ys [ i ] += Math . log ( a ) ;
    zs [ i ] ++ ;
  }
  List < Integer > ixs = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) ixs . add ( i ) ;
  Collections . sort ( ixs , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer i1 , Integer i2 ) {
      return ys [ i1 ] - ys [ i2 ] ;
    }
  }
  ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . println ( xs . get ( i ) * Math . pow ( a , zs [ i ] , mod ) % mod ) ;
  return n ;
}
