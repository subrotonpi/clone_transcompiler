@ VisibleForTesting static void main ( String [ ] args ) {
  Function < Integer , Integer > II = input -> Integer . parseInt ( input . nextLine ( ) ) ;
  Function < Integer , Integer > MI = input -> map ( Integer :: parseInt , Integer :: parseInt ) ;
  {
    int A = MI . apply ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int B = MI . apply ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int C = MI . apply ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int D = MI . apply ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int E = MI . apply ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    int F = MI . apply ( Integer . parseInt ( input . nextLine ( ) ) ) ;
    A *= 100 ;
    B *= 100 ;
    Set < Integer > waterWS = new HashSet < > ( ) ;
    for ( int a = F / A + 1 ;
    a <= A ;
    a ++ ) {
      for ( int b = F / B + 1 ;
      b <= B ;
      b ++ ) {
        int w = a * A + b * B ;
        if ( w <= F ) waterWS . add ( w ) ;
      }
    }
    waterWS . remove ( 0 ) ;
    int sugaredWMax = Math . max ( W / 100 * E , W / 100 ) ;
    Set < Integer > sugaredWs = new HashSet < > ( ) ;
    for ( int c = 0 ;
    c < sugaredWMax / C ;
    c ++ ) {
      for ( int d = 0 ;
      d < sugaredWMax / D ;
      d ++ ) {
        int w = c * C + d * D ;
        if ( w <= sugaredWMax ) sugaredWs . add ( w ) ;
      }
    }
    int anW = A , anS = 0 ;
    int densMax = - 1 ;
    for ( int ww : waterWS ) {
      for ( int sw : sugaredWs ) {
        int dens = Fraction . divide ( sw , ww + sw ) ;
        if ( ww + sw <= F && sw <= ww / 100 * E && dens > densMax ) {
          anW = ww + sw ;
          anS = sw ;
          densMax = dens ;
        }
      }
    }
    System . out . println ( anW + " " + anS ) ;
  }
}
