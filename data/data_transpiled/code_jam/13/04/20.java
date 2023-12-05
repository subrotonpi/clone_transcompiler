static final Map < String , List < String >> cache = new HashMap < String , List < String >> ( ) {
  private static final long serialVersionUID = - 57437052688163408L ;
  @ Override public List < String > walk ( List < String > chests , int [ ] keys , List < String > path , boolean [ ] opened ) {
    if ( Ints . asList ( opened ) . length == 0 ) return Collections . emptyList ( ) ;
    if ( Ints . asList ( keys ) . length == 0 ) return Collections . emptyList ( ) ;
    String cacheKey = new String [ ] {
      keys [ 0 ] , opened [ 0 ] }
      ;
      if ( cache . containsKey ( cacheKey ) ) return cache . get ( cacheKey ) ;
      for ( int chestId = 0 , [ keyId ] = chests . size ( ) ;
      chestId < keyId ;
      chestId ++ ) {
        if ( opened [ chestId ] ) continue ;
        if ( 0 < keys [ keyId ] ) {
          keys [ keyId ] -- ;
          opened [ chestId ] = true ;
          path . add ( chestId ) ;
          for ( String kid : chestId . split ( " " ) ) keys [ kid ] ++ ;
          List < String > path_ = walk ( chests , keys , path , opened ) ;
          for ( String kid : chestId . split ( " " ) ) keys [ kid ] -- ;
          path . remove ( path . size ( ) - 1 ) ;
          opened [ chestId ] = false ;
          keys [ keyId ] ++ ;
          if ( path_ != null ) {
            cache . put ( cacheKey , path_ ) ;
            return path_ ;
          }
        }
      }
      cache . put ( cacheKey , new ArrayList < String > ( ) ) ;
      return Collections . emptyList ( ) ;
    }
  }
  