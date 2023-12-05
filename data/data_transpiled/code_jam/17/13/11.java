public static int oo = 10 * 10 ;
int ans = oo ;
int turn = 0 ;
do {
  ans = Math . min ( ans , turn + solveNoD ( Hd0 , Hd , Ad , Hk , Ak , B ) ) ;
  if ( Ak == 0 || D == 0 ) break ;
  turn ++ ;
  if ( Hd - Math . max ( Ak - D , 0 ) <= 0 ) {
    if ( Hd == Hd0 - Ak ) break ;
    Hd = Hd0 - Ak ;
  }
  else {
    Ak = Math . max ( Ak - D , 0 ) ;
    Hd = Hd - Math . max ( Ak - D , 0 ) ;
  }
  if ( Hd <= 0 ) break ;
}
while ( true ) ;
/* solve noD */
ans = oo ;
turn = 0 ;
do {
  ans = Math . min ( ans , turn + solveNoBD ( Hd0 , Hd , Ad , Hk , Ak ) ) ;
  if ( Ad >= Hk || B == 0 ) break ;
  turn ++ ;
  if ( Hd - Ak <= 0 ) {
    if ( Hd == Hd0 - Ak ) break ;
    Hd = Hd0 - Ak ;
  }
  else {
    Ad = Ad + B ;
    Hd = Hd - Ak ;
  }
  if ( Hd <= 0 ) break ;
}
/* solve noBD */
ans = oo ;
turn = 0 ;
do {
  ans = Math . min ( ans , turn + solveNoBD ( Hd0 , Hd , Ad , Hk , Ak ) ) ;
  if ( Ad >= Hk || B == 0 ) break ;
  turn ++ ;
  if ( Hd - Ak <= 0 ) {
    if ( Hd == Hd0 - Ak ) break ;
    Hd = Hd0 - Ak ;
  }
  else {
    Ad = Ad + B ;
    Hd = Hd - Ak ;
  }
  if ( Hd <= 0 ) break ;
  /* solve noBD */
  ans = Math . min ( ans , turn + solveNoBD ( Hd0 , Hd , Ad , Hk , Ak , B ) ) ;
  if ( ans == oo ) return oo ;
}
