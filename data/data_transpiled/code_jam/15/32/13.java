static long findLongestPrefix ( String st ) {
  long ret = 0 ;
  for ( int i = 0 ;
  i < st . length ( ) - 1 ;
  i ++ ) {
    if ( ( st . substring ( 0 , ( i + 1 ) ) ) . equals ( st . substring ( ( st . length ( ) - ( i + 1 ) ) ) ) ) {
      ret = Math . max ( ret , i + 1 ) ;
    }
  }
  /* max repeating of st */
  long pe = findLongestPrefix ( st ) ;
  long d = st . length ( ) - pe ;
  /* prob of targ */
  long K = 0 ;
  long L = 0 ;
  long S = 0 ;
  String keyb = "" ;
  String targ = "" ;
  HashMap < String , Integer > vysk = new HashMap < String , Integer > ( ) ;
  /* prob of targ */
  vysk . clear ( ) ;
  for ( int i = 0 ;
  i < keyb . length ( ) ;
  i ++ ) {
    vysk . put ( keyb . charAt ( i ) , 0 ) ;
  }
  for ( int i = 0 ;
  i < targ . length ( ) ;
  i ++ ) {
    vysk . put ( targ . charAt ( i ) , vysk . get ( targ . charAt ( i ) ) + 1 ) ;
  }
  ret = 1 ;
  for ( int i = 0 ;
  i < targ . length ( ) ;
  i ++ ) {
    long x = 0 ;
    if ( ( targ . charAt ( i ) != '' ) && ( targ . charAt ( i ) != '' ) ) {
      x = vysk . get ( targ . charAt ( i ) ) ;
    }
    ret = ret * ( long ) x / ( long ) K ;
  }
  /* solve */
  String [ ] row = scanner . nextLine ( ) . split ( " " ) ;
  K = Integer . parseInt ( row [ 0 ] ) ;
  L = Integer . parseInt ( row [ 1 ] ) ;
  S = Integer . parseInt ( row [ 2 ] ) ;
  keyb = scanner . nextLine ( ) ;
  targ = scanner . nextLine ( ) ;
  vysk . clear ( ) ;
  for ( int i = 0 ;
  i < targ . length ( ) ;
  i ++ ) {
    if ( ( targ . charAt ( i ) != '' ) && ( ! vysk . containsKey ( targ . charAt ( i ) ) ) ) {
      return "0.0" ;
    }
  }
  long worst