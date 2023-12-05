@ VisibleForTesting static void go ( ) throws IOException {
  if ( className == "org.tensorflow.util.Example" ) {
    BufferedReader br = new BufferedReader ( new FileReader ( "B-large.in" ) ) ;
    BufferedWriter fout = new BufferedWriter ( new FileWriter ( "B-large.out" ) ) ;
    int T = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int i = 0 ;
    i < T ;
    i ++ ) {
      int L = Integer . parseInt ( br . readLine ( ) ) ;
      int P = Integer . parseInt ( br . readLine ( ) ) ;
      int C = Integer . parseInt ( br . readLine ( ) ) ;
      int result = ( int ) Math . ceil ( Math . log ( Math . log ( P / L ) + C ) ) ;
      if ( result < 0 ) result = 0 ;
      fout . write ( StringUtils . repeat ( "Case #" , i + 1 ) + ": " + Integer . toString ( result ) + "\n" ) ;
    }
    fout . close ( ) ;
    br . close ( ) ;
  }
}
