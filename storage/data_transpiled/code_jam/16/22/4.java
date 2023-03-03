@ GwtIncompatible ( "java.util.Scanner" ) private static final Scanner input = new Scanner ( System . in ) {
  private final int n = input . nextInt ( ) ;
  {
    final List < String > Cs = new ArrayList < > ( ) ;
    for ( int c = 0 ;
    c < 10 * n ;
    ++ c ) {
      final String c_s = Integer . toString ( c ) . replaceAll ( " " , "" ) ;
      for ( int i = 0 ;
      i < c_s . length ( ) ;
      ++ i ) {
        final char y = c_s . charAt ( i ) ;
        if ( y == '?' ) {
          continue ;
        }
        if ( x != y ) {
          break ;
        }
      }
    }
    final String v = c + " " + j ;
    final int T = input . nextInt ( ) ;
    final String [ ] J = J . split ( " " ) ;
    final List < String > A = new ArrayList < > ( ) ;
    for ( int t = 1 ;
    t < T ;
    ++ t ) {
      final String c = input . next ( ) ;
      final String J = input . next ( ) ;
      System . out . println ( "Case #{}: {}" , t , go ( C , J ) ) ;
    }
    final int T = input . nextInt ( ) ;
    final String v = v ;
    for ( int j = 0 ;
    j < T ;
    ++ j ) {
      final int c_val = Integer . parseInt ( "" ) ;
      final int j_val = Integer . parseInt ( "" ) ;
      A . add ( new Integer ( Math . abs ( c_val - j_val ) ) ) ;
      final int c_val = Integer . parseInt ( "" ) ;
      final int j_val = Integer . parseInt ( "" ) ;
      for ( int i = 0 ;
      i < n ;
      ++ i ) {
        final String xc = input . next ( ) ;
        final int c_val = xc . charAt ( i ) ;
        final int j_val = xc . charAt ( i ) ;
        if ( J . charAt ( i ) != '?' ) {
          if ( J . charAt ( i ) == '?' ) {
            c = '0' ;
            j = '0' ;
          }
          else {
            c = J ;
            j = xc . charAt ( i ) ;
          }
        }
        for ( int xc = 0 ;
        xc < J ;
        ++ xc ) {
          for ( int xj = 0 ;
          xj < J ;
          ++ xj ) {
            c = xc . charAt ( i ) ;
          }
          