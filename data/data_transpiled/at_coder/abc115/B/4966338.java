public static void main ( ) {
  n = Integer . parseInt ( input ( ) ) ;
  int [ ] arr = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    arr [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  Arrays . sort ( arr ) ;
  System . out . println ( ( int ) ( Math . pow ( arr . length - arr . length , arr . length ) / 2 ) ) ;
}
