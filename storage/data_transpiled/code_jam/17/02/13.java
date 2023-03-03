static final String solve ( String s ) throws IOException {
  final Scanner fdInput = new Scanner ( System . in ) ;
  final PrintWriter fdOutput = new PrintWriter ( System . out ) ;
  int T = Integer . parseInt ( fdInput . nextLine ( ) . trim ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  ++ t ) {
    String line = fdInput . nextLine ( ) . trim ( ) ;
    int lastSafe = 0 ;
    boolean violated = false ;
    for ( int i = 1 ;
    i < s . length ( ) ;
    ++ i ) {
      if ( s . charAt ( i - 1 ) < s . charAt ( i ) ) {
        lastSafe = i ;
      }
      else if ( s . charAt ( i - 1 ) > s . charAt ( i ) ) {
        violated = true ;
        break ;
      }
    }
    if ( violated == false ) {
      return s ;
    }
    int [ ] ret = new int [ s . length ( ) ] ;
    for ( int i = 0 ;
    i < ret . length ;
    ++ i ) {
      ret [ i ] = i < lastSafe ? Integer . parseInt ( s . charAt ( i ) ) : i == lastSafe ? Integer . parseInt ( s . charAt ( i ) ) - 1 : 9 ;
    }
    while ( ret [ 0 ] == 0 ) {
      ret = Arrays . copyOfRange ( ret , 1 , ret . length ) ;
    }
    return new String ( ret ) ;
  }
  private boolean validate ( int num ) {
    String r = Integer . toString ( num ) ;
    return Arrays . binarySearch ( r , r ) >= 0 ;
  }
  private void test ( int s , int r ) {
    System . out . println ( s + " " + r ) ;
    assert ( r <= s ) ;
    assert ( validate ( r ) ) ;
    for ( int x = s ;
    x > 0 ;
    -- x ) {
      if ( validate ( x ) ) {
        System . out . println ( s + " " + r + " " + x ) ;
        assert ( x == r ) ;
        return ;
      }
    }
    assert ( false ) ;
  }
  if ( className . equals ( "java.util.Scanner" ) ) {
    fdInput . close ( ) ;
    fdOutput . close ( ) ;
  }
  else {
    fdInput . close ( ) ;
    fdOutput . close ( ) ;
  }
  return null ;
}
