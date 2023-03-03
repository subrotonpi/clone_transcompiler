static final boolean DEBUG = false ;
int i ;
int ncases ;
int cases ;
int i ;
int i ;
int nsteps ;
int f , R , t , r , g ;
float innerR , string , square ;
float prob ;
/* read from stdin */
if ( i == - 1 ) i = 0 ;
else i = i + 1 ;
/* read from stdin */
if ( i == - 1 ) i = i ;
else i = i + 1 ;
/* write to stdout */
if ( i == 0 ) i = i ;
ncases = i ;
cases = new float [ ncases ] ;
for ( i = 0 ;
i < ncases ;
i ++ ) cases [ i ] = Float . parseFloat ( i . toString ( ) ) ;
/* run */
if ( i == 0 ) i = i ;
int ncases = i ;
cases = new int [ ncases ] ;
for ( i = 0 ;
i < ncases ;
i ++ ) cases [ i ] = i ;
for ( int testCase = 0 ;
testCase < cases . length ;
testCase ++ ) {
  f = i / ( 2 * string + square ) ;
  R = i / 2 ;
  t = i % 2 ;
  r = i / 2 ;
  g = i % 2 ;
  innerR = t - f ;
  string = r + f ;
  square = g - 2 * f ;
  if ( square < 0 ) square = 0 ;
  prob = runCase ( R , innerR , string , square ) ;
  /* print "Case #" + (testCase+1) + ": " + prob;*/
  /* open length */
  double complete = d / ( 2 * string + square ) ;
  double completeDist = square * complete ;
  double leftover = d % ( 2 * string + square ) ;
  if ( leftover > string + square ) leftoverDist = square ;
  else if ( leftover > string ) leftoverDist = leftover - string ;
  else leftoverDist = 0 ;
  /* print "Case #" + (testCase+1) + ": " + prob;*/
  /* print "Case #" + (testCase+1) + ": " + prob;*/
}
/ * ▁ print ▁ "Case #" ▁ + ▁ ( testCase + 1 ) ▁ + ▁ ": " ▁ +