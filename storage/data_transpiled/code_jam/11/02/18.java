static final Scanner getScanner ( ) throws IOException {
  final String [ ] lines = Files . readAllLines ( Paths . get ( "b2.in" ) ) ;
  final int t = Integer . parseInt ( lines [ 0 ] . trim ( ) ) ;
  for ( int ti = 1 ;
  ti <= t ;
  ti ++ ) {
    final String [ ] items = lines [ ti ] . trim ( ) . split ( "\\s+" ) ;
    final Map < Pair < String , String > , Boolean > combine = new HashMap < > ( ) ;
    final Map < Pair < String , String > , Boolean > opposed = new HashMap < > ( ) ;
    final int n1 = Integer . parseInt ( items [ 0 ] ) ;
    for ( int i = 1 ;
    i <= n1 ;
    i ++ ) {
      combine . put ( new Pair < > ( items [ i ] . first ( ) , items [ i ] . second ( ) ) , items [ i ] . second ( ) ) ;
      combine . put ( new Pair < > ( items [ i ] . second ( ) , items [ i ] . first ( ) ) , items [ i ] . second ( ) ) ;
    }
    final int n2 = Integer . parseInt ( items [ n1 + 1 ] ) ;
    for ( int i = n1 + 2 ;
    i <= n1 + 2 + n2 ;
    i ++ ) {
      opposed . put ( new Pair < > ( items [ i ] . first ( ) , items [ i ] . second ( ) ) , true ) ;
      opposed . put ( new Pair < > ( items [ i ] . second ( ) , items [ i ] . first ( ) ) , true ) ;
    }
    String s = items [ n1 + 3 + n2 ] ;
    final List < String > ans = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      String ch = s . substring ( i , s . length ( ) ) ;
      while ( ( ch = ch . trim ( ) ) != null ) {
        if ( ans . isEmpty ( ) ) {
          ans . add ( ch ) ;
          break ;
        }
        final String last = ans . remove ( ans . size ( ) - 1 ) ;
        if ( ( ( last = combine . get ( last ) ) != null ) && ( ( last = combine . get ( last ) ) != null ) ) {
          ch = combine . get ( last ) ;
          continue ;
        }
        ans . add ( last ) ;
        boolean doClear = false ;
        for (