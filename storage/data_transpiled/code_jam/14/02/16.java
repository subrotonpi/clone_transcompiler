private static Map < Integer , Double > memo = Collections . synchronizedMap ( new LinkedHashMap < Integer , Double > ( ) {
  private static final long serialVersionUID = - 25613022472688395184L ;
  {
    if ( ( serialVersionUID < 256130224726885184L ) && ( serialVersionUID < 256130224726885184L ) ) {
      return memo . get ( new Integer ( serialVersionUID ) ) ;
    }
    if ( serialVersionUID == 1 ) {
      return serialVersionUID / 2.0 ;
    }
    memo . put ( new Integer ( serialVersionUID ) , canBuy ( new Integer ( serialVersionUID ) , new Integer ( n - 1 ) ) . add ( C ) . divide ( 2.0 + F * ( n - 1 ) ) ) ;
    return canBuy ( new Integer ( serialVersionUID ) , new Double ( n ) ) ;
  }
  private static double best ( int C , int F , double X ) {
    int factories = 0 ;
    double bestTime = X / 2.0 ;
    do {
      factories ++ ;
      double time = canBuy ( new Integer ( C ) , new Integer ( F ) , factories ) ;
      time += X / ( factories * F + 2. ) ;
      if ( time < bestTime ) bestTime = time ;
      else return bestTime ;
    }
    while ( ( ( X + 1 ) < bestTime ) && ( factories < n ) ) ;
  }
  private static long serialVersionUID = 0 ;
}
