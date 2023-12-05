@ Sys public static int [ ] [ ] solve ( Scanner in ) {
  HashMap < Integer , Integer > memo = new HashMap < Integer , Integer > ( ) ;
  int [ ] [ ] ret = new int [ ] [ ] {
  }
  ;
  /* best(int lo, int rng, int missed) */
  int [ ] m = new int [ ] [ ] {
  }
  ;
  /* get key */
  int [ ] [ ] P = new int [ ] [ ] {
  }
  ;
  /* get key */
  int nrng = in . nextInt ( ) - 1 ;
  if ( in . nextInt ( ) == 1 ) {
    if ( Math . min ( m [ 2 * lo ] , m [ 2 * lo + 1 ] ) > missed ) {
      ret = 0 ;
    }
    else {
      ret = P [ nrng ] [ lo ] ;
    }
  }
  else {
    ret = P [ nrng ] [ lo ] + best ( 2 * lo , nrng , missed ) + best ( 2 * lo + 1 , nrng , missed ) ;
    int clo = 2 * rng * lo ;
    int chi = clo + 2 * rng ;
    if ( Arrays . binarySearch ( m , chi ) > 0 ) {
      ret = Math . min ( ret , best ( 2 * lo , nrng , missed + 1 ) + best ( 2 * lo + 1 , nrng , missed + 1 ) ) ;
    }
  }
  memo . put ( ( Integer ) ret ) ;
  return ret ;
}
