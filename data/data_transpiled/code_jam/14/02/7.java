static final String [ ] readCases ( ) throws IOException {
  final BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String line ;
  int T = Integer . parseInt ( bufferedReader . readLine ( ) . trim ( ) ) ;
  final List < CaseData > cases = new ArrayList < CaseData > ( T ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    CaseData case = new CaseData ( ) ;
    case . C = line ;
    case . F = line ;
    case . X = map ( Double . parseDouble ( bufferedReader . readLine ( ) . trim ( ) ) ) ;
    cases . add ( case ) ;
  }
  if ( bufferedReader . ready ( ) ) {
    throw new IOException ( ) ;
  }
  return cases . toArray ( new CaseData [ cases . size ( ) ] ) ;
}
