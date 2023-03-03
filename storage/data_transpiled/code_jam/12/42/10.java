static void print ( ) {
  final Scanner fin = new Scanner ( System . in ) ;
  final int T = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int N = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int W = Integer . parseInt ( fin . nextLine ( ) ) ;
    final int L = Integer . parseInt ( fin . nextLine ( ) ) ;
    final List < Integer > Rl = new LinkedList < Integer > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final int r = Integer . parseInt ( fin . nextLine ( ) ) ;
      R . add ( new Integer ( r ) ) ;
    }
    Collections . sort ( R , Collections . reverseOrder ( ) ) ;
    int x = W ;
    int rs = 0 ;
    int re = - 1000000 ;
    int y = 0 ;
    final List < Integer > p = new ArrayList < Integer > ( ) ;
    for ( int r = 0 ;
    r < R . size ( ) ;
    r ++ ) {
      final int i = R . get ( i ) ;
      if ( re - y >= r * 2 && L - y >= r ) {
        p . add ( new Integer ( i ) ) ;
        p . add ( new Integer ( x - r ) ) ;
        p . add ( new Integer ( i ) ) ;
        p . add ( new Integer ( i ) ) ;
        p . add ( new Integer ( x - r ) ) ;
        p . add ( new Integer ( pos ) ) ;
        y = pos + r ;
      }
      else if ( L - re >= r ) {
        rs = Math . max ( re , - r ) ;
        re = rs + 2 * r ;
        p . add ( new Integer ( i ) ) ;
        p . add ( new Integer ( 0 ) ) ;
        p . add ( new Integer ( rs + r ) ) ;
        x = r ;
        y = re ;
      }
      else {
        System . err . println ( "IMPOSSIBLE" ) ;
        break ;
      }
    }
    Collections . sort ( p ) ;
    System . err . println ( p ) ;
    String result = "" ;
    for ( int i = 0 ;
    i < p . size ( ) ;
    i ++ ) {
      if ( p . get ( i ) > W || p . get ( i ) > L ) {
        System . err . println ( "ERROR" ) ;
      }
      result += p . get ( i ) + " " + p . get (