public static int getKey ( char [ ] ss ) {
  int num = 0 ;
  for ( char c : ss ) {
    num |= 1 << ( ( c - 'a' ) & 0xFF ) ;
  }
  ans *= factorial [ mul . length ] ;
  ans %= MODFAC ;
  int tt = Integer . parseInt ( readLine ( ) ) ;
  for ( int t = xrange ( 1 , tt + 1 ) ;
  t < ss . length ;
  t ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    String sll = readLine ( ) ;
    ans = solve ( sll ) ;
    System . out . println ( "Case #" + t + ": " + ans ) ;
  }
  /* solve the list of strings */
  final int MODFAC = 1000000007 ;
  int ans = 1 ;
  int [ ] factorial = new int [ ss . length ] ;
  int num = 1 ;
  for ( int i : xrange ( 1 , 101 ) ) {
    num *= i ;
    num %= MODFAC ;
    factorial [ n ] = num ;
  }
  char [ ] mul = new char [ 26 ] ;
  int [ ] sin = new int [ 26 ] ;
  for ( String s : sl ) {
    if ( ! checkPass ( s ) ) return 0 ;
    if ( singleChar ( s ) ) {
      sin [ ( s . charAt ( 0 ) - 'a' ) ] ++ ;
    }
    else mul [ i ] = s ;
  }
  for ( int i = xrange ( 26 ) ;
  i < mul . length ;
  i ++ ) {
    char c = ( char ) ( 'a' + i ) ;
    ans *= factorial [ sin [ i ] ] ;
    ans %= MODFAC ;
    int useFront = 0 ;
    int useBack = 0 ;
    int lastFront = 0 ;
    int lastBack = 0 ;
    for ( int j : xrange ( mul . length ) ) {
      if ( mul [ j ] [ 0 ] == c ) {
        useFront ++ ;
        lastFront = j ;
      }
      if ( mul [ j ] [ -- 1 ] == c ) {
        useBack ++ ;
        lastBack = j ;
      }
    }
    if ( useFront >= 2 || useBack >= 2 ) return 0 ;
    else if ( useFront == 1 && useBack == 1 ) {
      char [ ] newmul = new char [ mul . length + 1 ] ;
      newmul [ mul . length ] = mul [ lastBack ] ;
      for ( int k = 0 ;
      k < mul . length ;
      k ++ ) {
        if (