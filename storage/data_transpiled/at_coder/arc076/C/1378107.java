static final String readString ( ) {
  final String input = "Enter a string to read from: " ;
  final int r = Integer . parseInt ( input ) ;
  final int c = Integer . parseInt ( input ) ;
  final int n = input . length ( ) ;
  final Pair [ ] a = new Pair [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( i == 0 ) {
      return input ;
    }
    if ( i == r ) {
      return input ;
    }
    if ( i == c ) {
      return input . charAt ( r ) + input . charAt ( c ) ;
    }
    if ( i == 0 ) {
      return input . charAt ( r ) + input . charAt ( c ) + input . charAt ( r - input . charAt ( c ) ) ;
    }
    if ( i == 0 ) {
      return input . charAt ( r ) + input . charAt ( c ) + input . charAt ( r - input . charAt ( c ) ) ;
    }
  }
  final int r = input . charAt ( 0 ) ;
  final int c = input . charAt ( 1 ) ;
  final int n = input . length ( ) ;
  final int [ ] x = {
    0 , 0 }
    ;
    final int [ ] y = {
      0 , 0 }
      ;
      final Pair [ ] a = new Pair [ n ] ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        x [ 0 ] = input . charAt ( i ) ;
        y [ 0 ] = input . charAt ( i ) ;
        if ( ( x [ 0 ] == r || y [ 0 ] == c ) && ( x [ 1 ] == r || y [ 1 ] == c ) ) {
          for ( int k = 0 ;
          k < 2 ;
          k ++ ) {
            a [ k ] = new Pair ( pos ( x [ k ] , y [ k ] ) , i ) ;
          }
        }
      }
      final int m = a . size ( ) / 2 ;
      Arrays . sort ( a ) ;
      String res = "YES" ;
      final Set < Integer > started = new HashSet < Integer > ( ) ;
      final Stack < Integer > s = new Stack < Integer > ( ) ;
      for ( Pair p : a ) {
        final int i = s . pop ( ) ;
        if ( ! started . contains ( i ) ) {
          started . add ( i ) ;
          s . push ( i ) ;
        }
        else {
          if ( s . peek ( ) != i ) {
            res = "NO" ;
            break