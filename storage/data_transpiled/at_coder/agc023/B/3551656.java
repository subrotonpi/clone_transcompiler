public static void fill ( String s ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String s = new String ( Arrays . copyOfRange ( s . chars ( ) , 0 , N ) ) ;
  int result = 0 ;
  for ( int d = 0 ;
  d < N ;
  d ++ ) {
    result += Arrays . equals ( s . substring ( y * N + y + 1 , y * N + N ) , s . substring ( ( y + 1 ) * N + y , 0 , N ) ) ;
    s = s . substring ( s . length ( ) - N ) + s . substring ( 0 , s . length ( ) - N ) ;
  }
  System . out . println ( result * N ) ;
}
