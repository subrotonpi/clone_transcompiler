public static int dcn ( int t , int v ) throws IOException {
  int rtv ;
  if ( dn . containsKey ( new Integer ( t ) ) ) return dn . get ( new Integer ( v ) ) ;
  rtv = 0 ;
  if ( v > t ) rtv = 0 ;
  else if ( v == t ) rtv = 1 ;
  else if ( v == 0 ) rtv = 1 ;
  else if ( v == 1 ) rtv = t ;
  else rtv = dcn ( t - 1 , v - 1 ) + dcn ( t - 1 , v ) ;
  dn . put ( new Integer ( t ) , rtv ) ;
  return rtv ;
}
dn . clear ( ) ;
fn = new HashMap < Integer , Integer > ( ) ;
if ( Class . forName ( "org.apache.commons.codec.binary.binary.BinaryEncoder" ) . equals ( "org.apache.commons.codec.binary.binary.BinaryEncoder" ) ) {
  BufferedReader inFile = new BufferedReader ( new FileReader ( "C-large.in" ) ) ;
  PrintWriter outFile = new PrintWriter ( new FileWriter ( "practice.out" ) ) ;
  fn . put ( new Integer ( 2 ) , 1 ) ;
  for ( int j = 3 ;
  j < 501 ;
  j ++ ) {
    System . out . println ( j ) ;
    fn . put ( new Integer ( j ) , 1 ) ;
    fn . put ( new Integer ( j ) , 1 ) ;
    fn . put ( new Integer ( j ) , 1 ) ;
    for ( int k = 2 ;
    k < j - 1 ;
    k ++ ) {
      fn . put ( new Integer ( j ) , 0 ) ;
      for ( int u = 1 ;
      u < k ;
      u ++ ) fn . put ( new Integer ( j ) , ( dcn ( j - k - 1 , u - 1 ) * fn . get ( new Integer ( k ) ) ) % 100003 ) ;
    }
  }
  int caseNum = Integer . parseInt ( inFile . readLine ( ) ) ;
  for ( int i = xrange ( 1 , caseNum + 1 ) ;
  i < caseNum ;
  i ++ ) {
    int n = Integer . parseInt ( inFile . readLine ( ) ) ;
    int rtv = 0 ;
    for ( int j = 1 ;
    j < n ;
    j ++ ) rtv += fn . get ( new Integer ( n ) ) % 100003 ;
    outFile . println ( "Case #" + i + ": " +