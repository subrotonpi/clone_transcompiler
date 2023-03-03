static final String input = "Case #" + ( caseNr + 1 ) + ": " ;
final int N = Integer . parseInt ( input ) ;
final int K = Integer . parseInt ( input ) ;
final int [ ] S = new int [ N ] ;
int d = 0 ;
int di = 0 ;
while ( true ) {
  int i = Integer . parseInt ( input ) ;
  int [ ] rfloat = new int [ N ] ;
  rfloat [ i ] = input . readFloat ( ) ;
  rstr [ i ] = input . readToString ( ) ;
  rlist ( lfn -> {
    for ( int f = 0 ;
    f < N ;
    f ++ ) {
      rfloat [ f ] = input . readFloat ( ) ;
    }
  }
  ) ;
  rlist ( lfn -> {
    for ( int f = 0 ;
    f < N ;
    f ++ ) {
      rstr [ f ] = input . readToString ( ) ;
    }
  }
  ) ;
}
{
  int fact = n ;
  int p = 1 ;
  for ( int i : xrange ( 1 , n + 1 ) ) {
    p *= i ;
  }
  return p ;
}
void recST ( Object first , OnGenerate onGenerate , OnExecute onExecute ) {
  Stack < Integer > S = new Stack < > ( ) ;
  for ( int f = 0 ;
  f < first ;
  f ++ ) {
    S . push ( new Integer ( 0 ) ) ;
  }
  while ( S . size ( ) > 0 ) {
    final int k = S . pop ( ) ;
    int cont = S . pop ( ) ;
    if ( k == 0 ) {
      S . push ( new Integer ( 1 ) ) ;
      for ( int u : onGenerate . execute ( cont ) ) {
        S . push ( new Integer ( 0 ) ) ;
      }
    }
    else {
      onExecute . execute ( cont ) ;
    }
  }
}
void recQ ( Object first , OnGenerate onGenerate ) {
  Deque < Integer > Q = new ArrayDeque < > ( first ) ;
  while ( Q . size ( ) > 0 ) {
    int cont = Q . popLeft ( ) ;
    for ( int u : onGenerate . execute ( cont ) ) {
      Q . push ( u ) ;
    }
  }
}
if ( className . equals ( "java.util.Random" ) ) {
  int testcases = input . nextInt ( ) ;
  for ( int caseNr = 0 ;
  caseNr < N ;
  caseNr ++ ) {
    int N = rint ( ) ;
    int [ ] S = rint