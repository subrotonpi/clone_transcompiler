public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final int x = Integer . parseInt ( input . nextLine ( ) ) ;
  final int y = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] a = {
    1 , 3 , 5 , 7 , 8 , 10 , 12 }
    ;
    final int [ ] b = {
      4 , 6 , 9 , 11 }
      ;
      final int [ ] c = {
        2 }
        ;
        if ( a [ x ] == 1 && a [ y ] == 1 ) {
          System . out . println ( "Yes" ) ;
        }
        else if ( b [ x ] == 1 && b [ y ] == 1 ) {
          System . out . println ( "Yes" ) ;
        }
        else if ( c [ x ] == 1 && c [ y ] == 1 ) {
          System . out . println ( "Yes" ) ;
        }
        else {
          System . out . println ( "No" ) ;
        }
      }
      