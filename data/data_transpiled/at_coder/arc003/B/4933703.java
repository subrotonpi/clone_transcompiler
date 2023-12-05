public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] ss = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    ss [ i ] = input . nextLine ( ) . replaceAll ( "\\s+" , " " ) ;
  }
  System . out . println ( Arrays . toString ( ss ) ) ;
}
