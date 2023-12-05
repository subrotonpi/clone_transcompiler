public static final Scanner in = new Scanner ( System . in ) {
  @ Override public String nextLine ( ) {
    return nextLine ( ) ;
  }
}
;
int cases = Integer . parseInt ( in . nextLine ( ) ) ;
for ( int testCase = xrange ( cases ) ;
testCase < cases ;
testCase ++ ) {
  String [ ] [ ] grid = new String [ 4 ] [ 4 ] ;
  grid [ 0 ] [ 0 ] = nextLine ( ) ;
  grid [ 1 ] [ 1 ] = nextLine ( ) ;
  grid [ 2 ] [ 2 ] = nextLine ( ) ;
  grid [ 3 ] [ 3 ] = nextLine ( ) ;
  if ( testCase < cases - 1 ) {
    junk = in . nextLine ( ) ;
  }
  char winner = 0 ;
  int fill = 0 ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( grid [ i ] [ j ] != '.' ) {
        fill ++ ;
      }
    }
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( ( grid [ i ] [ j ] != '.' ) && ( grid [ i ] [ j ] != '.' ) ) {
        winner = grid [ i ] [ j ] ;
      }
    }
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( ( grid [ 0 ] [ i ] != '.' ) && ( grid [ 1 ] [ i ] != '.' ) && ( grid [ 2 ] [ i ] != '.' ) && ( grid [ 3 ] [ i ] != '.' ) ) {
        winner = grid [ 0 ] [ j ] ;
      }
    }
  }
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 4 ;
    j ++ ) {
      if ( ( grid [ 0 ] [ i ] != '.' ) && ( grid [ 1 ] [ i ] != '.' ) && ( grid [ 2 ] [ i ] != '.' ) && ( grid [ 3 ] [ i ] != '.' ) ) {
        winner = grid [ 1 ] [ i ] ;
      }
    }
  }
  if ( winner == 'X' || winner == 'O' ) {
    System . out . println ( "Case #" +