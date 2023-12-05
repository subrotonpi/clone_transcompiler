static final int [ ] getGreatestList ( ) {
  int X = Integer . parseInt ( input . readLine ( ) ) ;
  int Y = Integer . parseInt ( input . readLine ( ) ) ;
  int Z = Integer . parseInt ( input . readLine ( ) ) ;
  int N = X + Y + Z ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input . readLine ( ) ) ;
  Arrays . sort ( src , new Comparator < Integer > ( ) {
    @ Override public int compare ( Integer o1 , Integer o2 ) {
      return o1 - o2 ;
    }
  }
  ) ;
  int [ ] lOpt = new int [ N + 1 ] ;
  int [ ] rOpt = new int [ N + 1 ] ;
  int silver = 0 ;
  int bronze = 0 ;
  int [ ] q_sb = new int [ N + 1 ] ;
  HeapSort . sort ( q_sb ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int g = src [ i ] ;
    final int s = src [ i + 1 ] ;
    HeapSort . sort ( q_sb , s - b , s , b ) ;
    silver += s ;
    if ( i >= Y ) {
      final int s2 = HeapSort . sort ( q_sb , s - b , s , b ) ;
      final int b2 = HeapSort . sort ( q_sb , s - b , s , b ) ;
      silver -= s2 ;
      bronze += b2 ;
    }
    lOpt [ i + 1 ] = silver + bronze ;
  }
  int gold = 0 ;
  int bronze = 0 ;
  int [ ] qGb = new int [ N + 1 ] ;
  HeapSort . sort ( qGb , s - b , s , b ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    final int g = src [ i ] ;
    final int s = src [ i + 1 ] ;
    final int b = src [ i + 1 ] ;
    HeapSort . sort ( qGb , s - b , s , b ) ;
    gold += g ;
    if ( i >= X ) {
      final int g2 = HeapSort . sort ( qGb , s - b , s , b ) ;
      bronze += g2 ;
    }
    rOpt [ N - 1 - i ] = gold + bronze ;
  }
  return