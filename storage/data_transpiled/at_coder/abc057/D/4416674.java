public static int N ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  List < Integer > V = new LinkedList < Integer > ( ) ;
  Collections . sort ( V , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer n , Integer n ) {
      if ( n <= 1 ) return 1 ;
      return n * fac ( n - 1 ) ;
    }
  }
  ) ;
  /* Compute the sum of the numbers */
  int c = 0 ;
  for ( int a = 0 ;
  a < A ;
  a ++ ) {
    if ( b == 0 ) return 1 ;
    return fac ( a ) / fac ( b ) / fac ( a - b ) ;
  }
  System . out . println ( sum ( V , 0 , A ) ) ;
  return A ;
}
