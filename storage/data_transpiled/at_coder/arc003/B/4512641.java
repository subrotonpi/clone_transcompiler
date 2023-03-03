public static void print ( int N ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  String [ ] sss = new String [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sss [ i ] = input . nextLine ( ) . substring ( 0 , N ) ;
  }
  Arrays . sort ( sss ) ;
  for ( String ss : sss ) {
    System . out . println ( ss . substring ( 0 , ss . length ( ) - 1 ) ) ;
  }
}
