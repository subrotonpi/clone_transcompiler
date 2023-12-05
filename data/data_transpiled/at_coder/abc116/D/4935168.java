public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int [ ] [ ] Sushi = new int [ N ] [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) Sushi [ j ] = Integer . parseInt ( input ) ;
  Arrays . sort ( Sushi , new Comparator < Pair > ( ) {
    @ Override public int compare ( Pair o1 , Pair o2 ) {
      return o1 . second - o2 . second ;
    }
  }
  ) ;
  Map < Integer , Integer > in = new HashMap < Integer , Integer > ( ) ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    int t = Sushi [ i ] ;
    int d = Sushi [ i ] ;
    tasty += d ;
    if ( in . containsKey ( t ) ) {
      dup . put ( t , d ) ;
    }
    neta . add ( t ) ;
    if ( in . containsKey ( t ) ) in . remove ( t ) ;
  }
  int variety = neta . size ( ) ;
  int maxTasty = tasty + variety * variety ;
  for ( Map . Entry < Integer , Integer > s : in . entrySet ( ) ) {
    if ( dup . size ( ) > 0 ) {
      int s1 = dup . remove ( ) ;
      int t1 = s . getKey ( ) ;
      variety ++ ;
      tasty = tasty - t1 + s . getValue ( ) ;
      maxTasty = Math . max ( maxTasty , tasty + variety * variety ) ;
    }
  }
  System . out . println ( maxTasty ) ;
}
