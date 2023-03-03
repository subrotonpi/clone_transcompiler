public static void input ( ) {
  T = input . nextInt ( ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    Arrays . stream ( input . split ( " " ) ) . forEach ( x -> {
      int y = Integer . parseInt ( input . nextLine ( ) . trim ( ) ) ;
      String l = x > 0 ? "WE" : "EW" ;
      String u = y > 0 ? "SN" : "NS" ;
      System . out . println ( "Case #" + testCase + ": " + l * Math . abs ( x ) + u * Math . abs ( y ) ) ;
    }
    ) ;
  }
}
