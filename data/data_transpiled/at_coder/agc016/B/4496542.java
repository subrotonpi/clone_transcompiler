static final Scanner input = new Scanner ( System . in ) {
  @ Override public void close ( ) throws IOException {
    System . out . println ( "Enter a number of characters in the input stream" ) ;
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    List < Integer > A = new LinkedList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      A . add ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    }
    int a = max ( A ) , b = min ( A ) ;
    if ( a - b > 1 ) {
      System . out . println ( "No" ) ;
    }
    else if ( a == b ) {
      System . out . println ( a <= n / 2 || a == n - 1 ? "Yes" : "No" ) ;
    }
    else {
      int c = A . stream ( ) . mapToInt ( Integer :: parseInt ) . sum ( ) ;
      System . out . println ( 1 <= a - c && a <= ( n - c ) / 2 ? "Yes" : "No" ) ;
    }
  }
}
