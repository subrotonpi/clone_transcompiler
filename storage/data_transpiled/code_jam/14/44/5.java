public static int [ ] [ ] cmb = new int [ 100 + 1 ] [ ] ;
for ( int i = 1 ;
i <= 100 ;
i ++ ) cmb [ i ] = new int [ i ] [ i ] ;
cmb [ 0 ] [ 0 ] = 1 ;
for ( int j = 1 ;
j <= i ;
j ++ ) cmb [ i ] [ j ] = cmb [ i - 1 ] [ j - 1 ] + cmb [ i - 1 ] [ j ] + 1 ;
int cases = Integer . parseInt ( scanner . nextLine ( ) ) ;
/* comb */
int [ ] [ ] comb = new int [ cases ] [ cases ] ;
int n = cmb [ n ] [ k ] ;
/* calc */
int [ ] [ ] res = new int [ cases ] [ cases ] ;
int idx = 0 ;
String now = scanner . nextLine ( ) ;
res [ idx ] = new int [ cases ] ;
if ( scanner . nextLine ( ) . equals ( now ) ) {
  res [ idx ] = new int [ ] {
    1 , 0 , 1 }
    ;
    idx ++ ;
    while ( idx < res . length && res [ idx ] . startsWith ( now ) ) {
      idx = calc [ idx ] [ idx ] = res [ idx ] . substring ( 0 , now . length ( ) + 1 ) ;
      res [ idx ] = tr ;
    }
    int [ ] listgroup = new int [ cases ] ;
    for ( int i = 0 ;
    i < cases ;
    i ++ ) listgroup [ i ] = res [ idx ] [ i ] ;
    int maxgroup = Math . max ( listgroup , m ) ;
    int sumgroup = Math . min ( Math . max ( listgroup , m ) , m ) ;
    int [ ] listcount = new int [ cases ] ;
    for ( int i = 0 ;
    i < cases ;
    i ++ ) listcount [ i ] = res [ idx ] [ i ] ;
    int sumcount = Math . min ( listcount , m ) ;
    int sumcases = 0 ;
    long fc = 1 ;
    for ( int i = sumgroup ;
    i >= maxgroup ;
    i -- ) {
      long tc = comb [ sumgroup ] [ i ] ;
      for ( int j = 0 ;
      j < cases ;
      j ++ ) {
        tc = ( tc * comb [ i ] [ j ] ) % 1000000007 ;
        tc = ( tc * cases ) % 1000000007 ;
      }
      sumcases += tc * fc