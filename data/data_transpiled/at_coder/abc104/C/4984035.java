static final int INF = 10 * 10 ;
int D = Integer . parseInt ( input . nextLine ( ) ) ;
int G = Integer . parseInt ( input . nextLine ( ) ) ;
List < Integer > [ ] pc = new List [ D ] ;
for ( int i = 0 ;
i < D ;
i ++ ) {
  pc [ i ] = Lists . newArrayList ( ) ;
  pc [ i ] . add ( Lists . newArrayList ( ) ) ;
}
/* solve the i */
if ( i == pc . length ) {
  if ( partial != - 1 && pts < G ) {
    int nokori = Math . ceil ( ( G - pts ) / ( 100 * ( 1 + partial ) ) ) ;
    if ( nokori < pc [ partial ] . get ( 0 ) ) {
      return cnt + nokori ;
    }
  }
  else if ( pts >= G ) {
    return cnt ;
  }
}
