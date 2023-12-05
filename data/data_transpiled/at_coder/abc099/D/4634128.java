public static int [ ] [ ] readInput ( ) {
  int N = Integer . parseInt ( input . readLine ( ) ) ;
  int C = Integer . parseInt ( input . readLine ( ) ) ;
  List < Integer > [ ] D = new List [ C ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    Integer d = Integer . parseInt ( input . readLine ( ) ) ;
    D [ i ] = d ;
  }
  int [ ] mod0 = new int [ C ] ;
  int [ ] mod1 = new int [ C ] ;
  int [ ] mod2 = new int [ C ] ;
  List < Integer > [ ] Arr = new List [ C ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Integer c = Integer . parseInt ( input . readLine ( ) ) ;
    Arr [ i ] = c ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      switch ( ( i + j ) % 3 ) {
        case 0 : mod0 [ Arr [ i ] [ j ] - 1 ] ++ ;
        break ;
        case 1 : mod1 [ Arr [ i ] [ j ] - 1 ] ++ ;
        break ;
        case 2 : mod2 [ Arr [ i ] [ j ] - 1 ] ++ ;
        break ;
      }
    }
  }
  MOD0 = new int [ C ] ;
  MOD1 = new int [ C ] ;
  MOD2 = new int [ C ] ;
  for ( int i = 0 ;
  i < C ;
  i ++ ) {
    int cnt0 = 0 ;
    int cnt1 = 0 ;
    int cnt2 = 0 ;
    for ( int j = 0 ;
    j < C ;
    j ++ ) {
      cnt0 += mod0 [ j ] * D [ j ] [ i ] ;
      cnt1 += mod1 [ j ] * D [ j ] [ i ] ;
      cnt2 += mod2 [ j ] * D [ j ] [ i ] ;
    }
    MOD0 [ i ] = cnt0 ;
    MOD1 [ i ] = cnt1 ;
    MOD2 [ i ] = cnt2 ;
  }
  int ans = 10 * 15 ;
  for ( int a = 0 ;
  a < MOD0 . length ;
  a ++ ) {
    for ( int b = 0 ;
    b < MOD0 . length ;
    b ++ ) {
      for ( int c = 0 ;
      c < MOD0 . length ;
      c ++ ) {
        if ( a == b || b == c || c ==