public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  final int n = Integer . parseInt ( input . nextLine ( ) ) ;
  final List < List < Integer >> [ ] Edges = new ArrayList [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    Edges [ i ] = new ArrayList < > ( ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    a -- ;
    b -- ;
    Edges [ a ] . add ( b ) ;
    Edges [ b ] . add ( a ) ;
  }
  while ( Integer . parseInt ( Edges [ i ] . toString ( ) ) == 1 ) {
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      if ( Edges [ i ] . size ( ) == 1 ) {
        int j = Edges [ i ] . get ( 0 ) ;
        Edges [ i ] . remove ( j ) ;
        Edges [ j ] . remove ( i ) ;
        if ( Edges [ j ] . isEmpty ( ) ) {
          System . out . println ( "First" ) ;
          exit ( ) ;
        }
      }
      Edges [ j ] . clear ( ) ;
    }
  }
  System . out . println ( "Second" ) ;
}
