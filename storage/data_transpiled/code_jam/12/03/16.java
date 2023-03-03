public static Set < Integer > rotations ( int x ) {
  String s = Integer . toString ( x ) ;
  int [ ] rots = new int [ s . length ( ) ] ;
  for ( int i = 1 ;
  i < s . length ( ) ;
  i ++ ) rots [ i ] = Integer . parseInt ( s . substring ( i ) + s . substring ( 0 , i ) ) ;
  Arrays . sort ( rots ) ;
  return new HashSet < > ( rots ) ;
}
