static final void loadLibrary ( ) throws IOException {
  System . setProperty ( "java.library.path" , "/home/rishig/codejam/" ) ;
  @ SuppressWarnings ( "unchecked" ) Map < String , Long > map = new HashMap < String , Long > ( ) ;
  /* Easing case */
  String s ;
  if ( st . length ( ) > 1 ) {
    s = st ;
  }
  else {
    int f = st . indexOf ( '.' ) ;
    if ( f == - 1 ) return ;
    s = st . substring ( f + 1 ) + st . substring ( 0 , f + 1 ) ;
  }
  if ( map . containsKey ( s ) ) {
    return map . get ( s ) ;
  }
  assert s . length ( ) > 1 ;
  ArrayList < Pair < Integer , String >> arr = new ArrayList < Pair < Integer , String >> ( ) ;
  int count = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( s . charAt ( i ) == '.' ) {
      arr . add ( new Pair < Integer , String > ( count + 1 , s . substring ( 0 , i ) + "X" + s . substring ( i + 1 ) ) ) ;
      count = 0 ;
    }
    else {
      count ++ ;
    }
  }
  double total = n - 1. * Math . pow ( c * ( c - 1 ) / 2 , 2 ) / n ;
  double newtot = total + 1. / n * Math . pow ( c * ecase ( s , n ) , 2 ) ;
  map . put ( s , newtot ) ;
  /* Easing case */
  String S = IOUtils . readAllString ( ) ;
  int n = S . length ( ) ;
  /* Easing case */
  if ( Class . forName ( "java.util.Scanner" ) . getMethod ( "Scanner" , new Class [ ] {
    String . class }
    ) . invoke ( null , new Object [ ] {
      S }
      ) ) {
        int T = readInteger ( in ) ;
        System . err . println ( DateFormat . getDateTimeInstance ( ) . format ( new Date ( ) ) ) ;
        for ( int testCase = 1 ;
        testCase <= T ;
        testCase ++ ) {
          long ans = solvecase ( testCase ) ;
          System . err . println ( "Case #" + testCase + ": " + ans ) ;
          if ( T <= 15 || testCase == 1 || testCase % Math .