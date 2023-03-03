@ VisibleForTesting static int W = Integer . parseInt ( input ) {
  if ( W > H ) {
    W = H ;
    H = W ;
  }
  int mod = ( int ) ( 1e9 + 7 ) ;
  return Math . pow ( Math . pow ( W , mod ) , mod ) ;
  /* prodMod = Math.pow(2, mod) */
}
