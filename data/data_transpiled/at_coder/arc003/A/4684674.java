public static void print ( int N ) {
  String r = input . nextLine ( ) ;
  int total = 0 ;
  for ( char c : r . toCharArray ( ) ) {
    int x = "FDCBA" . indexOf ( c ) ;
    total += x ;
  }
  int result = total / N ;
  System . out . println ( result ) ;
}
