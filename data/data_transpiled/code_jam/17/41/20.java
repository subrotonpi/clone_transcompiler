@ Function public static int task ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] groups = Ints . split ( input . nextLine ( ) ) ;
  int [ ] mods = new int [ p ] ;
  for ( int group : groups ) {
    mods [ group % p ] ++ ;
  }
  if ( p == 2 ) {
    return mods [ 0 ] + ( mods [ 1 ] + 1 ) / 2 ;
  }
  if ( p == 3 ) {
    int m = Math . min ( mods [ 1 ] , mods [ 2 ] ) ;
    mods [ 1 ] -= m ;
    mods [ 2 ] -= m ;
    return mods [ 0 ] + m + ( mods [ 1 ] + 2 ) / 3 + ( mods [ 2 ] + 2 ) / 3 ;
  }
  if ( p == 4 ) {
    int result = mods [ 0 ] ;
    mods [ 0 ] = 0 ;
    int m = Math . min ( mods [ 1 ] , mods [ 3 ] ) ;
    mods [ 1 ] -= m ;
    mods [ 3 ] -= m ;
    result += m ;
    int [ ] mods1 = new int [ 4 ] ;
    int result1 = result + ( mods1 [ 2 ] / 2 ) ;
    mods1 [ 2 ] %= 2 ;
    int k = Math . min ( ( mods1 [ 3 ] + mods1 [ 1 ] ) / 2 , mods1 [ 2 ] ) ;
    result1 += k ;
    mods1 [ 3 ] = Math . max ( 0 , mods1 [ 3 ] - k * 2 ) ;
    mods1 [ 1 ] = Math . max ( 0 , mods1 [ 1 ] - k * 2 ) ;
    mods1 [ 2 ] -= k ;
    result1 += ( mods1 [ 3 ] + mods1 [ 1 ] ) / 4 ;
    mods1 [ 3 ] %= 4 ;
    mods1 [ 1 ] %= 4 ;
    if ( sum ( mods1 ) > 0 ) {
      result1 ++ ;
    }
    int [ ] mods2 = new int [ 4 ] ;
    int result2 = result ;
    int k = Math . min ( ( mods2 [ 3 ] + mods2 [ 1 ] ) / 2 , mods2 [ 2 ] ) ;
    result2 += k ;
    mods2 [ 3 ] = Math . max ( 0 , mods2 [ 3 ] - k * 2 ) ;
    mods2 [ 1 ] = Math . max ( 0 , mods2 [ 1 ] - k * 2 ) ;
    mods2 [ 2 ] -= k