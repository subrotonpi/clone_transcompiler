public static String make ( int i , int n , String cur ) {
  if ( i == n ) return cur ;
  StringBuffer ret = new StringBuffer ( ) ;
  for ( int j = 0 ;
  j < cur . length ( ) ;
  j ++ ) {
    char c = cur . charAt ( j ) ;
    char a = 0 , b = 0 ;
    switch ( c ) {
      case 'P' : a = 'P' ;
      b = 'R' ;
      break ;
      case 'R' : a = 'R' ;
      b = 'S' ;
      break ;
      case 'S' : a = 'P' ;
      b = 'S' ;
      break ;
    }
    String l1 = make ( i + 1 , n , a ) ;
    String l2 = make ( i + 1 , n , b ) ;
    if ( l1 . compareTo ( l2 ) < 0 ) {
      ret . append ( l1 ) ;
      ret . append ( l2 ) ;
    }
    else {
      ret . append ( l2 ) ;
      ret . append ( l1 ) ;
    }
  }
  return ret . toString ( ) ;
}
int T = Integer . parseInt ( readLine ( ) ) ;
for ( int t : xrange ( T ) ) {
  int N = Integer . parseInt ( readLine ( ) ) ;
  int R = Integer . parseInt ( readLine ( ) ) ;
  int P = Integer . parseInt ( readLine ( ) ) ;
  int S = Integer . parseInt ( readLine ( ) ) ;
  String opt = "IMPOSSIBLE" ;
  String [ ] answers = {
    make ( 0 , N , 'R' ) , make ( 0 , N , 'P' ) , make ( 0 , N , 'S' ) , }
    ;
    for ( String ans : answers ) {
      if ( ans . indexOf ( 'P' ) == P && ans . indexOf ( 'R' ) == R && ans . indexOf ( 'S' ) == S ) opt = ans ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + opt ) ;
    return ret . toString ( ) ;
  }
  