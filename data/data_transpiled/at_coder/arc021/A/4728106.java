public static void main ( String input ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int n = 4 ;
  final Tuple [ ] [ ] a = new Tuple [ 4 ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    a [ i ] = tuple ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  }
  boolean judge = true ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( i + 1 <= n - 1 ) {
        if ( a [ i ] [ j ] . equals ( a [ i + 1 ] [ j ] ) ) judge = false ;
      }
      if ( j + 1 <= n - 1 ) {
        if ( a [ i ] [ j ] . equals ( a [ i ] [ j + 1 ] ) ) judge = false ;
      }
    }
  }
  if ( judge ) {
    System . out . println ( "GAMEOVER" ) ;
  }
  else {
    System . out . println ( "CONTINUE" ) ;
  }
}
