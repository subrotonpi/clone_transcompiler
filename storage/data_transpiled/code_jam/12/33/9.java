public static double search ( int [ ] boxes , int [ ] toys , int ta , int tb , Map < Integer , Double > visited ) {
  if ( ta == 0 || tb == 0 ) {
    return 0 ;
  }
  else if ( ta < 0 || tb < 0 ) {
    return Double . NEGATIVE_INFINITY ;
  }
  if ( ! visited . containsKey ( ( ta = 0 ) ? ( ta > 0 ) : ( tb > 0 ) ) ) {
    int sa = 0 ;
    for ( int pa = 0 ;
    pa < boxes . length ;
    pa += 2 ) {
      sa += boxes [ pa ] ;
      if ( sa >= ta ) {
        sa -= boxes [ pa ] ;
        break ;
      }
    }
    int sb = 0 ;
    for ( int pb = 0 ;
    pb < toys . length ;
    pb += 2 ) {
      sb += toys [ pb ] ;
      if ( sb >= tb ) {
        sb -= toys [ pb ] ;
        break ;
      }
    }
    int na = ta - sa , nb = tb - sb ;
    if ( boxes [ pa + 1 ] == toys [ pb + 1 ] ) {
      if ( na <= nb ) {
        visited . put ( ( ta = 0 ) ? ( tb = 0 ) : ( na + search ( boxes , toys , ta - na , tb - na , visited ) ) ) ;
      }
      else {
        visited . put ( ( ta = 0 ) ? ( tb = 0 ) : ( nb + search ( boxes , toys , ta - nb , tb - nb , visited ) ) ) ;
      }
    }
    else {
      visited . put ( ( ta = 0 ) ? ( tb = 0 ) : ( ( ta = 0 ) ? ( tb = 0 ) : ( sb + search ( boxes , toys , sa , tb , visited ) ) ) ) ;
    }
    return visited . get ( ( ta = 0 ) ? ( ta + sb ) : ( tb + sb ) ) ;
  }
  int t = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= t ;
  testCase ++ ) {
    int n = Integer . parseInt ( input . nextLine ( ) ) ;
    int m = Integer . parseInt ( input . nextLine ( ) ) ;
    int [ ] ints = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      ints [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    }
    int [ ] a1 = new int [ n ] ;
    for ( int i = 0 ;
    i < m