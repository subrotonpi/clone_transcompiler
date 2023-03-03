static private List < int [ ] > myin ( ) {
  final List < int [ ] > result = new ArrayList < > ( ) ;
  for ( String s : System . in ) {
    for ( String t : s . split ( " " ) ) {
      result . add ( t ) ;
    }
  }
  final MyIn in = new MyIn ( ) ;
  final int X = ( Integer ) in . readInput ( ) ;
  final int Y = ( Integer ) in . readInput ( ) ;
  X = ( Integer ) X ;
  Y = ( Integer ) Y ;
  final boolean check = Y * ( v - 1 ) > 2 * X ;
  int l = 0 , r = ( int ) 2e18 + 10 ;
  while ( r - l > 1 ) {
    final int m = l + ( r - l ) / 2 ;
    if ( check ) {
      r = m ;
    }
    else {
      l = m ;
    }
  }
  r = r ;
  final int [ ] possibles = {
    r - 2 , r - 1 }
    ;
    /* If the input is not valid or not the output is valid or not the output is valid */
    if ( ( n * X ) % Y != 0 ) {
      return result ;
    }
    final int M = n * ( n + 1 ) / 2 - ( n * X ) / Y ;
    if ( M < 1 || M > n ) {
      return result ;
    }
    final List < int [ ] > ans = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < possibles . length ;
    i ++ ) {
      M = result . get ( possibles [ i ] ) ;
      if ( M != 0 ) {
        ans . add ( new int [ ] {
          i , M }
          ) ;
        }
      }
      if ( ans . size ( ) > 0 ) {
        for ( int i = 0 ;
        i < ans . size ( ) ;
        i ++ ) {
          final int [ ] ans = ans . get ( i ) ;
          System . out . println ( ans [ i ] + " " + ans [ i ] ) ;
        }
      }
      else {
        System . out . println ( "Impossible" ) ;
      }
      return result ;
    }
    