public static void main ( String input ) {
  int n = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int t = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int [ ] door = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    door [ i ] = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  }
  int total = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    total += t ;
    if ( i != 0 && door [ i - 1 ] + t >= door [ i ] ) {
      total -= ( t + door [ i - 1 ] - door [ i ] ) ;
    }
  }
  System . out . println ( total ) ;
}
