static final void solve ( int N , int X ) {
  int [ ] total = new int [ N + 1 ] ;
  int [ ] p = new int [ N + 1 ] ;
  total [ 0 ] = 1 ;
  p [ 0 ] = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    total [ i ] = total [ i - 1 ] * 2 + 3 ;
    p [ i ] = p [ i - 1 ] * 2 + 1 ;
  }
  /* rec the idx */
  if ( X <= 0 ) {
    return ;
  }
  if ( X >= total [ 0 ] - idx ) {
    /* p */
    return ;
  }
  else if ( X <= total [ 0 ] / 2 ) {
    /* rec the idx */
    int ret ;
    / * ▁ if ▁ ( X ▁ > = ▁ total [ 0 ] ) ▁ {
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 0 ] ▁ = ▁ total [ 1 ] ▁ * ▁ 2 ▁ + ▁ 3 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 1 ] ▁ = ▁ total [ 1 ] ▁ * ▁ 2 ▁ + ▁ 1 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 2 ] ▁ = ▁ total [ 2 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 3 ] ▁ = ▁ total [ 3 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 4 ] ▁ = ▁ total [ 4 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 5 ] ▁ = ▁ total [ 5 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 6 ] ▁ = ▁ total [ 6 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 7 ] ▁ = ▁ total [ 7 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 8 ] ▁ = ▁ total [ 8 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 9 ] ▁ = ▁ total [ 9 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 10 ] ▁ = ▁ total [ 11 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 11 ] ▁ = ▁ total [ 12 ] ▁ * ▁ 2 ;
      STRNEWLINE ▁ TABSYMBOL TABSYMBOL TABSYMBOL TABSYMBOL ▁ * ▁ total [ 13 ] ▁ = ▁ total [ 14 ] ▁