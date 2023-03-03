public static final String getSerialNum ( ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  PrintWriter fout = new PrintWriter ( new FileWriter ( "p1.out" ) ) ;
  int T = Integer . parseInt ( fin . readLine ( ) ) ;
  /* conv the string */
  int N = Integer . parseInt ( fin . readLine ( ) , 2 ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    N = Integer . parseInt ( fin . readLine ( ) ) ;
    L = Integer . parseInt ( fin . readLine ( ) ) ;
    int ans = L + 1 ;
    TreeSet < Integer > device = new TreeSet < Integer > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      device . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) ;
    }
    TreeSet < Integer > outlet = new TreeSet < Integer > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      outlet . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) ;
    }
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int bits = device . get ( 0 ) ^ outlet . get ( j ) ;
      /* flip the bit */
      int newOut = new TreeSet < Integer > ( ) . addAll ( device ) . addAll ( outlet ) . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) . add ( Integer . parseInt ( fin . readLine ( ) , 2 ) ) ;
      if ( newOut == device ) {
        ans = Math . min ( ans , Integer . toBinaryString ( bits ) . indexOf ( "1" ) ) ;
      }
    }
    fout . print ( "Case #" + ( i + 1 ) + ": " ) ;
    if ( ans == L + 1 ) {
      fout . println ( "NOT POSSIBLE" ) ;
    }
    else {
      fout . println ( Integer . toString ( ans ) ) ;
    }
  }
  return fout . toString ( ) ;
}
