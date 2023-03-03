@ Test ( description = "C-small-attempt3" ) public static int getScore ( String name , int d , int t , int score , HashMap < String , Integer > dic ) throws IOException {
  BufferedReader f_in = new BufferedReader ( new FileReader ( name + ".in" ) ) ;
  PrintWriter f_out = new PrintWriter ( name + ".out" ) ;
  int i ;
  int ca ;
  int add ;
  int sum ;
  int temp ;
  int ret ;
  int T = Integer . parseInt ( f_in . readLine ( ) ) ;
  for ( i = 0 ;
  i < T ;
  i ++ ) {
    sum = 0 ;
    sum = 0 ;
    MYCARDS . add ( Integer . parseInt ( f_in . readLine ( ) ) ) ;
  }
  int M = Integer . parseInt ( f_in . readLine ( ) ) ;
  for ( j = 0 ;
  j < M ;
  j ++ ) {
    MYCARDS . add ( Integer . parseInt ( f_in . readLine ( ) ) ) ;
  }
  cards = new int [ N ] ;
  for ( i = 0 ;
  i < cards . length ;
  i ++ ) {
    cards [ i ] = Integer . parseInt ( f_in . readLine ( ) ) ;
  }
  for ( i = 1 ;
  i < cards . length ;
  i ++ ) {
    if ( ( MYCARDS . get ( i ) ) . get ( 1 ) > m ) {
      j = i ;
      m = MYCARDS . get ( i ) . get ( 1 ) ;
    }
  }
  /* in Better */
  c1 = MYCARDS . get ( i ) ;
  for ( j = 0 ;
  j < myc . length ;
  j ++ ) {
    c2 = MYCARDS . get ( myc [ j ] ) ;
    if ( ( c1 . get ( 0 ) <= c2 . get ( 0 ) && c1 . get ( 1 ) < c2 . get ( 1 ) ) ) return true ;
    if ( ( c1 . get ( 0 ) < c2 . get ( 0 ) && c1 . get ( 1 ) == c2 . get ( 1 ) && i > j ) ) return true ;
  }
  /* in Better */
  if ( ( t <= 0 ) || ( myc . length ( ) == 0 ) ) return score ;
  int temp = myc . length ( ) ;
  sum = 0 ;
  for ( i = 0 ;
  i < myc . length ( ) ;
  i ++ ) {
    sum += myc [ i ] ;
  }
  int j = findTurn ( myc ) ;
  so @ @