public static int N = Integer . parseInt ( input ) {
  int red = 0 ;
  int blue = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    String item = input . next ( ) ;
    red += item . indexOf ( 'R' ) ;
    blue += item . indexOf ( 'B' ) ;
  }
  String ans = "DRAW" ;
  if ( blue < red ) {
    ans = "TAKAHASHI" ;
  }
  else if ( blue > red ) {
    ans = "AOKI" ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
