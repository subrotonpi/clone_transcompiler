public static int x1 = 0 , y1 = 0 , x2 = 0 , y2 = 0 ;
int n = Integer . parseInt ( input ) ;
List < List > l = new ArrayList < > ( ) ;
for ( int i = 0 ;
i < n ;
i ++ ) {
  l . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
}
/* check A and B */
int [ ] AB = {
  B [ 0 ] - A [ 0 ] , B [ 1 ] - A [ 1 ] }
  ;
  int [ ] AX = {
    X [ 0 ] - A [ 0 ] , X [ 1 ] - A [ 1 ] }
    ;
    int [ ] AY = {
      Y [ 0 ] - A [ 0 ] , Y [ 1 ] - A [ 1 ] }
      ;
      int S0 = ( AB [ 0 ] * AX [ 1 ] - AB [ 1 ] * AX [ 0 ] ) * ( AB [ 0 ] * AY [ 1 ] - AB [ 1 ] * AY [ 0 ] ) ;
      int [ ] XY = {
        Y [ 0 ] - X [ 0 ] , Y [ 1 ] - X [ 1 ] }
        ;
        int [ ] XA = {
          A [ 0 ] - X [ 0 ] , A [ 1 ] - X [ 1 ] }
          ;
          int [ ] XB = {
            B [ 0 ] - X [ 0 ] , B [ 1 ] - X [ 1 ] }
            ;
            int S1 = ( XY [ 0 ] * XA [ 1 ] - XY [ 1 ] * XA [ 0 ] ) * ( XY [ 0 ] * XB [ 1 ] - XY [ 1 ] * XB [ 0 ] ) ;
            return S0 < 0 && S1 < 0 ? 1 : 0 ;
          }
          