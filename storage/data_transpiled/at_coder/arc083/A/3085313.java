line = input . nextLine ( ) ;
int a = Integer . parseInt ( line . nextToken ( ) ) ;
int b = Integer . parseInt ( line . nextToken ( ) ) ;
int c = Integer . parseInt ( line . nextToken ( ) ) ;
int d = Integer . parseInt ( line . nextToken ( ) ) ;
int e = Integer . parseInt ( line . nextToken ( ) ) ;
int f = Integer . parseInt ( line . nextToken ( ) ) ;
int ra = 2 ;
int rb = - 1 ;
for ( int ai = 0 ;
ai < f / ( 100 * a ) + 2 ;
ai ++ ) {
  for ( int bi = 0 ;
  bi < f / ( 100 * b ) + 2 ;
  bi ++ ) {
    if ( 100 * a * ai + 100 * b * bi > f ) break ;
    for ( int ci = 0 ;
    ci < f / c + 2 ;
    ci ++ ) {
      if ( 100 * a * ai + 100 * b * bi + c * ci > f ) break ;
      else if ( c * c * ci > ( a * ai + b * bi ) * e ) break ;
      for ( int di = 0 ;
      di < f / d + di ;
      di ++ ) {
        int sa = 100 * a * ai + 100 * b * bi ;
        int sb = c * ci + d * di ;
        if ( sa + sb > f ) break ;
      }
    }
  }
}
System . out . println ( ra + rb + " " + rb ) ;
}
