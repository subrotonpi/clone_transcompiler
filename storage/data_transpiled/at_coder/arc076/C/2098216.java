public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int N = input . nextInt ( ) ;
  if ( ( 0 < input . nextInt ( ) < R ) && ( 0 < input . nextInt ( ) < C ) ) return - 1 ;
  if ( N == 0 ) return input . nextInt ( ) ;
  if ( input . nextInt ( ) == R ) return R + input . nextInt ( ) ;
  if ( input . nextInt ( ) == C ) return R + C + ( R - input . nextInt ( ) ) ;
  List < Integer > outer = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y1 = Integer . parseInt ( input . nextLine ( ) ) ;
    int x2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int y2 = Integer . parseInt ( input . nextLine ( ) ) ;
    int p1 = outer . get ( x1 ) ;
    int p2 = outer . get ( x2 ) ;
    if ( p1 < p2 || p2 < p2 ) continue ;
    outer . add ( p1 ) ;
  }
  outer . add ( p2 ) ;
  return R + C + C ;
}
