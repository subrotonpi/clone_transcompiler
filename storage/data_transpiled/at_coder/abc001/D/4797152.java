@ Sys public static void Sys ( ) throws IOException {
  int N = Integer . parseInt ( stdin . readLine ( ) ) ;
  List < List < Integer >> SE = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    SE . add ( Collections . singletonList ( Integer . parseInt ( stdin . readLine ( ) ) ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    SE . add ( Collections . singletonList ( new Integer ( i ) ) ) ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    SE . add ( Collections . singletonList ( new Integer ( i ) ) ) ;
  }
}
