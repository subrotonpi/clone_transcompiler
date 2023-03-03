public static void main ( String [ ] args ) {
  final int n = input . nextInt ( ) , q = input . nextInt ( ) ;
  final String s = input . nextLine ( ) ;
  final int [ ] a = new int [ 2 ] ;
  for ( int i = 2 ;
  i <= Integer . MAX_VALUE ;
  i ++ ) {
    a [ i ] = a [ i - 1 ] + s . substring ( i - 2 , i ) . indexOf ( "AC" ) ;
  }
  for ( String e : args ) {
    final int l = Integer . parseInt ( e ) , r = Integer . parseInt ( e ) ;
    System . out . println ( a [ r ] - a [ l ] ) ;
  }
}
