static private void process ( int num , BufferedReader fin , BufferedWriter fout ) throws IOException {
  String [ ] data = fin . readLine ( ) . trim ( ) . split ( " " ) ;
  int c = Integer . parseInt ( data [ 0 ] ) ;
  String [ ] combos = data [ 1 ] . substring ( c + 1 ) . split ( " " ) ;
  int d = Integer . parseInt ( data [ c + 1 ] ) . substring ( c + 2 , c + d + 2 ) . split ( " " ) ;
  String [ ] dooms = data [ c + 2 ] . substring ( c + 2 , c + d + 2 ) . split ( " " ) ;
  String [ ] liz = data [ data . length - 1 ] . substring ( c + 1 ) . split ( " " ) ;
  c = new HashMap < String , Integer > ( ) ;
  for ( int x = 0 ;
  x < combos . length ;
  x ++ ) {
    c . put ( combos [ x ] . charAt ( combos [ x ] . charAt ( combos [ x ] . charAt ( combos [ x ] . charAt ( combos [ x ] . charAt ( combos [ x ] . charAt ( combos [ x ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . charAt ( combos [ 0 ] . length ( ) ) ) ) ) ) ) ) ) ) , new String [ ] {
      "QWERASDF" }
      ) ;
    }
    for ( int x = 0 ;
    x < dooms . length ;
    x ++ ) {
      d . put ( dooms [ x ] , new String [ ] {
        "" }
        ) ;
      }
      for ( int x = 0 ;
      x < liz . length ;
      x ++ ) {
        if ( ans . length > 0 && c . containsKey ( x + ans [ ans . length - 1 ] ) ) {
          String y = ans [ ans . length - 1 ] ;
          ans [ x ] = c . get ( x + y ) ;
        }
        else {
          ans [ x ] = liz ;
          for ( int y : d [ x ] ) {
            if ( ans [ y ] . contains ( y ) ) {
              ans = new String