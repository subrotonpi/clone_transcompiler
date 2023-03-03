static final double toMin ( String s ) {
  return Integer . parseInt ( s . substring ( 0 , 2 ) , 10 ) * 60 + Integer . parseInt ( s . substring ( s . length ( ) - 2 ) , 10 ) ;
}
