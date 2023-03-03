static final int [ ] getPriceList ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int Ds = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < 10 ;
  i ++ ) {
    Ds . add ( i ) ;
  }
  List < String > NDs = Lists . newArrayList ( ) ;
  for ( String p : NDs ) {
    if ( p . charAt ( 0 ) == '0' ) {
      continue ;
    }
    int price = Integer . parseInt ( StringUtils . trim ( p ) ) ;
    if ( price < N ) {
      continue ;
    }
    minPrice = Math . min ( price , minPrice ) ;
  }
  if ( minPrice == 100000 ) {
    for ( String p : Arrays . asList ( NDs ) ) {
      if ( p . charAt ( 0 ) == '0' ) {
        continue ;
      }
      int price = Integer . parseInt ( StringUtils . trim ( p ) ) ;
      minPrice = Math . min ( price , minPrice ) ;
    }
  }
  System . out . println ( minPrice ) ;
  return NDs . toArray ( ) ;
}
