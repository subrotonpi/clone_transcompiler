public static final Scanner getAns = new Scanner ( System . in ) {
  @ Override public void nextLine ( ) {
    final List < Double > nums = new ArrayList < > ( ) ;
    int tot = 0 ;
    while ( tot < n ) {
      final List < Double > next = new ArrayList < > ( ) ;
      for ( String s : ( nextLine . nextLine ( ) ) . split ( "\\s+" ) ) {
        next . add ( Double . parseDouble ( s ) ) ;
      }
      tot += next . size ( ) ;
      nums . addAll ( next ) ;
    }
  }
  @ Override public void main ( String [ ] args ) {
    int nt = Integer . parseInt ( nextLine . trim ( ) ) ;
    for ( int testIdx = 1 ;
    testIdx <= nt ;
    testIdx ++ ) {
      final double C = getNums ( 3 ) ;
      final double F = getNums ( 4 ) ;
      final double X = getNums ( 5 ) ;
      final int R = Math . max ( ( int ) ( ( X * F - 2 * C + 1e-9 ) / ( C * F ) ) , 0 ) ;
      double total = 0.0 ;
      for ( int idx = 0 ;
      ( idx <= R ) && ( testIdx < n ) ;
      idx ++ ) {
        total += ( C / ( 2.0 + F * idx ) ) ;
      }
      total += ( X / ( 2.0 + F * R ) ) ;
      System . out . printf ( "Case #%d: %.7f%n" , testIdx , total ) ;
    }
  }
}
