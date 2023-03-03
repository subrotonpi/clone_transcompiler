@ GwtIncompatible ( "java.lang.ref.Reference" ) public static void main ( String [ ] args ) throws IOException {
  final int [ ] IMP = new int [ ] {
    0 , 0 , 0 , 0 , 0 , 0 }
    ;
    int xb , M , A ;
    for ( xb = 1 ;
    xb <= N ;
    xb ++ ) {
      for ( yc = 1 ;
      yc <= M ;
      yc ++ ) {
        for ( xc = 1 ;
        xc <= N ;
        xc ++ ) {
          double t = A + xb * yc ;
          if ( t % xc == 0 && t / xc <= M ) {
            yb = t / xc ;
            return ;
          }
        }
      }
    }
    for ( xb = 1 ;
    xb <= N ;
    xb ++ ) {
      for ( ya = 1 ;
      ya <= M ;
      ya ++ ) {
        for ( xc = 1 ;
        xc <= N ;
        xc ++ ) {
          double t = A - xb * ya ;
          if ( t % xc == 0 && ( t / xc + ya ) <= M && ( t / xc + ya ) >= 0 ) {
            yb = t / xc + ya ;
            return ;
          }
        }
      }
    }
    for ( int i = 0 ;
    i < IMP . length ;
    i ++ ) {
      String prefix = "B-small-attempt4" ;
      BufferedReader input = new BufferedReader ( new FileReader ( prefix + ".in" ) ) ;
      PrintWriter output = new PrintWriter ( new BufferedWriter ( new FileWriter ( prefix + ".out" ) ) ) ;
      String line = input . readLine ( ) ;
      for ( int testCase = 1 ;
      testCase <= 1 ;
      testCase ++ ) {
        final int N = Integer . parseInt ( line ) ;
        final int M = Integer . parseInt ( line ) ;
        final int A = Integer . parseInt ( line ) ;
        int res = handleCase ( N , M , A ) ;
        if ( res == IMP [ i ] ) {
          System . out . println ( "Case #" + testCase + ": IMPOSSIBLE" ) ;
          output . println ( "Case #" + testCase + ": IMPOSSIBLE" ) ;
        }
        else {
          final int xa = res ;
          final int ya = res ;
          final int xb = res ;
          final int yb = res ;
          final int xc = res ;
          final int yc = res ;
          int test = ( xc - xa ) * ( yb - ya ) - ( xb - xa ) * ( yc - ya ) ;
          if ( test != A ) {
            System . out . println ( "