static final String [ ] readCases ( ) throws IOException {
  final BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  final String line ;
  int T = Integer . parseInt ( bufferedReader . readLine ( ) ) ;
  final List < CaseData > cases = new ArrayList < CaseData > ( ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    CaseData case = new CaseData ( ) ;
    case . setN ( Integer . parseInt ( bufferedReader . readLine ( ) ) ) ;
    case . setNs ( map ( Double . parseDouble ( bufferedReader . readLine ( ) ) ) ) ;
    case . setKs ( map ( Double . parseDouble ( bufferedReader . readLine ( ) ) ) ) ;
    cases . add ( case ) ;
  }
  if ( bufferedReader . ready ( ) ) {
    throw new IOException ( ) ;
  }
  return cases . toArray ( new CaseData [ cases . size ( ) ] ) ;
}
