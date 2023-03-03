static void print ( String s ) {
  s = sorted ( [ i for i in input ( ) ] ) ;
  System . out . println ( 'Yes' if '' . join ( s ) == 'abc' else 'No' ) ;
}
