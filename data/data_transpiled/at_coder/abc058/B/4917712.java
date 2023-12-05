public static void main ( String [ ] args ) {
  final Scanner input = new Scanner ( System . in ) ;
  final String O = String . valueOf ( input . nextLine ( ) . trim ( ) ) ;
  final String E = String . valueOf ( input . nextLine ( ) . trim ( ) ) ;
  StringBuffer ans = new StringBuffer ( ) ;
  for ( int i = 0 ;
  i < O . length ( ) ;
  i ++ ) {
    if ( i == O . length ( ) - 1 && O . length ( ) != E . length ( ) ) {
      ans . append ( O . charAt ( i ) ) ;
    }
    else {
      ans . append ( O . charAt ( i ) ) ;
      ans . append ( E . charAt ( i ) ) ;
    }
  }
  System . out . println ( ans ) ;
}
