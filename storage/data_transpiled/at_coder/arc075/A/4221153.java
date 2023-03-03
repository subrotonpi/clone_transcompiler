static int getInt ( ) {
  return Integer . parseInt ( input . nextLine ( ) ) ;
}
public int [ ] getIntLines ( int n ) {
  return new int [ n ] ;
}
public int [ ] zeros ( int n ) {
  return new int [ n ] ;
}
public int [ ] genBits ( int n ) {
  int [ ] bits = new int [ n ] ;
  for ( int i = 0 ;
  i < 2 * n ;
  i ++ ) {
    for ( int k = 0 ;
    k < n ;
    k ++ ) {
      bits [ k ] = i % 2 ;
      i /= 2 ;
    }
  }
  return bits ;
}
public static void dmp ( int x ) {
  if ( debug ) {
    System . out . println ( x ) ;
  }
}
public static void probC_TLE ( ) {
  int N = getInt ( ) ;
  int [ ] S = getIntLines ( N ) ;
  dmp ( ( N ) , S ) ;
  int maxPoint = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int [ ] bit = genBits ( N ) ;
    int point = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      point += S [ j ] * bit [ j ] ;
    }
    if ( point % 10 == 0 ) {
      point = 0 ;
    }
    maxPoint = Math . max ( point , maxPoint ) ;
    dmp ( ( point ) , maxPoint ) ;
  }
}
public static void probC ( ) {
  int N = getInt ( ) ;
  int [ ] S = getIntLines ( N ) ;
  dmp ( ( N ) , S ) ;
  int [ ] tens = new int [ N ] ;
  int [ ] nonTens = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( S [ i ] % 10 == 0 ) {
      tens [ i ] = S [ i ] ;
    }
    else {
      nonTens [ i ] = S [ i ] ;
    }
  }
  int total = Integer . parseInt ( nonTens [ N ] ) ;
  dmp ( total ) ;
  if ( total > 0 && total % 10 == 0 ) {
    total -= Math . min ( nonTens [ N ] , tens ) ;
  }
  dmp ( total ) ;
  return tens ;
}
