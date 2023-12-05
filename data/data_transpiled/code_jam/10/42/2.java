static int [ ] [ ] [ ] getBst ( int step , int nod , int watched ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int INF = 2 * 50 ;
  int T ;
  int N = input . nextInt ( ) ;
  int M = input . nextInt ( ) ;
  int [ ] [ ] [ ] bst = new int [ N ] [ M ] [ M ] ;
  int [ ] [ ] cst = new int [ N ] [ M ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( step == N ) {
      if ( watched >= N - M [ nod ] ) {
        return 0 ;
      }
      else {
        return INF ;
      }
    }
    if ( bst [ i ] [ nod ] [ watched ] != - 1 ) {
      return bst [ i ] [ nod ] [ watched ] ;
    }
    bst [ i ] [ nod ] [ watched ] = ( getBst ( step + 1 , 2 * nod , watched ) + getBst ( step + 1 , 2 * nod + 1 , watched ) ) ;
    bst [ i ] [ nod ] [ watched ] = Math . min ( bst [ i ] [ nod ] [ watched ] , getBst ( step + 1 , 2 * nod , watched + 1 ) + getBst ( step + 1 , 2 * nod + 1 , watched + 1 ) + cst [ i ] [ nod ] ) ;
  }
  /* main code */
  T = input . nextInt ( ) ;
  for ( int t = 1 ;
  t <= T ;
  t ++ ) {
    N = Integer . parseInt ( input . nextLine ( ) ) ;
    M = map . parseInt ( input . nextLine ( ) ) ;
    cst = new int [ N ] [ M ] ;
    bst = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      cst [ i ] = map . parseInt ( input . nextLine ( ) ) ;
      bst [ i ] = new int [ N ] ;
      for ( int j = 0 ;
      j < cst [ i ] . length ;
      j ++ ) {
        bst [ i ] [ j ] = cst [ i ] [ j ] ;
      }
    }
    getBst ( 0 , 0 , 0 ) ;
    System . out . println ( "Case #" + t + ": " + bst [ 0 ] [ 0 ] [ 0 ] ) ;
  }
  return