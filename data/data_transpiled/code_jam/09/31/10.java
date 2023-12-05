static boolean decode ( String s , int base ) throws IOException {
  final HashMap < Character , Integer > c2v = new HashMap < Character , Integer > ( ) ;
  int res = 0 ;
  int next = 1 ;
  for ( char c : s . toCharArray ( ) ) {
    if ( ! c . equals ( '\0' ) ) {
      if ( c2v . size ( ) < base ) {
        c2v . put ( c , next ) ;
        if ( next == 1 ) {
          next = 0 ;
        }
        else if ( next == 0 ) {
          next = 2 ;
        }
        else {
          next ++ ;
        }
      }
      else {
        return ( false ) ;
      }
    }
    final int dig = c2v . get ( c ) ;
    res = base * res + dig ;
  }
  return ( true ) ;
}
sIn = "A-large(2).in" ;
sOut = "A-large(2).out" ;
final BufferedReader fIn = new BufferedReader ( new FileReader ( sIn ) ) ;
final BufferedReader fOut = new BufferedReader ( new InputStreamReader ( new FileOutputStream ( sOut ) ) ) ;
final int nT = Integer . parseInt ( fIn . readLine ( ) . trim ( ) ) ;
for ( int t = xrange ( nT ) ;
t < nT ;
t ++ ) {
  final String in = fIn . readLine ( ) . trim ( ) ;
  int mn = - 1 ;
  for ( int base : xrange ( 2 , 100 ) ) {
    final int [ ] dRes = decode ( in , base ) ;
    if ( dRes [ 0 ] != 0 ) {
      if ( mn == - 1 || mn > dRes [ 1 ] ) {
        mn = dRes [ 1 ] ;
      }
    }
  }
  System . out . println ( >>> fOut . getAbsolutePath ( ) + "Case #" + ( t + 1 ) + ": " + mn ) ;
}
