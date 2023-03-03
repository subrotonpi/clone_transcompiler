static private void process ( int num , Scanner fin , PrintWriter fout ) throws IOException {
  int n = Integer . parseInt ( fin . nextLine ( ) ) ;
  String [ ] str = fin . nextLine ( ) . trim ( ) . split ( " " ) ;
  int [ ] c = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) c [ i ] = Integer . parseInt ( str [ i ] ) ;
  for ( int i : xrange ( 20 ) ) {
    int s = Integer . parseInt ( c [ i ] ) ;
    if ( s % 2 != 0 ) {
      fout . println ( "NO" ) ;
      return ;
    }
  }
  fout . println ( "" + ( Integer . toString ( c ) - Math . min ( c , n ) ) ) ;
  if ( className . equals ( "java.util.Scanner" ) ) {
    if ( args . length != 3 ) {
      System . err . println ( "Please indicate input and output" ) ;
      exit ( 0 ) ;
    }
    fin = new Scanner ( args [ 0 ] ) ;
    fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( args [ 1 ] ) ) ) ;
    int times = Integer . parseInt ( fin . nextLine ( ) ) ;
    for ( int i : xrange ( times ) ) {
      fout . print ( "Case #" + ( i + 1 ) + ": " ) ;
      process ( i , fin , fout ) ;
      fout . println ( ) ;
    }
    fin . close ( ) ;
    fout . close ( ) ;
  }
}
