public static int [ ] getInts ( ) {
  return getInts ( new Scanner ( System . in ) ) ;
  HashMap < Integer , Integer > memo = new HashMap < > ( ) ;
  {
    int res ;
    int n ;
    int i = 0 ;
    for ( String s : new String ( ) . split ( "\\s+" ) ) {
      if ( s . length ( ) > 0 ) s = s . trim ( ) ;
      if ( n == - 1 ) return 1 ;
      if ( ( res = memo . get ( new Integer ( s ) ) ) != null ) return memo . get ( new Integer ( s ) ) ;
      n = 2 * n ;
      boolean bA = A <= m ;
      boolean bB = B <= m ;
      boolean bK = K <= m ;
      if ( bA && bB && bK ) res = res + res ;
      else if ( bA && ! bB && bK ) res = res + res + res ;
      else if ( ! bA && ! bB && bK ) res = res + res + res ;
      else if ( bA && bB && ! bK ) res = res * res ;
      else if ( bA && ! bB && bK ) res = res * res ;
      else if ( ! bA && bB && bK ) res = res * res - res ;
      else throw new IllegalStateException ( "wtf" ) ;
      memo . put ( new Integer ( s ) , res ) ;
      return res ;
    }
  }
  ;
  int cases = input . nextInt ( ) ;
  for ( int testCase = 0 ;
  testCase < cases ;
  testCase ++ ) {
    int A = getInts ( ) ;
    int B = getInts ( ) ;
    int K = getInts ( ) ;
    n = - 1 ;
    while ( A > 2 * ( n + 1 ) || B > 2 * ( n + 1 ) || K > 2 * ( n + 1 ) ) n ++ ;
    System . out . println ( "Case #" + ( testCase + 1 ) + ":" + f ( A , B , K , n ) ) ;
  }
  memo . put ( new Integer ( testCase + 1 ) , memo . get ( new Integer ( testCase + 1 ) ) ) ;
}
