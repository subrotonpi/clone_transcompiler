public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  ArrayList < String > sl = new ArrayList < String > ( ) ;
  ArrayList < Integer > pl = new ArrayList < Integer > ( ) ;
  String s , p ;
  s = input . substring ( 0 , N ) ;
  p = input . substring ( N ) ;
  sl . add ( s ) ;
  pl . add ( p ) ;
  int mx = p ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    s = input . substring ( 0 , i ) ;
    p = input . substring ( i + 1 ) ;
    sl . add ( s ) ;
    pl . add ( p ) ;
    mx = Math . max ( mx , p ) ;
  }
  if ( mx > Integer . MAX_VALUE / 2 ) System . out . println ( sl . get ( pl . indexOf ( mx ) ) ) ;
  else System . out . println ( "atcoder" ) ;
}
