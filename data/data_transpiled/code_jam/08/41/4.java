static final boolean isMain ( ) {
  psyco . profile ( ) ;
  DEBUG = false ;
  {
    String [ ] parts = new String [ ] {
    }
    ;
    int [ ] got = new int [ parts . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) {
      got [ i ] = types [ i ] . parse ( parts [ i ] ) ;
    }
    return got [ 0 ] ;
  }
  {
    int [ ] orValue = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < nodes . length ;
    i ++ ) {
      got [ i ] = nodes [ i ] . get ( ) ;
    }
    int [ ] andValue = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) {
      andValue [ i ] = nodes [ i ] . get ( ) ;
    }
    int [ ] intValues = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) {
      intValues [ i ] = nodes [ i ] . get ( ) ;
    }
    int [ ] intValues = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) {
      intValues [ i ] = intValues [ i ] ;
    }
    int [ ] intValues = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) {
      intValues [ i ] = tochange_or ( i ) ;
    }
    int [ ] intValues = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) intValues [ i ] = tochange_or ( i ) ;
    if ( intValues [ i ] == 1 ) return true ;
    else if ( intValues [ i ] >= 1 ) return false ;
    else return intValues [ i ] ;
  }
  {
    int [ ] intValues = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) intValues [ i ] = tochange_or ( i ) ;
    int [ ] intValues = new int [ nodes . length ] ;
    for ( int i = 0 ;
    i < got . length ;
    i ++ ) intValues [ i ] = tochange_or ( i ) ;
    if ( intValues [ i ] == 1 ) return false ;
    else return intValues [ i ] ;
  }
}
