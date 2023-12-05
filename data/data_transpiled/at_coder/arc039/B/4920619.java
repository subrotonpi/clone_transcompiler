public static void Combination ( ) {
  int n , k ;
  int otokuEnjiNum ;
  int son_enjiNum ;
  int otokuEnjiNum ;
  int otokuEnjiNum ;
  int son_enjiNum ;
  int otokuEnjiNum ;
  int son_enjiNum ;
  int i ;
  n = Integer . parseInt ( input . nextLine ( ) ) ;
  k = Integer . parseInt ( input . nextLine ( ) ) ;
  MOD = 10 * 9 + 7 ;
  Combination comb = new Combination ( n + k , MOD ) ;
  if ( k / n == 0 ) {
    System . out . println ( comb . combination ( k + n - 1 , k ) ) ;
  }
  else {
    otokuEnjiNum = n - k % n ;
    son_enjiNum = n - otokuEnjiNum ;
    System . out . println ( comb . combination ( n , otokuEnjiNum ) ) ;
  }
}
