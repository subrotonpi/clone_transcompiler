public static int X = Integer . parseInt ( input ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > rArr = new ArrayList < Integer > ( ) ;
  for ( String str : input . nextLine ( ) . split ( " " ) ) rArr . add ( Integer . parseInt ( str ) ) ;
  int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  List < Integer > tArr = new ArrayList < Integer > ( ) , aArr = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    String [ ] buf = input . nextLine ( ) . split ( " " ) ;
    tArr . add ( Integer . parseInt ( buf [ 0 ] ) ) ;
    aArr . add ( Integer . parseInt ( buf [ 1 ] ) ) ;
  }
  List < Pair < Integer , Integer >> posArr = new ArrayList < Pair < Integer , Integer >> ( ) ;
  for ( int i = 0 ;
  i < rArr . size ( ) ;
  i ++ ) {
    String direc = i % 2 == 0 ? "+" : "-" ;
    posArr . add ( new Pair < Integer , Integer > ( r , direc ) ) ;
  }
  for ( int i = 0 ;
  i < tArr . size ( ) ;
  i ++ ) {
    posArr . add ( new Pair < Integer , Integer > ( t , i ) ) ;
  }
  posArr = new ArrayList < Pair < Integer , Integer >> ( posArr ) ;
  int left = 0 , right = X ;
  int [ ] val = {
    0 , 0 , X }
    ;
    String direc = "-" ;
    int prv = 0 ;
    for ( Pair < Integer , Integer > pos : posArr ) {
      int elapsed = pos . first - prv ;
      prv = pos . first ;
      if ( direc . equals ( "+" ) ) {
        val [ 0 ] = Math . min ( X , val [ 0 ] + elapsed ) ;
        val [ 1 ] += elapsed ;
        val [ 2 ] = Math . min ( X , val [ 2 ] + elapsed ) ;
        right = Math . min ( right , X - val [ 1 ] ) ;
      }
      else {
        val [ 0 ] = Math . max ( 0 , val [ 0 ] - elapsed ) ;
        val [ 1 ] -= elapsed ;
        val [ 2 ] = Math . max ( 0 , val [ 2 ] - elapsed ) ;
        left