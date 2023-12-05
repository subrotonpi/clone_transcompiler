public static int simulate ( int Hd , int Ad , int Hk , int Ak , int B , int D , int x , int y ) {
  int origHd = Hd ;
  int count = 0 ;
  boolean lastCure = false ;
  int countX = 0 ;
  while ( countX < x ) {
    if ( Hd - ( Ak - D ) <= 0 ) {
      if ( lastCure == true ) return "IMPOSSIBLE" ;
      lastCure = true ;
      Hd = origHd ;
    }
    else {
      lastCure = false ;
      Ak = Math . max ( Ak - D , 0 ) ;
      countX ++ ;
    }
    Hd = Hd - Ak ;
    count ++ ;
  }
  int countY = 0 ;
  while ( countY < y ) {
    if ( Hd - Ak <= 0 ) {
      if ( lastCure == true ) return "IMPOSSIBLE" ;
      lastCure = true ;
      Hd = origHd ;
    }
    else {
      lastCure = false ;
      Ad = Ad + B ;
      countY ++ ;
    }
    Hd = Hd - Ak ;
    count ++ ;
  }
  while ( Hk > 0 ) {
    if ( Hk - Ad > 0 && Hd - Ak <= 0 ) {
      if ( lastCure == true ) return "IMPOSSIBLE" ;
      lastCure = true ;
      Hd = origHd ;
    }
    else {
      lastCure = false ;
      Hk = Hk - Ad ;
    }
    Hd = Hd - Ak ;
    count ++ ;
  }
  int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    int x , y ;
    if ( D == 0 ) {
      int maxX = 0 ;
      if ( Ak + D - 1 ) {
        maxX = ( Ak + D - 1 ) / D ;
      }
      if ( B == 0 ) {
        int maxY = 0 ;
        if ( Hk - Ad ) {
          maxY = ( Hk - Ad ) / B + 1 ;
        }
        int best = 10 * 10 ;
        for ( x = 0 ;
        x < maxX + 1 ;
        x ++ ) {
          for ( y = 0 ;
          y < maxY + 1 ;
          y ++ ) {
            int s = simulate ( Hd , Ad , Hk , Ak , B , D , x , y ) ;
            if ( s != 0 ) best = Math . min ( best , s )