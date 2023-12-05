static final Scanner getScanner ( ) throws FileNotFoundException {
  final Scanner fi = new Scanner ( System . in ) ;
  final PrintWriter fo = new PrintWriter ( System . out ) ;
  final int cases = Integer . parseInt ( fi . nextLine ( ) ) ;
  for ( int C = 0 ;
  C < cases ;
  C ++ ) {
    final int plants = Integer . parseInt ( fi . nextLine ( ) ) ;
    final int [ ] [ ] P = new int [ plants ] [ plants ] ;
    for ( int plant = 0 ;
    plant < plants ;
    plant ++ ) {
      P [ plant ] = map ( Integer . parseInt ( fi . nextLine ( ) ) ) ;
    }
    final HashMap < Point , Double > R = new HashMap < Point , Double > ( ) ;
    for ( int a = 0 ;
    a < plants ;
    a ++ ) {
      for ( int b = a ;
      b < plants ;
      b ++ ) {
        R . put ( new Point ( a , b ) , Math . sqrt ( ( P [ a ] [ 0 ] - P [ b ] [ 0 ] ) * ( P [ a ] [ 1 ] - P [ b ] [ 1 ] ) * ( P [ a ] [ 2 ] - P [ b ] [ 2 ] ) + P [ a ] [ 2 ] + P [ b ] [ 2 ] ) , Double . parseDouble ( fi . nextLine ( ) ) ) ;
      }
    }
    if ( ( plants == 1 ) && ( P [ 0 ] [ 2 ] == 0 ) ) fo . println ( "Case: #" + ( C + 1 ) + ": " + P [ 0 ] [ 2 ] ) ;
    if ( ( plants == 2 ) && ( P [ 0 ] [ 2 ] == 0 ) ) fo . println ( "Case: #" + ( C + 1 ) + ": " + Math . max ( P [ 0 ] [ 2 ] , P [ 1 ] [ 2 ] ) ) ;
    if ( ( plants == 3 ) && ( R [ 0 ] [ 1 ] == 0 ) ) {
      final double m = Math . min ( R . get ( new Point ( 0 , 1 ) ) , R . get ( new Point ( 0 , 2 ) ) ) ;
      if ( R . get ( new Point ( 0 , 1 ) ) == m ) fo . println ( "Case #" + ( C + 1 ) + ": " + Math . max ( m / 2.0