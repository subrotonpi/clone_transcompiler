public static double Infinity = 1e10000 ;
Map < ImmutableIntsPair , Double > bests = new HashMap < ImmutableIntsPair , Double > ( ) {
  private int [ ] qs = new int [ 3 ] ;
  private int base = qs [ qs . length - 1 ] - qs [ 0 ] - 2 ;
  @ Override public Double get ( int [ ] qs ) {
    if ( qs . length == 2 ) {
      return 0 ;
    }
    else if ( qs . length == 3 ) {
      return base ;
    }
    else {
      ImmutableIntsPair key = new ImmutableIntsPair ( qs [ 0 ] , qs [ 1 ] ) ;
      if ( ! bests . containsKey ( key ) ) {
        double b = Infinity ;
        for ( int split = 1 ;
        split < qs . length - 1 ;
        split ++ ) {
          b = Math . min ( b , best ( qs , 0 , split + 1 ) + best ( qs , split , qs . length - 1 ) ) ;
        }
        bests . put ( key , b + base ) ;
      }
      return bests . get ( key ) ;
    }
  }
}
;
int N = Integer . parseInt ( input ( ) ) ;
for ( int testCase = 1 ;
testCase <= N ;
testCase ++ ) {
  String [ ] line = input ( ) . split ( " " ) ;
  int P = Integer . parseInt ( line [ 0 ] ) ;
  int Q = Integer . parseInt ( line [ 1 ] ) ;
  List < Integer > pris = new ArrayList < Integer > ( ) ;
  for ( String w : input ( ) . split ( " " ) ) {
    pris . add ( Integer . parseInt ( w ) ) ;
  }
  int [ ] cells = new int [ N + 1 ] ;
  cells [ 0 ] = pris . toArray ( new int [ 0 ] ) ;
  cells [ 1 ] = P + 1 ;
  double ans = best ( cells ) ;
  System . out . println ( "Case #" + testCase + ": " + ans ) ;
}
