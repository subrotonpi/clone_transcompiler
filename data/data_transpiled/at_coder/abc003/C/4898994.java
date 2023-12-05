public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int k = Integer . parseInt ( input ) ;
  List < Double > r = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) r . add ( Double . parseDouble ( input ) ) ;
  r . sort ( ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) ans = ( ans + r . get ( k - i - 1 ) ) / 2 ;
  System . out . println ( ans ) ;
}
