@ collections . collections . Iterable < Pair < String , Integer >> inwords ( String x , List < Pair < String , Integer >> l ) {
  for ( Pair < String , Integer > y : l ) {
    if ( x . equals ( y . getFirst ( ) ) ) return true ;
  }
  String res = "" ;
  String ans = "" , ansmax = - 1 ;
  for ( Pair < String , Integer > w : words ) {
    if ( w . getSecond ( ) > ansmax ) ans = w . getSecond ( ) ;
  }
  res = res + " " + ans ;
  /* Work all words */
  ArrayList < Pair < String , Integer >> list = new ArrayList < Pair < String , Integer >> ( ) ;
  int l = list . get ( 0 ) . getFirst ( ) . length ( ) ;
  String tem0 = "_" ;
  Deque < Pair < String , Integer >> q = new LinkedList < Pair < String , Integer >> ( ) ;
  q . add ( new Pair < String , Integer > ( tem0 , list , 0 ) ) ;
  while ( q . size ( ) > 0 ) {
    String tem = q . removeFirst ( ) . getFirst ( ) ;
    String [ ] ws = list . get ( 0 ) . getSecond ( ) . split ( "_" ) ;
    int gi = 0 ;
    if ( ws . length > 1 ) {
      while ( ! inwords ( list . get ( gi ) , ws ) ) gi = gi + 1 ;
    }
    Map < String , List < Pair < String , Integer >>> map = new HashMap < String , List < Pair < String , Integer >>> ( ) ;
    for ( Pair < String , Integer > w : ws ) {
      String ntem = fillin ( w . getFirst ( ) , tem , list . get ( gi ) ) ;
      if ( ntem . equals ( tem ) ) w . setSecond ( w . getSecond ( ) + 1 ) ;
      if ( ! map . containsKey ( ntem ) ) map . put ( ntem , new ArrayList < Pair < String , Integer >> ( ) ) ;
      map . get ( ntem ) . add ( w ) ;
    }
    Set < Pair < String , Integer >> di = map . entrySet ( ) ;
    for ( Pair < String , Integer > i : di ) q . add ( new Pair < String , Integer > ( i . getFirst ( ) , i . getSecond ( ) ,