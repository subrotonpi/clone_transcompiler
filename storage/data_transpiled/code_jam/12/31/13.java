static final boolean checkInPlace ( int i , boolean [ ] [ ] graph , boolean [ ] seen , boolean mini ) throws IOException {
  System . setProperty ( "line.separator" , "" ) ;
  /* Check if visited == true */
  if ( graph [ i ] [ 0 ] == true ) {
    return true ;
  }
  else {
    seen [ i ] = true ;
  }
  for ( int j = 0 ;
  ! graph [ i ] [ j ] ;
  j ++ ) {
    if ( graph [ i ] [ j ] ) {
      boolean res = check ( j , graph , seen , mini ) ;
      if ( res ) return true ;
    }
  }
  /* Check if visited == false */
  BufferedReader inFile = new BufferedReader ( new FileReader ( "A-large.in" ) ) ;
  PrintWriter outFile = new PrintWriter ( new BufferedWriter ( new FileWriter ( "diamond.out" ) ) ) ;
  int T = Integer . parseInt ( inFile . readLine ( ) ) ;
  for ( int n = 1 ;
  n <= T ;
  n ++ ) {
    int N = Integer . parseInt ( inFile . readLine ( ) ) ;
    graph = new boolean [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) graph [ i ] [ 0 ] = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      int l = Integer . parseInt ( inFile . readLine ( ) ) ;
      for ( int j = 1 ;
      j < l ;
      j ++ ) graph [ i ] [ l - j ] = true ;
    }
    boolean res = false ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      res = check ( i , graph , new boolean [ N ] , i + 1 ) ;
      if ( res ) break ;
    }
    if ( res ) {
      System . out . println ( "Case #" + n + ": Yes" ) ;
      outFile . println ( "Case #" + n + ": Yes" ) ;
    }
    else {
      System . out . println ( "Case #" + n + ": No" ) ;
      outFile . println ( "Case #" + n + ": No" ) ;
    }
  }
  return false ;
}
