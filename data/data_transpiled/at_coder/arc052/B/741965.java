static private double solve ( ArrayList < Entry > ensui , int a , int b ) {
  final double V = 0 ;
  for ( Entry e : ensui ) {
    if ( e . x < a ) {
      if ( e . x + e . z < a ) {
        continue ;
      }
      else if ( e . x + e . z < b ) {
        V += solveV ( ( e . x + e . z - a ) / e . z * e . y , e . x + e . z - a ) ;
      }
      else {
        V += solveV ( ( e . x + e . z - a ) / e . z * e . y , e . x + e . z - a ) - solveV ( ( e . x + e . z - b ) / e . z * e . y , e . x + e . z - b ) ;
      }
    }
    else if ( e . x < b ) {
      if ( e . x + e . z < b ) {
        V += solveV ( e . y , e . z ) ;
      }
      else {
        V += solveV ( e . y , e . z ) - solveV ( ( e . x + e . z - b ) / e . z * e . y , e . x + e . z - b ) ;
      }
    }
    else {
      continue ;
    }
  }
  final double solveV = 1 / 3 * Math . PI * r * r * h ;
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  final ArrayList < Entry > ensui = new ArrayList < > ( ) ;
  final double [ ] A = new double [ N ] ;
  final double [ ] B = new double [ Q ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int x = Integer . parseInt ( input . nextLine ( ) ) ;
    final int r = Integer . parseInt ( input . nextLine ( ) ) ;
    final int h = Integer . parseInt ( input . nextLine ( ) ) ;
    ensui . add ( new Entry ( x , r , h ) ) ;
  }
  final ArrayList < Object > O = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    final int a = Integer . parseInt ( input . nextLine ( ) ) ;
    final int b = Integer . parseInt ( input . nextLine ( ) ) ;
    O . add ( solve (