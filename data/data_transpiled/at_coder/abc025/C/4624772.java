static final String input = System . getProperty ( "line.separator" ) ;
final double inf = Double . POSITIVE_INFINITY ;
final List < List < Integer >> B = new ArrayList < List < Integer >> ( ) ;
final List < List < Integer >> C = new ArrayList < List < Integer >> ( ) ;
for ( int i = 0 ;
i < 2 ;
i ++ ) {
  B . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
  C . add ( Collections . singletonList ( Integer . parseInt ( input . readLine ( ) ) ) ) ;
}
final int [ ] [ ] grid = new int [ 3 ] [ 3 ] ;
for ( int i = 0 ;
i < 3 ;
i ++ ) {
  grid [ i ] [ 0 ] = - 1 ;
  grid [ i ] [ 1 ] = 1 ;
}
final HashMap < String , Integer > note = new HashMap < String , Integer > ( ) ;
{
  int sum2 [ ] [ ] = new int [ 3 ] [ 3 ] ;
  int res = 0 ;
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 3 ;
    j ++ ) {
      if ( table [ i + 1 ] [ j ] == table [ i ] [ j ] ) {
        score += B [ i ] [ j ] ;
      }
      else {
        score -= B [ i ] [ j ] ;
      }
    }
  }
}
;
{
  int score = 0 ;
  for ( int i = 0 ;
  i < 2 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      if ( table [ i ] [ j + 1 ] == table [ i ] [ j ] ) {
        score += C [ i ] [ j ] ;
      }
      else {
        score -= C [ i ] [ j ] ;
      }
    }
  }
  for ( int i = 0 ;
  i < 3 ;
  i ++ ) {
    for ( int j = 0 ;
    j < 2 ;
    j ++ ) {
      if ( table [ i ] [ j + 1 ] == table [ i ] [ j ] ) {
        score += C [ i ] [ j ] ;
      }
      else {
        score -= C [ i ] [ j ] ;
      }
    }
  }
  return score ;
}
}
