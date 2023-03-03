public static final void main ( String args [ ] ) throws IOException {
  if ( ( args . length < 2 ) || ( args . length > 3 ) ) {
    System . out . println ( "No file specified" ) ;
    System . exit ( 1 ) ;
  }
  BufferedReader in = new BufferedReader ( new FileReader ( args [ 0 ] ) ) ;
  PrintWriter out = new PrintWriter ( new FileWriter ( args [ 0 ] + ".out" ) ) ;
  int numCases = Integer . parseInt ( in . readLine ( ) ) ;
  int modulus = 100003 ;
  int [ ] factorial = new int [ 501 ] ;
  factorial [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= 501 ;
  i ++ ) {
    factorial [ i ] = i * factorial [ i - 1 ] ;
  }
  /* choose n */
  factorial [ 0 ] = factorial [ n ] / ( factorial [ r ] * factorial [ n - r ] ) ;
  HashMap < String , Integer > cachedResults = new HashMap < String , Integer > ( ) ;
  /* calculate perms */
  String key = "" + num + "-" + length ;
  if ( ! cachedResults . containsKey ( key ) ) {
    int newResult ;
    if ( length == 1 ) {
      newResult = 1 ;
    }
    else {
      newResult = 0 ;
      int minPos = Math . max ( 0 , 2 * length - 1 - num ) ;
      int maxPos = length - 1 ;
      for ( int i = minPos ;
      i <= maxPos ;
      i ++ ) {
        newResult += choose ( num - length - 1 , length - i - 2 ) * calculatePerms ( length , i + 1 ) ;
      }
    }
    cachedResults . put ( key , newResult ) ;
  }
  for ( int testCase = 1 ;
  testCase <= numCases ;
  testCase ++ ) {
    int n = Integer . parseInt ( in . readLine ( ) ) ;
    int result = 0 ;
    for ( int i = 1 ;
    i <= n ;
    i ++ ) {
      result += calculatePerms ( n , i ) % modulus ;
    }
    result %= modulus ;
    out . println ( "Case #" + testCase + ": " + result ) ;
    if ( testCase % 10 == 0 ) {
      System . out . println ( "Completed case " + testCase ) ;
    }
  }
  out . close ( ) ;
  in . close ( ) ;
}
