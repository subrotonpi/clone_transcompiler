public static void main ( String input , int n , int q ) {
  String s = input ;
  int [ ] c = new int [ s . length ( ) ] ;
  c [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < s . length ( ) - 1 ;
  i ++ ) {
    if ( s . charAt ( i ) == 'A' && s . charAt ( i + 1 ) == 'C' ) {
      c [ i ] = c [ i ] + 1 ;
    }
    else {
      c [ i ] = c [ i ] ;
    }
  }
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int l = Integer . parseInt ( input . substring ( 0 , i ) ) ;
    int r = Integer . parseInt ( input . substring ( i + 1 , i + 1 ) ) ;
    System . out . println ( c [ r - 1 ] - c [ l - 1 ] ) ;
  }
}
