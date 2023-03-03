public static void main ( String input ) {
  int n = Integer . parseInt ( input ) ;
  String maps = "" ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    maps += input ;
  }
  int R = maps . indexOf ( "R" ) ;
  int B = maps . indexOf ( "B" ) ;
  if ( R > B ) {
    System . out . println ( 'TAKAHASHI' ) ;
  }
  else if ( R == B ) {
    System . out . println ( "DRAW" ) ;
  }
  else {
    System . out . println ( "AOKI" ) ;
  }
}
