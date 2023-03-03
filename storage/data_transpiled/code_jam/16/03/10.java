public static final Scanner getScanner ( ) throws FileNotFoundException {
  System . in = new Scanner ( new File ( "data.txt" ) ) ;
  System . out = new PrintWriter ( new File ( "out.txt" ) ) ;
  Scanner input = new Scanner ( System . in ) ;
  /* divide the number of words in the input */
  int i = 2 ;
  while ( i <= 7 ) {
    if ( n % i == 0 ) return i ;
    i ++ ;
  }
  for ( int testCase = 0 ;
  testCase < Integer . parseInt ( input . nextLine ( ) ) ;
  testCase ++ ) {
    System . out . println ( "Case #" + ( testCase + 1 ) + ":" ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) , coin = Integer . parseInt ( input . nextLine ( ) ) ;
    int t = 0 ;
    while ( t < 2 * ( n - 2 ) && coin > 0 ) {
      int k = t ;
      int [ ] stuff = new int [ n - 2 ] ;
      for ( int j = 0 ;
      j < n - 2 ;
      j ++ ) {
        stuff [ j ] = k & 1 ;
        k /= 2 ;
      }
      String i = "1" + Arrays . toString ( stuff ) + "1" ;
      int [ ] nums = new int [ 11 ] ;
      for ( int j = 2 ;
      j < 11 ;
      j ++ ) nums [ j ] = divide ( Integer . parseInt ( i , j ) ) ;
      if ( min ( nums ) > 1 ) {
        System . out . println ( i + " " + Arrays . toString ( nums ) ) ;
        coin -- ;
      }
      t ++ ;
    }
  }
  return null ;
}
