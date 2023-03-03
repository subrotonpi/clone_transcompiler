public static void fin ( File fin ) throws IOException {
  File fout = new File ( "A-large.in" ) ;
  PrintWriter pw = new PrintWriter ( fout ) ;
  int t = Integer . parseInt ( fin . nextLine ( ) ) ;
  for ( int casecount = 1 ;
  casecount <= t ;
  casecount ++ ) {
    int n = Integer . parseInt ( fin . nextLine ( ) ) ;
    int l = Integer . parseInt ( fin . nextLine ( ) ) ;
    List < List < Integer >> outlet = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i <= l ;
    i ++ ) {
      outlet . add ( Collections . singletonList ( i ) ) ;
    }
    List < Integer > device = new ArrayList < > ( ) ;
    device . add ( Collections . singletonList ( i ) ) ;
    Collections . sort ( device ) ;
    int smallest = 41 ;
    for ( int func = 0 ;
    func <= n ;
    func ++ ) {
      switch = 1 ;
    }
  }
  pw . print ( "Case #" + casecount + ": " ) ;
  if ( smallest == 41 ) {
    pw . println ( "NOT POSSIBLE" ) ;
  }
  else {
    pw . println ( smallest ) ;
  }
}
