public static int N = Integer . parseInt ( input ) {
  int [ ] A = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int calc1 = 0 ;
  int calc2 = 0 ;
  int [ ] L = A ;
  int su ;
  if ( L [ 0 ] > 0 ) {
    su = L [ 0 ] ;
  }
  else {
    su = 1 ;
    calc1 += 1 + Math . abs ( L [ 0 ] ) ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    su += L [ i ] ;
    if ( i % 2 != 0 ) {
      if ( su >= 0 ) {
        calc1 += 1 + Math . abs ( su ) ;
        su = - 1 ;
      }
    }
    else {
      if ( su <= 0 ) {
        calc1 += 1 + Math . abs ( su ) ;
        su = 1 ;
      }
    }
  }
  L = A ;
  if ( L [ 0 ] < 0 ) {
    su = L [ 0 ] ;
  }
  else {
    su = - 1 ;
    calc2 += 1 + Math . abs ( L [ 0 ] ) ;
  }
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    su += L [ i ] ;
    if ( ! i % 2 != 0 ) {
      if ( su >= 0 ) {
        calc2 += 1 + Math . abs ( su ) ;
        su = - 1 ;
      }
    }
    else {
      if ( su <= 0 ) {
        calc2 += 1 + Math . abs ( su ) ;
        su = 1 ;
      }
    }
  }
  System . out . println ( Math . min ( calc1 , calc2 ) ) ;
  return calc1 ;
}
