public static int N ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  String [ ] ws = Arrays . copyOfRange ( input . nextLine ( ) . substring ( 0 , input . nextLine ( ) . length ( ) - 1 ) . split ( " " ) , N ) ;
  String [ ] t = {
    "TAKAHASHIKUN" , "Takahashikun" , }
    ;
    int result = Arrays . stream ( ws ) . mapToInt ( w -> w ) . sum ( ) ;
    return result ;
  }
  