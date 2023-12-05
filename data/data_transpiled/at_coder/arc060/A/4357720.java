static final String input = "Please input the program" ;
final Scanner input = new Scanner ( System . in ) ;
final int n = input . nextInt ( ) ;
final int a = input . nextInt ( ) ;
final List < Integer > xs = Lists . newArrayList ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  xs . add ( Integer . parseInt ( input . nextLine ( ) ) - a ) ;
}
Collections . sort ( xs ) ;
final int l = xs . size ( ) ;
final int r = xs . size ( ) ;
final List < Integer > low = Lists . newArrayList ( ) ;
final int n0 = r - l ;
final List < Integer > high = Lists . newArrayList ( ) ;
return new SummingInt ( ) {
  @ Override public Counter < Integer > sums ( ) {
    Counter < Integer > cntr = new Counter < > ( ) ;
    for ( int v : arr ) {
      final Counter < Integer > tmps = Counters . counter ( cntr ) ;
      for ( int u : tmps ) {
        cntr . increment ( u + v ) ;
      }
    }
    return cntr ;
  }
}
;
}
