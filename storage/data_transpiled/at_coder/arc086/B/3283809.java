public static List < Integer > solve ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  List < Integer > ans = new ArrayList < > ( ) ;
  if ( max ( a ) > 0 > min ( a ) ) {
    int max_i = a [ max ( a ) ] ;
    int min_i = a [ min ( a ) ] ;
    if ( Math . abs ( a [ max_i ] ) > Math . abs ( a [ min_i ] ) ) {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( i == max_i ) continue ;
        a [ i ] += a [ max_i ] ;
        ans . add ( new Integer ( max_i + 1 ) ) ;
      }
    }
    else {
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( i == min_i ) continue ;
        a [ i ] += a [ min_i ] ;
        ans . add ( new Integer ( min_i + 1 ) ) ;
      }
    }
  }
  if ( min ( a ) >= 0 ) {
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      ans . add ( new Integer ( i ) ) ;
    }
  }
  else {
    for ( int i = N - 1 ;
    i > 0 ;
    i -- ) {
      ans . add ( new Integer ( i + 1 ) ) ;
    }
  }
  System . out . println ( ans . size ( ) ) ;
  for ( Integer l : ans ) {
    System . out . println ( ( Integer ) l ) ;
  }
  return ans ;
}
