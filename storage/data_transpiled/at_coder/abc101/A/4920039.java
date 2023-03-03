public static void main ( String [ ] args ) {
  char [ ] chars = new char [ input . length ( ) ] ;
  for ( int i = 0 ;
  i < chars . length ;
  i ++ ) {
    chars [ i ] = input . charAt ( i ) ;
  }
  int n = 0 ;
  for ( char c : chars ) {
    n = c == '+' ? n + 1 : n - 1 ;
  }
  System . out . println ( n ) ;
}
