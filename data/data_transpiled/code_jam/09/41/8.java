public static int makeSwaps ( int [ ] matrix , int i , int j ) throws IOException {
  int moves = 0 ;
  while ( j > i ) {
    matrix [ j ] = matrix [ j - 1 ] ;
    matrix [ j ] = matrix [ j ] ;
    j -- ;
    moves ++ ;
  }
  {
    int [ ] positions = new int [ matrix . length ] ;
    for ( int pos = 0 ;
    pos < matrix . length ;
    pos ++ ) {
      positions [ pos ] = matrix [ pos ] ;
    }
    for ( int pos = 0 ;
    pos < matrix . length ;
    pos ++ ) {
      if ( matrix [ pos ] == '1' ) {
        positions [ pos ] = matrix [ pos ] ;
      }
    }
    return positions . length == 0 ? 0 : Collections . max ( positions ) ;
  }
  {
    int moves = 0 ;
    int N = matrix . length ;
    for ( int i = 0 ;
    i <= N ;
    i ++ ) {
      for ( int j = i ;
      j < N ;
      j ++ ) {
        if ( lastOne ( matrix [ j ] ) <= i ) {
          moves += makeSwaps ( matrix , i , j ) ;
          break ;
        }
      }
    }
    return moves ;
  }
  public static void main ( String [ ] args ) throws IOException {
    BufferedReader file = new BufferedReader ( new FileReader ( "input.in" ) ) ;
    int tests = Integer . parseInt ( file . readLine ( ) ) ;
    for ( int testCase = 1 ;
    testCase <= tests ;
    testCase ++ ) {
      int N = Integer . parseInt ( file . readLine ( ) ) ;
      int [ ] matrix = new int [ N ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        matrix [ i ] = file . readLine ( ) . trim ( ) ;
      }
      System . out . println ( "Case #" + testCase + ": " + solve ( matrix ) + "\n" ) ;
    }
  }
}
