public static void main ( String [ ] args ) {
  String a = input . nextLine ( ) ;
  String b = input . nextLine ( ) ;
  int [ ] subs = {
    Integer . parseInt ( a ) - Integer . parseInt ( b ) , Integer . parseInt ( "9" + a . substring ( 1 , 2 ) + a . substring ( 2 ) ) - Integer . parseInt ( b ) , Integer . parseInt ( a . substring ( 0 , 1 ) + "9" + a . substring ( 2 ) ) - Integer . parseInt ( b ) , Integer . parseInt ( a ) - Integer . parseInt ( "1" + b . substring ( 1 , 2 ) + b . substring ( 2 ) ) , Integer . parseInt ( a ) - Integer . parseInt ( b . substring ( 0 , 1 ) + "0" + b . substring ( 2 ) ) , Integer . parseInt ( a ) - Integer . parseInt ( b . substring ( 0 , 1 ) + "0" + b . substring ( 1 ) ) , }
    ;
    System . out . println ( Arrays . toString ( subs ) ) ;
  }
  