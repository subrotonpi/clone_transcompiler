public static void main ( String input ) {
  n = Integer . parseInt ( input ) ;
  l = [ Integer . parseInt ( i ) for i in input . split ( " " ) ] ;
  l . sort ( ) ;
  System . out . println ( l [ l . length - 1 ] - l [ 0 ] ) ;
}
