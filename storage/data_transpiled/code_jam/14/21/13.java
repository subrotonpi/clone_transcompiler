static final Scanner input = new Scanner ( new File ( "date.in" ) ) {
  final PrintWriter output = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  final int T = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    System . out . println ( t ) ;
    final int N = Integer . parseInt ( input . nextLine ( ) ) ;
    final String [ ] S = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      S [ i ] = input . nextLine ( ) . trim ( ) ;
    }
    final String [ ] [ ] F = new String [ N ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      final String [ ] C = new String [ N ] ;
      final int L = S [ i ] . length ;
      int cnt = 0 ;
      for ( int j = 0 ;
      j < L ;
      j ++ ) {
        if ( j > 0 && S [ i ] [ j ] . equals ( S [ i ] [ j - 1 ] ) ) {
          C [ i ] = new String ( S [ i ] [ j - 1 ] ) ;
          cnt = 1 ;
        }
        else cnt = cnt + 1 ;
      }
      C [ i ] = new String ( S [ i ] [ L - 1 ] ) ;
      F [ i ] = C ;
    }
    output . print ( "Case #" + ( t + 1 ) + ": " ) ;
    boolean ok = true ;
    for ( int i = 1 ;
    i < N ;
    i ++ ) {
      if ( F [ i ] . length != F [ i - 1 ] . length ) {
        ok = false ;
        break ;
      }
    }
    if ( ! ok ) {
      output . print ( "Fegla Won" ) ;
      continue ;
    }
    final int M = F [ 0 ] . length ;
    int ans = 0 ;
    boolean same = true ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      for ( int i = 1 ;
      i < N ;
      i ++ ) {
        if ( F [ i ] [ j ] . charAt ( 0 ) != F [ i - 1 ] [ j ] . charAt ( 0 ) ) {
          same = false ;
          break ;
        }
      }
      if ( ! same ) break ;
    }
    final String [ ] f = new String [ N ] ;
    for ( int i = 0 ;
    i < N ;
    