@ VisibleForTesting static void dorun ( ) {
  final File file = new File ( "src/test/resources/test.txt" ) ;
  final File fout ;
  try {
    Class . forName ( "org.apache.commons.io.FileUtils" ) ;
  }
  catch ( ClassNotFoundException e ) {
    throw new RuntimeException ( e ) ;
  }
  final InputStream fin ;
  final OutputStream fout ;
  if ( file . exists ( ) ) {
    fin = new BufferedInputStream ( new FileInputStream ( file ) ) ;
    fout = new BufferedOutputStream ( new FileOutputStream ( file . getAbsolutePath ( ) + ".out" ) ) ;
  }
  else {
    fin = new BufferedInputStream ( fin ) ;
    fout = new BufferedOutputStream ( fout ) ;
  }
  final Runnable dorun = new Runnable ( ) {
    public void run ( ) {
      int cases = Integer . parseInt ( fin . readLine ( ) ) ;
      for ( int i = 0 ;
      i < cases ;
      i ++ ) {
        reportWorkingOn ( i , cases ) ;
      }
    }
  }
  ;
}
