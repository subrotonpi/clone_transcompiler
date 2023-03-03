public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] A = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int wildcard = 0 ;
  int [ ] color = new int [ 8 ] ;
  for ( int a = 0 ;
  a < N ;
  a ++ ) {
    if ( A [ a ] < 400 ) {
      color [ 0 ] = 1 ;
    }
    else if ( A [ a ] < 800 ) {
      color [ 1 ] = 1 ;
    }
    else if ( A [ a ] < 1200 ) {
      color [ 2 ] = 1 ;
    }
    else if ( A [ a ] < 1600 ) {
      color [ 3 ] = 1 ;
    }
    else if ( A [ a ] < 2000 ) {
      color [ 4 ] = 1 ;
    }
    else if ( A [ a ] < 2400 ) {
      color [ 5 ] = 1 ;
    }
    else if ( A [ a ] < 2800 ) {
      color [ 6 ] = 1 ;
    }
    else if ( A [ a ] < 3200 ) {
      color [ 7 ] = 1 ;
    }
    else {
      wildcard ++ ;
    }
  }
  int nc = Arrays . stream ( color ) . mapToInt ( Integer :: intValue ) . sum ( ) ;
  System . out . println ( Math . max ( 1 , nc ) + " " + nc + wildcard ) ;
}
