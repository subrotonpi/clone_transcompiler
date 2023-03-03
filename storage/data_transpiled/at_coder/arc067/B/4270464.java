public static int N ( String input ) {
  int A = Integer . parseInt ( input ) ;
  int B = Integer . parseInt ( input ) ;
  int [ ] x = new int [ N ] ;
  int [ ] ls = new int [ N ] ;
  int a = 0 ;
  for ( int i = 0 ;
  i < x . length ;
  i ++ ) ls [ i ] = x [ i ] ;
  for ( int i = 0 ;
  i < ls . length - 1 ;
  i ++ ) {
    int result = ls [ i + 1 ] - ls [ i ] ;
    if ( result * A > B ) a += B ;
    else a += result * A ;
  }
  System . out . println ( a ) ;
  return a ;
}
