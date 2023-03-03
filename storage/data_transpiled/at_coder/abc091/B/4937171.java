public static void print ( int N ) {
  List < String > BLUE = new ArrayList < String > ( N ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    BLUE . add ( input . next ( ) ) ;
  }
  int M = Integer . parseInt ( input . next ( ) ) ;
  List < String > list = new LinkedList < String > ( ) ;
  list . addAll ( Collections . reverseOrder ( BLUE ) ) ;
  list . addAll ( Collections . reverseOrder ( RED ) ) ;
  int ans = 0 ;
  for ( String s : list ) {
    int p = BLUE . indexOf ( s ) ;
    int m = RED . indexOf ( s ) ;
    ans = Math . max ( ans , p - m ) ;
  }
  System . out . println ( ans ) ;
}
