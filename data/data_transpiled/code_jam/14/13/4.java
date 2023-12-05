static final String getStdOut ( ) throws IOException {
  final BufferedReader fin = new BufferedReader ( new FileReader ( sys . argv [ 0 ] ) ) ;
  final BufferedWriter fout = new BufferedWriter ( new FileWriter ( "p3.out" ) ) ;
  final int T = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    final int N = Integer . parseInt ( fin . readLine ( ) ) ;
    final int [ ] perm = ArrayUtil . split ( fin . readLine ( ) . split ( " " ) ) ;
    int good = 0 ;
    int bad = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      if ( perm [ j ] > j + 1 ) {
        bad ++ ;
      }
      else if ( perm [ j ] <= j + 1 ) {
        good ++ ;
      }
    }
    System . out . println ( bad + " " + good ) ;
    if ( bad >= good + 20 ) {
      fout . write ( "Case #" + ( i + 1 ) + ": BAD\n" ) ;
    }
    else {
      fout . write ( "Case #" + ( i + 1 ) + ": GOOD\n" ) ;
    }
  }
  return fout . toString ( ) ;
}
