static final double [ ] [ ] B = new double [ 9 ] [ ] ;
for ( int i = 0 ;
i < 2 ;
i ++ ) B [ i ] = new double [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) C [ i ] = new double [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) C [ i ] [ i ] = new double [ 3 ] ;
double SUM = 0 ;
for ( int i = 0 ;
i < 2 ;
i ++ ) for ( int j = 0 ;
j < 3 ;
j ++ ) {
  SUM += B [ i ] [ j ] ;
  SUM += C [ j ] [ i ] ;
}
DPMAP = Maps . newHashMap ( ) ;
SCOREMAP = Maps . newHashMap ( ) ;
/* sc = new SCOREMAP(); */
double ANS = 0 ;
for ( int i = 0 ;
i < 2 ;
i ++ ) for ( int j = 0 ;
j < 3 ;
j ++ ) if ( M [ i * 3 + j ] == M [ ( i + 1 ) * 3 + j ] ) ANS += B [ i ] [ j ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) for ( int j = 0 ;
j < 2 ;
j ++ ) if ( M [ i * 3 + j ] == M [ i * 3 + j + 1 ] ) ANS += C [ i ] [ j ] ;
/* score = sc(M); */
if ( SCOREMAP . get ( new Object [ ] {
  DPMAP }
  ) != null ) return SCOREMAP . get ( new Object [ ] {
    DPMAP }
    ) ;
    if ( min ( M ) > 0 ) return sc ( M ) ;
    if ( M [ 0 ] == 1 ) {
      ANS = - Double . MAX_VALUE ;
      for ( int i = 0 ;
      i < 9 ;
      i ++ ) if ( M [ i ] == 0 ) {
        double [ ] N = new double [ M . length ] ;
        N [ i ] = 1 ;
        if ( ANS < score ( N , 2 ) ) ANS = score ( N , 2 ) ;
      }
      SCOREMAP . put ( new Object [ ] {
        DPMAP }
        ) ;
        return ANS ;
      }
      if ( M [ 0 ] == 0 ) {
        double ANS = Double . MAX_VALUE ;
        for ( int i = 0 ;
        i < 9 ;
        i ++ )