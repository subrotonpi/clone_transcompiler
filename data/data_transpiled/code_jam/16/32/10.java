public static String executorCalcul ( int [ ] entrees ) throws Exception {
  int B = entrees [ 0 ] ;
  int M = entrees [ 1 ] ;
  int Case = entrees [ 2 ] ;
  if ( ( M > 2 * ( B - 2 ) ) && ( M < 2 * ( B - 2 ) ) ) return "IMPOSSIBLE" + "\n" ;
  String result = "POSSIBLE" + "\n" ;
  if ( ( M == 2 * ( B - 2 ) ) && ( M < 2 * ( B - 2 ) ) ) {
    base = "" ;
    for ( int i = 0 ;
    i < B - 1 ;
    i ++ ) base = base + "1" ;
  }
  else {
    base = base2 ( M , B - 2 ) + "0" ;
    System . out . println ( Case + " " + base ) ;
    for ( int k = 1 ;
    k < B ;
    k ++ ) {
      for ( int i = 0 ;
      i < k ;
      i ++ ) result = result + "0" ;
      for ( int i = 0 ;
      i < B - k - 1 ;
      i ++ ) result = result + "1" ;
      result = result + base . charAt ( B - k - 1 ) + "\n" ;
    }
    for ( int i = 0 ;
    i < B ;
    i ++ ) result = result + "0" ;
    result = result + "\n" ;
  }
  /* base 2 */
  String result = "" ;
  int p = n ;
  while ( ( p > 0 ) && ( p < M ) ) {
    if ( ( M % 2 ) == 0 ) result = "0" + result ;
    else result = "1" + result ;
    M = M / 2 ;
    p = p - 1 ;
  }
  /* base 2 */
  boolean multiProcessed = false ;
  if ( ( multiProcessed = true ) && ( result . length ( ) > 0 ) ) {
    synchronized ( pool ) {
      results = pool . execute ( new executorCalcul ( ) , calculs ) ;
    }
  }
  else {
    output = new PrintStream ( "Output.txt" ) ;
  }
  if ( ( multiProcessed = true ) && ( className . equals ( "java.lang.String" ) ) ) {
    Scanner input = new Scanner ( System . in ) ;
    String [ ] lines = input . nextLine ( ) . split ( "\\s+" ) ;
    int T = Integer . parseInt ( lines [ 0 ] ) ;
    int line = 1 ;
    int Case =