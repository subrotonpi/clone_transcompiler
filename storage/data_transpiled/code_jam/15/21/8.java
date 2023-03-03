public static int f ( int n ) {
  if ( n == 1 ) return 1 ;
  if ( String . valueOf ( n ) . charAt ( s . length ( ) - 1 ) == '0' ) return 1 + f ( n - 1 ) ;
  String s = String . valueOf ( n ) ;
  int k = Integer . parseInt ( "1" + ( s . length ( ) - 1 ) * "0" ) ;
  int a = - k ;
  int b = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    a += Integer . parseInt ( s . substring ( ~ i ) ) * 10 * i ;
    b += Integer . parseInt ( s . substring ( ~ i ) ) * 10 * Math . min ( i , s . length ( ) - i - 1 ) ;
  }
  return Math . min ( a , b ) + f ( k ) ;
  try {
    Scanner in = new Scanner ( new File ( "A-large.in" ) ) ;
    PrintWriter out = new PrintWriter ( new FileOutputStream ( "A.out" ) ) ;
    int ncases = Integer . parseInt ( ( String ) in . nextLine ( ) ) ;
    for ( int testCase = 1 ;
    testCase <= ncases ;
    testCase ++ ) {
      n = Integer . parseInt ( ( String ) in . nextLine ( ) ) ;
      out . println ( "Case #" + testCase + ": " + f ( n ) ) ;
    }
    out . close ( ) ;
  }
  catch ( FileNotFoundException e ) {
    e . printStackTrace ( ) ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  return 0 ;
}
