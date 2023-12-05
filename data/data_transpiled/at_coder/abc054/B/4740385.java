public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  String [ ] A = new String [ N ] , B = new String [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = input . substring ( 0 , N ) ;
  }
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    B [ i ] = input . substring ( 0 , M ) ;
  }
  String ans = "" ;
  for ( int i = 0 ;
  i < N - M + 1 ;
  i ++ ) {
    if ( A [ i ] . contains ( B [ 0 ] ) ) {
      ans += "T" ;
      int y = A [ i ] . indexOf ( B [ 0 ] ) ;
      for ( int j = 1 ;
      j < M ;
      j ++ ) {
        if ( A [ i + j ] . substring ( y , y + M ) . equals ( B [ j ] ) ) {
          ans += "T" ;
        }
        else {
          ans += "F" ;
        }
      }
    }
  }
  if ( ans . contains ( "T" * M ) ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
