static private String rl ( Function < String , String > proc ) throws IOException {
  if ( proc != null ) {
    return proc . apply ( System . in ) ;
  }
  else {
    return System . in . toString ( ) ;
  }
}
