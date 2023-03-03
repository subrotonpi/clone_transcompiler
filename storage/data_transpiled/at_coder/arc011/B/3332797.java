static final String rtrim ( ) {
  final String n = input . nextLine ( ) ;
  String a = input . nextLine ( ) . toLowerCase ( ) ;
  a = a . replace ( 'b' , '1' ) ;
  a = a . replace ( 'c' , '1' ) ;
  a = a . replace ( 'd' , '2' ) ;
  a = a . replace ( 'w' , '2' ) ;
  a = a . replace ( 't' , '3' ) ;
  a = a . replace ( 'j' , '3' ) ;
  a = a . replace ( 'f' , '4' ) ;
  a = a . replace ( 'q' , '4' ) ;
  a = a . replace ( 'l' , '5' ) ;
  a = a . replace ( 'v' , '5' ) ;
  a = a . replace ( 's' , '6' ) ;
  a = a . replace ( 'x' , '6' ) ;
  a = a . replace ( 'p' , '7' ) ;
  a = a . replace ( 'm' , '7' ) ;
  a = a . replace ( 'h' , '8' ) ;
  a = a . replace ( 'k' , '0' ) ;
  a = a . replace ( ',' , '' ) ;
  a = a . replace ( '.' , '' ) ;
  System . out . println ( a . trim ( ) ) ;
  return a ;
}
