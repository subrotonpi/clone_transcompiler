private static PrintWriter out ( InputStream inf , PrintStream outf ) throws IOException {
  BufferedReader br = new BufferedReader ( new InputStreamReader ( inf ) ) ;
  PrintWriter out = new PrintWriter ( outf ) ;
  int casenum = Integer . parseInt ( br . readLine ( ) ) ;
  for ( int i = 0 ;
  i <= casenum ;
  i ++ ) {
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    String tmp = br . readLine ( ) ;
    int NA = Integer . parseInt ( tmp . substring ( 0 , tmp . indexOf ( ' ' ) ) ) ;
    int NB = Integer . parseInt ( tmp . substring ( tmp . indexOf ( ' ' ) + 1 ) ) ;
    List < Integer > DA = new ArrayList < Integer > ( ) ;
    List < Integer > AA = new ArrayList < Integer > ( ) ;
    List < Integer > DB = new ArrayList < Integer > ( ) ;
    List < Integer > AB = new ArrayList < Integer > ( ) ;
    int a = 0 ;
    int b = 0 ;
    for ( int j = 0 ;
    j <= NA ;
    j ++ ) {
      tmp = br . readLine ( ) ;
      DA . add ( Integer . parseInt ( tmp . substring ( 0 , tmp . indexOf ( ' ' ) ) . substring ( 0 , tmp . indexOf ( ':' ) ) ) * 60 + Integer . parseInt ( tmp . substring ( tmp . indexOf ( ' ' ) + 1 ) ) ) ;
      AA . add ( Integer . parseInt ( tmp . substring ( tmp . indexOf ( ' ' ) + 1 , tmp . indexOf ( ':' ) ) ) * 60 + Integer . parseInt ( tmp . substring ( tmp . indexOf ( ':' ) + 1 ) ) ) ;
    }
    for ( int j = 0 ;
    j <= NB ;
    j ++ ) {
      tmp = br . readLine ( ) ;
      DB . add ( Integer . parseInt ( tmp . substring ( 0 , tmp . indexOf ( ' ' ) ) ) * 60 + Integer . parseInt ( tmp . substring ( 0 , tmp . indexOf ( ':' ) + 1 ) ) ) ;
      AB . add ( Integer . parseInt ( tmp . substring ( tmp . indexOf ( ' ' ) + 1 , tmp . indexOf ( ':' ) + 1 ) ) ) ;
    }
    Collections . sort ( DA ) ;
    Collections . sort ( AA ) ;
    Collections . sort ( DB ) ;
    Collections . sort ( AB ) ;
    for ( int j = 0 ;
    j < DA . size ( ) ;
    j ++ ) {
      if (