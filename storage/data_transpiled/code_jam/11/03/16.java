public static void readLines ( String [ ] lines ) throws IOException {
  BufferedReader br = new BufferedReader ( new FileReader ( "c2.in" ) ) ;
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
      a [ i ] = Integer . parseInt ( items [ i ] ) ;
    }
    int sum = 0 ;
    int total = 0 ;
    int min = a [ 0 ] ;
    for ( int i = 0 ;
    i < a . length ;
    i ++ ) {
      sum = sum ^ a [ i ] ;
      if ( ( i < min ) && ( i < a [ i ] . length ( ) ) ) min = a [ i ] ;
      total = total + a [ i ] . length ( ) ;
    }
    if ( sum == 0 ) {
      System . out . println ( "Case #" + ( case_no + 1 ) + ": " + ( total - min ) ) ;
    }
    else {
      System . out . println ( "Case #" + ( case_no + 1 ) + ": NO" ) ;
    }
  }
}
