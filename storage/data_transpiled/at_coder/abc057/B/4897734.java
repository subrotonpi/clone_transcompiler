public static void main ( int n , int m , String ... a ) {
  for ( String s : open ( 0 ) ) {
    a [ s ] = s . split ( " " ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) l . add ( Math . abs ( a [ i ] - a [ j ] ) ) ;
    System . out . println ( 1 + l . indexOf ( Math . min ( l ) ) ) ;
  }
}
