static private void process ( int num , Scanner fin , PrintWriter fout ) throws IOException {
  String [ ] data = fin . nextLine ( ) . trim ( ) . split ( " " ) ;
  int n = Integer . parseInt ( data [ 0 ] ) ;
  char [ ] robots = {
    'O' , 'B' }
    . clone ( ) ;
    Arrays . fill ( robots , ( char ) ( 2 * i + 1 ) ) ;
    int [ ] poss = {
      1 , 1 }
      . clone ( ) ;
      Arrays . fill ( poss , ( char ) ( 2 * i + 2 ) ) ;
      int [ ] ans = {
        0 , 0 }
        ;
        for ( int i = 2 ;
        i < robots . length ;
        i ++ ) {
          char r = robots [ i ] ;
          int j = i - 1 ;
          while ( robots [ j ] != r ) j -- ;
          ans [ i ] = Math . max ( ans [ j ] + Math . abs ( poss [ i ] - poss [ j ] ) + 1 , ans [ i - 1 ] + 1 ) ;
        }
        fout . println ( ans [ ans . length - 1 ] ) ;
        if ( Class . forName ( "java.util.Scanner" ) . equals ( args [ 0 ] ) ) {
          if ( args . length != 3 ) {
            System . err . println ( "Please indicate input and output" ) ;
            exit ( 0 ) ;
          }
          fin = new Scanner ( args [ 1 ] ) ;
          fout = new PrintWriter ( args [ 2 ] ) ;
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
      