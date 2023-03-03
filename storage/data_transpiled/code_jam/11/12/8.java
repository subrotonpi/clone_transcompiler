static final Map < Pair < Integer , String > , Integer > cache = new HashMap < Pair < Integer , String > , Integer > ( ) {
  private static final long serialVersionUID = - 5743705268828248827L ;
  {
    if ( ( cache . containsKey ( Pair < Integer , String > ) ) ) {
      return cache . get ( Pair . of ( Pair . of ( Integer , String . valueOf ( w ) ) ) ) ;
    }
    int [ ] p = new int [ M ] ;
    for ( int i = 0 ;
    i < p . length ;
    ++ i ) {
      p [ i ] = i ;
    }
    for ( int j = 0 ;
    j < p . length ;
    ++ j ) {
      p [ j ] = i ;
    }
    for ( int i = 0 ;
    i < p . length ;
    ++ i ) {
      if ( p [ j ] == let ) {
        p [ j ] = i ;
      }
    }
    cache . put ( Pair . of ( Integer , String . valueOf ( i ) ) , Pair . of ( p [ 0 ] , let ) ) ;
    return cache . get ( Pair . of ( Integer . valueOf ( i ) , let ) ) ;
  }
  private static long maxCost ( Pair < Integer , String > d , String [ ] letters ) {
    List < Integer > solutions = new ArrayList < > ( ) ;
    List < Pair < Integer , String >> newD = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < d . length ;
    ++ i ) {
      newD . add ( new Pair < > ( - i , d . get ( i ) ) ) ;
    }
    Map < Integer , List < String >> lengths = new HashMap < > ( ) ;
    for ( Pair < Integer , String > w : newD ) {
      int l = w . second . length ( ) ;
      if ( ! lengths . containsKey ( l ) ) {
        lengths . put ( l , new ArrayList < > ( ) ) ;
      }
      lengths . get ( l ) . add ( w ) ;
    }
    for ( List < String > list : lengths . values ( ) ) {
      solutions . add ( maxCost ( list , letters ) ) ;
    }
    return Math . max ( solutions . size ( ) , 1 ) ;
  }
  private int maxCost ( Pair < Integer , String > d , String [ ] letters ) {
    if ( d . size ( ) == 1 ) {
      return 0 ;
    }
    List < Pair < Integer , String >> doNotHave = new ArrayList < > (