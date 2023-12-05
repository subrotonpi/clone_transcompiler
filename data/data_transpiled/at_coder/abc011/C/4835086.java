public static final int [ ] [ ] getSolutionList ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int NG1 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int NG2 = Integer . parseInt ( input . nextLine ( ) ) ;
  final int NG3 = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == NG1 || N == NG2 || N == NG3 ) {
    System . out . println ( "NO" ) ;
    System . exit ( 0 ) ;
  }
  final ArrayList < Point > queue = new ArrayList < Point > ( ) ;
  queue . add ( new Point ( 0 , N ) ) ;
  final ArrayList < Point > judge = new ArrayList < Point > ( ) ;
  while ( queue . size ( ) > 0 ) {
    final Point a = queue . remove ( 0 ) ;
    for ( int i = 0 ;
    i < 3 ;
    i ++ ) {
      final int b = a . y - a . y ;
      if ( b != NG1 && b != NG2 && b != NG3 && a . x < 100 ) {
        final Point num = new Point ( a . x + 1 , b ) ;
        if ( b > 0 && num . x < 100 && ! judge . contains ( num ) && ( 100 - num . x ) * 3 >= b ) {
          queue . add ( num ) ;
          judge . add ( num ) ;
        }
        else if ( b == 0 ) {
          System . out . println ( "YES" ) ;
          System . exit ( 0 ) ;
        }
        else {
        }
      }
    }
  }
  System . out . println ( "NO" ) ;
  return null ;
}
