@ Test ( description = "A-large.in" ) public static final String FI = "A-large.in" ;
final int AND = 1 ;
final int OR = 0 ;
final int VALUE = - 1 ;
{
  int g = Integer . parseInt ( "" ) ;
  int c = Integer . parseInt ( "" ) ;
  int v = Integer . parseInt ( "" ) ;
  int l = Integer . parseInt ( "" ) ;
  int r = Integer . parseInt ( "" ) ;
  if ( v == 1 ) return 0 ;
  if ( g == VALUE ) return 100000 ;
  if ( g == OR ) return Math . min ( make1 ( l ) , make1 ( r ) ) ;
  if ( c != 0 ) return 1 + Math . min ( make1 ( l ) , make1 ( r ) ) ;
  else return make1 ( l ) + make1 ( r ) ;
}
{
  int g = Integer . parseInt ( "" ) ;
  int c = Integer . parseInt ( "" ) ;
  int v = Integer . parseInt ( "" ) ;
  int l = Integer . parseInt ( "" ) ;
  int r = Integer . parseInt ( "" ) ;
  if ( v == 0 ) return 0 ;
  if ( g == VALUE ) return 100000 ;
  if ( g == AND ) return Math . min ( make0 ( l ) , make0 ( r ) ) ;
  if ( c != 0 ) return 1 + Math . min ( make0 ( l ) , make0 ( r ) ) ;
  else return make0 ( l ) + make0 ( r ) ;
}
{
  int M = Integer . parseInt ( "" ) ;
  int V = Integer . parseInt ( "" ) ;
  int [ ] [ ] nodes = new int [ M ] [ ] ;
  for ( int i = 0 ;
  i < Range . values ( ) . length ;
  i ++ ) {
    g = Integer . parseInt ( "" ) ;
    c = Integer . parseInt ( "" ) ;
    nodes [ i ] = new int [ ] {
      g , c , 0 , 0 , 0 }
      ;
    }
    for ( int i = 0 ;
    i < Range . values ( ) . length ;
    i ++ ) {
      v = Integer . parseInt ( "" ) ;
      nodes [ i ] [ 0 ] = VALUE ;
      nodes [ i ] [ 2 ] = Math . min ( l [ 2 ] , r [ 2 ] ) ;
    }
    if ( V == 0 ) {
      int val = make0 ( nodes [ 0 ] ) ;
      if