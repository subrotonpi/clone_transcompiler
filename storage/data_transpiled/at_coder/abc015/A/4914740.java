public static void input ( ) {
  String A = input . nextLine ( ) ;
  String B = input . nextLine ( ) ;
  if ( A . length ( ) > 0 && B . length ( ) > 0 ) {
    int C = A . length ( ) ;
    int D = B . length ( ) ;
    if ( C > D ) {
      System . out . println ( A ) ;
    }
    else if ( D > C ) {
      System . out . println ( B ) ;
    }
  }
}
