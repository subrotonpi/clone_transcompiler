public static int MOD = 10009 ;
int result = 0 ;
for ( String term : P . split ( " " ) ) {
  int value = 1 ;
  for ( int pos : term . split ( " " ) ) {
    int freq = 0 ;
    for ( String w : phrase . split ( " " ) ) {
      freq += W . get ( w ) . get ( pos ) ;
    }
    value = ( value * freq ) % MOD ;
  }
  result += value ;
}
