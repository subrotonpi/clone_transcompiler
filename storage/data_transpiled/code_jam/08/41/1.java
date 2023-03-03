public static void print ( int IM ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( "a.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "a.out" ) ) ) ;
  int n = Integer . parseInt ( fin . readLine ( ) ) ;
  for ( int i = 0 ;
  i < xrange ( 1 , n + 1 ) ;
  i ++ ) {
    int m = Integer . parseInt ( fin . readLine ( ) ) ;
    int v = Integer . parseInt ( fin . readLine ( ) ) ;
    int [ ] [ ] tree = new int [ m ] [ ] ;
    for ( int j = 0 ;
    j < tree . length ;
    j ++ ) {
      tree [ j ] = Integer . parseInt ( fin . readLine ( ) ) ;
    }
    int [ ] [ ] changes = new int [ ( m - 1 ) / 2 ] [ ] ;
    for ( int j = 0 ;
    j < tree [ ( m - 1 ) / 2 ] . length ;
    j ++ ) {
      if ( tree [ ( m - 1 ) / 2 ] [ j ] > 0 ) {
        changes [ j ] = new int [ ] {
          IM , 0 }
          ;
        }
        else {
          changes [ j ] = new int [ ] {
            0 , IM }
            ;
          }
        }
        for ( int j = xrange ( ( m - 1 ) / 2 - 1 , - 1 , - 1 ) ;
        j < tree . length ;
        j ++ ) {
          int c = tree [ j ] [ 1 ] ;
          int o = tree [ j ] [ 0 ] ;
          int no = ( o + 1 ) % 2 ;
          int [ ] zero = {
            0 , 0 }
            ;
            int [ ] one = {
              0 , 0 }
              ;
              zero [ 1 ] = Math . min ( changes [ j * 2 + 1 ] [ 0 ] + Math . min ( changes [ j * 2 + 2 ] [ 0 ] , changes [ j * 2 + 2 ] [ 1 ] ) , changes [ j * 2 + 2 ] [ 0 ] + Math . min ( changes [ j * 2 + 1 ] [ 1 ] , changes [ j * 2 + 2 ] [ 1 ] ) ) ;
              if ( c > 0 ) {
                changes [ j ] = new int [ ] {
                  Math . min ( zero [ o ] , zero [ no ] + 1 ) , Math . min ( one [ o ] , one [ no ] + 1 ) }
                  ;
                }
                else {
                  changes [ j ] = new int [ ] {
                    zero