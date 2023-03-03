public static void main ( String [ ] args ) {
  final Scanner in = new Scanner ( System . in ) ;
  final int ntests = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( ntests ) ;
  i ++ ) {
    final int N = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    final int [ ] points = new int [ N ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      points [ j ] = Integer . parseInt ( in . nextLine ( ) . trim ( ) ) ;
    }
    int intersections = 0 ;
    for ( int ii = 0 ;
    ii < N ;
    ii ++ ) {
      final int a1 = points [ ii ] ;
      final int b1 = points [ ii ] ;
      for ( int jj = 0 ;
      jj < N ;
      jj ++ ) {
        final int a2 = points [ jj ] ;
        final int b2 = points [ jj ] ;
        if ( ( a1 > a2 && b1 < b2 ) || ( a1 < a2 && b1 > b2 ) ) {
          intersections ++ ;
        }
      }
    }
    System . out . println ( "Case #" + ( i + 1 ) + ": " + Arrays . toString ( intersections ) ) ;
  }
}
