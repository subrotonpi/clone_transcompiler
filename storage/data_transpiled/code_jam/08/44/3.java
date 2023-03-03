public static void main ( String [ ] args ) {
  final HashMap < ArrayList < Integer > , ArrayList < ArrayList < Integer >>> kk = new HashMap < ArrayList < ArrayList < Integer >> , ArrayList < ArrayList < Integer >>> ( ) ;
  kk . put ( 1 , new ArrayList < ArrayList < Integer >> ( ) ) ;
  kk . put ( 2 , new ArrayList < ArrayList < Integer >> ( ) ) ;
  kk . put ( 3 , new ArrayList < ArrayList < Integer >> ( ) ) ;
  for ( ArrayList < Integer > t : kk . get ( 2 ) ) {
    for ( int u : xrange ( t . size ( ) + 1 ) ) {
      ArrayList < Integer > tt = t . clone ( ) ;
      tt . add ( u , 3 ) ;
      kk . get ( 3 ) . add ( tt ) ;
    }
  }
  kk . put ( 4 , new ArrayList < ArrayList < Integer >> ( ) ) ;
  for ( ArrayList < Integer > t : kk . get ( 3 ) ) {
    for ( int u : xrange ( t . size ( ) + 1 ) ) {
      ArrayList < Integer > tt = t . clone ( ) ;
      tt . add ( u , 4 ) ;
      kk . get ( 4 ) . add ( tt ) ;
    }
  }
  kk . put ( 5 , new ArrayList < ArrayList < Integer >> ( ) ) ;
  for ( ArrayList < Integer > t : kk . get ( 4 ) ) {
    for ( int u : xrange ( t . size ( ) + 1 ) ) {
      ArrayList < Integer > tt = t . clone ( ) ;
      tt . add ( u , 5 ) ;
      kk . get ( 5 ) . add ( tt ) ;
    }
  }
  int tn = input . nextInt ( ) ;
  for ( int loop : xrange ( 1 , tn + 1 ) ) {
    System . out . println ( "Case #" + loop + ":" ) ;
    int k = input . nextInt ( ) ;
    String s = input . nextLine ( ) ;
    int mchc = s . length ( ) ;
    for ( ArrayList < Integer > t : kk . get ( k ) ) {
      String lastch = "_" ;
      for ( int sindex : xrange ( 0 , s . length ( ) , k ) ) {
        String ss = s . substring ( sindex , sindex + k ) ;
        for ( int u : t ) {
          char ch = ss . charAt ( u - 1 ) ;
          if ( lastch . charAt ( lastch . length ( )