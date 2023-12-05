static double INF = 1e16 ;
HashMap < Integer , Double > cache = new HashMap < Integer , Double > ( ) ;
/* First check for negative values */
if ( ( Hd < 0 ) || ( Ad < 0 ) ) cache . put ( Hd , Ad , Hk , Ak ) return INF ;
if ( Hd <= 0 ) return INF ;
if ( Ad >= Hk ) return 1 ;
cache . put ( Hd , Ad , Hk , Ak ) ;
double best = Math . min ( innerSolve ( Hd - Ak , Ad , Hk - Ad , Ak , B , D , orgHd ) , innerSolve ( Hd - Ak , Ad + B , Hk , Ak , B , D , orgHd ) ) ;
if ( Ak > 0 ) best = Math . min ( best , innerSolve ( Hd - Math . max ( 0 , Ak - D ) , Ad , Hk , Math . max ( 0 , Ak - D ) , B , D , orgHd ) ) ;
if ( Hd < orgHd - Ak ) best = Math . min ( best , innerSolve ( orgHd - Ak , Ad , Hk , Ak , B , D , orgHd ) ) ;
cache . put ( Hd , Ad , Hk , Ak ) ;
/* Second check for negative values */
cache . put ( Hd , Ad , Hk , Ak ) ;
double rv ;
rv = innerSolve ( Hd , Ad , Hk , Ak , B , D , Hd ) ;
return rv < INF ? INF : "IMPOSSIBLE" ;
}
