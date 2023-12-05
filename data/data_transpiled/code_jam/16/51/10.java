static final String getStdOut ( ) {
  final int MOD = 10 * 9 + 7 ;
  final double INF = Double . POSITIVE_INFINITY ;
  int i ;
  final String s ;
  final int ans ;
  final int t ;
  System . out . println ( "Enter " + t ) ;
  final int mod = MOD * 9 ;
  final double ans ;
  final double ans ;
  System . out . println ( "Enter " + t ) ;
  final int MOD = 10 * 9 + 7 ;
  final double INF = Double . POSITIVE_INFINITY ;
  if ( System . getSecurityManager ( ) != null ) {
    readLine = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ;
  }
  final Consumer < String > pr = new Consumer < String > ( ) {
    @ Override public void accept ( final String s ) {
      System . out . print ( s ) ;
    }
  }
  ;
  final Consumer < String > epr = new Consumer < String > ( ) {
    @ Override public void accept ( final String s ) {
      System . err . print ( s ) ;
    }
  }
  ;
  final Consumer < Integer > die = new Consumer < Integer > ( ) {
    @ Override public void accept ( final Integer s ) {
      pr . accept ( s ) ^ exit ( 0 ) ;
    }
  }
  ;
  final Reader < String > readStr = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ;
  final Reader < String > readStrs = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ;
  final Reader < Integer > readInt = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ;
  final Reader < Integer > readInts = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ;
  final Reader < Double > readFloat = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ;
  final Reader < Double > readDoubles = new BufferedReader ( new InputStreamReader ( System . in ) ) . readLine ( ) ;
  /* Solve brute */
  final int t = readInt . nextInt ( ) ;
  for ( ;
  t < t ;
  t ++ ) {
    s = readStr . next ( ) ;
    ans = 0 ;
    for ( int c = 0 ;
    c < s . length ( ) ;
    c ++ ) {
      if ( st . length ( ) > 0 && st . peek ( ) == c ) {
        st . remove ( st . size ( ) - 1 ) ;
        ans += 10 ;
      }
      else {
        st . add ( c ) ;
      }
    }
    ans