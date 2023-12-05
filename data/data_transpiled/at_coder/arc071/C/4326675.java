public static final void main ( String [ ] args ) {
  final BufferedReader stdin = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( stdin ) ;
  /* li */
  map . put ( "li" , Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li */
  map . put ( "li" , Integer . parseInt ( stdin . readLine ( ) ) ) ;
  /* li */
  map . put ( "li" , Integer . parseInt ( stdin . readLine ( ) ) - 1 ) ;
  /* lf */
  map . put ( "lf" , Float . parseFloat ( stdin . readLine ( ) ) ) ;
  /* ls */
  String [ ] ls = stdin . readLine ( ) . split ( " " ) ;
  /* ns */
  ns = stdin . readLine ( ) . toCharArray ( ) ;
  /* lc */
  lc = list ( ns ) ;
  /* ni */
  ni = Integer . parseInt ( stdin . readLine ( ) ) ;
  /* nf */
  String [ ] s = ns ( ) ;
  String [ ] t = ns ( ) ;
  int q = ni ( ) ;
  int [ ] sa = new int [ q ] ;
  int [ ] sb = new int [ q ] ;
  int [ ] ta = new int [ q ] ;
  int [ ] tb = new int [ q ] ;
  for ( int i = 0 ;
  i < s . length ;
  i ++ ) {
    String si = s [ i ] ;
    if ( si . equals ( "A" ) ) {
      sa [ i ] = sa [ i - 1 ] + 1 ;
      sb [ i ] = sb [ i - 1 ] ;
    }
    else {
      sa [ i ] = sa [ i - 1 ] ;
      sb [ i ] = sb [ i - 1 ] + 1 ;
    }
  }
  for ( int i = 0 ;
  i < t . length ;
  i ++ ) {
    String ti = t [ i ] ;
    if ( ti . equals ( "A" ) ) {
      ta [ i ] = ta [ i - 1 ] + 1 ;
      tb [ i ] = tb [ i - 1 ] ;
    }
    else {
      ta [ i ] = ta [ i - 1 ] ;
      tb [ i ] = tb [ i - 1 ] + 1 ;
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int a = li . nextInt ( ) ;
    int b = li . nextInt ( ) ;
    int c = li . nextInt (