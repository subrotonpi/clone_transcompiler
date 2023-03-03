public static void readLines ( String [ ] lines ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "d2.in" ) ) ;
  int num_cases = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
  for ( int case_no = 0 ;
  case_no < num_cases ;
  case_no ++ ) {
    int n = Integer . parseInt ( br . readLine ( ) . trim ( ) ) ;
    String [ ] items = br . readLine ( ) . trim ( ) . split ( "\\s+" ) ;
    int [ ] a = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a [ i ] = Integer . parseInt ( items [ i ] ) - 1 ;
    }
    int ans = 0 ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( ( a [ i ] != i ) && ( ans != i ) ) ans = ans + 1 ;
    }
    System . out . println ( "Case #" + ( case_no + 1 ) + ": " + ans ) ;
  }
}
