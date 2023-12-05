public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  String [ ] [ ] list = new String [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    list [ i ] = String . valueOf ( input ) ;
  }
  int R = 0 ;
  int B = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( list [ i ] [ j ] . equals ( "R" ) ) {
        R ++ ;
      }
      else if ( list [ i ] [ j ] . equals ( "B" ) ) {
        B ++ ;
      }
    }
  }
  if ( R == B ) {
    System . out . println ( "DRAW" ) ;
  }
  else if ( R > B ) {
    System . out . println ( "TAKAHASHI" ) ;
  }
  else if ( R < B ) {
    System . out . println ( "AOKI" ) ;
  }
}
