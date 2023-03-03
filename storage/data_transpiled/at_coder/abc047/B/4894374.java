static final String getExample ( ) {
  final String input = System . getProperty ( "line.separator" ) ;
  final String INT = Integer . valueOf ( input ) ;
  final String MAP = Integer . valueOf ( input ) ;
  final String LIST = Integer . valueOf ( input ) ;
  System . setLibrary ( "python" ) ;
  INF = Double . valueOf ( "inf" ) ;
  MOD = 10 * 9 + 7 ;
  final int W = MAP . length ( ) ;
  final int H = MAP . length ( ) ;
  final int N = MAP . length ( ) ;
  final int [ ] xya = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xya [ i ] = LIST . length ( ) ;
  }
  int right = W ;
  int left = 0 ;
  int top = H ;
  int bottom = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int x = xya [ i ] ;
    int y = xya [ i ] ;
    int a = xya [ i ] ;
    if ( a == 1 && left < x && right < x ) {
      left = x ;
    }
    else if ( a == 1 && right <= x ) {
      right = x ;
    }
    else if ( a == 2 && x <= left ) {
      S = 0 ;
      break ;
    }
    else if ( a == 3 && bottom < y && top < y ) {
      bottom = y ;
    }
    else if ( a == 3 && top <= y ) {
      S = 0 ;
      break ;
    }
    else if ( a == 4 && bottom < y && top < y ) {
      top = y ;
    }
    else if ( a == 4 && y <= bottom ) {
      S = 0 ;
      break ;
    }
    else {
    }
    S = ( right - left ) * ( top - bottom ) ;
  }
  if ( S <= 0 ) {
    S = 0 ;
  }
  System . out . println ( S ) ;
  return INT ;
}
