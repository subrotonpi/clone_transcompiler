static final Scanner in = new Scanner ( System . in ) {
  final PrintStream outp = System . out ;
  final String norm = "" ;
  final String [ ] strs = new String [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    norm = "" . length ( ) ;
  }
  final String [ ] mul = new String [ n ] ;
  final Iterator < String > it = s . iterator ( ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    final Iterator < String > it = it . next ( ) . iterator ( ) ;
    int r = 0 ;
    while ( it . hasNext ( ) ) {
      final String a = it . next ( ) ;
      ++ r ;
    }
    res [ i ] = r ;
  }
  return new Scanner ( res [ 0 ] ) ;
}
private void solve ( ) {
  final int n = Integer . parseInt ( in . nextLine ( ) ) ;
  final String [ ] strs = new String [ n ] ;
  for ( int i = 1 ;
  i < n ;
  ++ i ) strs [ i ] = in . nextLine ( ) . substring ( 0 , in . nextLine ( ) . length ( ) - 1 ) ;
  for ( int i = 1 ;
  i < n ;
  ++ i ) {
    if ( norm . length ( strs [ i ] ) != norm . length ( strs [ 0 ] ) ) {
      System . out . println ( "Fegla Won" ) ;
      return ;
    }
  }
  final List < List < Integer >> vals = new ArrayList < List < Integer >> ( ) ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) vals . add ( mul . get ( strs [ i ] ) ) ;
  int tot = 0 ;
  for ( int j = 0 ;
  j < vals . get ( 0 ) . size ( ) ;
  ++ j ) {
    final List < Integer > x = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) x . add ( vals . get ( i ) . get ( j ) ) ;
    final int med = x . get ( n / 2 ) ;
    for ( int i = 0 ;
    i < n ;
    ++ i ) tot += Math . abs ( med - x . get ( i ) ) ;
  }
  System . out . println ( tot ) ;
  final int T = in . nextInt ( ) ;
  for ( int i = 0 ;
  i < T ;
  ++ i ) {
    outp . print