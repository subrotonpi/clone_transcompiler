static final String getSummarizer ( ) {
  System . setProperty ( "java.util.logging.config.file" , "" ) ;
  BufferedReader input = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int A = Integer . parseInt ( input . readLine ( ) ) ;
  int B = Integer . parseInt ( input . readLine ( ) ) ;
  int s = A + B ;
  if ( N % s > A || N % s == 0 ) {
    System . out . println ( "Bug" ) ;
  }
  else {
    System . out . println ( "Ant" ) ;
  }
  return "" ;
}
