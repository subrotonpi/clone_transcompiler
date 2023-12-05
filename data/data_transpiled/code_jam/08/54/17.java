static boolean isrock ( int i , int j ) throws IOException {
  long H , W , R ;
  for ( int i = 0 ;
  i < rocks . length ;
  i ++ ) {
    if ( rocks [ i ] == i && rocks [ i ] == j ) return true ;
  }
  File file = new File ( System . getProperty ( "file.name" ) ) ;
  BufferedReader inputReader = new BufferedReader ( new FileReader ( file ) ) ;
  int numcases = Integer . parseInt ( inputReader . readLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= numcases ;
  testCase ++ ) {
    H = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
    W = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
    R = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
    rocks = new long [ R ] ;
    for ( int k = 0 ;
    k < R ;
    k ++ ) {
      r = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
      c = Long . parseLong ( inputReader . readLine ( ) . trim ( ) ) ;
      rocks [ k ] = new long [ r - 1 ] [ c - 1 ] ;
    }
  }
  int [ ] [ ] F = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 1 ;
    j < W ;
    j ++ ) {
      int n = 0 ;
      if ( i > 0 && j > 1 && ! isrock ( i - 1 , j - 2 ) ) n += F [ i - 1 ] [ j - 2 ] ;
      if ( i > 1 && j > 0 && ! isrock ( i - 2 , j - 1 ) ) n += F [ i - 2 ] [ j - 1 ] ;
      F [ i ] [ j ] = n ;
    }
  }
  int M = F [ H - 1 ] [ W - 1 ] ;
  System . out . println ( "Case #" + testCase + ": " + ( M % 10007 ) ) ;
  return false ;
}
