static public void main ( String [ ] args ) throws IOException {
  String problemLetter = "B" ;
  String filePrefix = problemLetter + "-large" ;
  BufferedReader fin = new BufferedReader ( new FileReader ( filePrefix + ".in" ) ) ;
  PrintWriter fout = new PrintWriter ( new FileWriter ( filePrefix + ".out" ) ) ;
  int caseCount = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
  for ( int i = 0 ;
  i < caseCount ;
  i ++ ) {
    int N = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int M = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
    int [ ] [ ] S = new int [ N ] [ M ] , W = new int [ N ] [ M ] ;
    int i1 = 0 ;
    int t = 0 ;
    int i2 = 0 ;
    int j = 0 ;
    int ret = 0 ;
    if ( ( ( i1 % 2 == 0 && i2 < i1 ) || ( i1 % 2 == 0 && j2 < j1 ) || ( j1 % 2 == 1 && j2 > j1 ) ) ) {
      int i = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
      int j = 0 ;
      while ( ( j = 0 ;
      j < N ) && ( j < MM ) ) {
        int [ ] nums = Integer . parseInt ( fin . readLine ( ) . trim ( ) ) ;
        S [ i ] = new int [ N ] ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          nums [ i ] [ j ] = nums [ 3 * i ] ;
        }
        W [ i ] = new int [ N ] ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          nums [ i ] [ j ] = nums [ 3 * i + 1 ] ;
        }
        T [ i ] = new int [ N ] ;
        for ( int i = 0 ;
        i < N ;
        i ++ ) {
          nums [ i ] [ j ] = nums [ 3 * i + 2 ] ;
        }
        int t = tim ( N , M , S , W , T ) ;
        fout . println ( "Case #" + ( i + 1 ) + ": " + t ) ;
      }
    }
    fin . close ( ) ;
    if ( fout != null ) fout . close ( ) ;
  }
}
