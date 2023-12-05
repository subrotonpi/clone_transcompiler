static final Scanner getScanner ( ) {
  final Scanner nextLine = new Scanner ( System . in ) ;
  final int C = Integer . parseInt ( nextLine . nextLine ( ) ) ;
  final Set < Rock > rocks = new HashSet < > ( ) ;
  final Map < Rock , Integer > seen = new HashMap < > ( ) ;
  int H = 0 , W = 0 ;
  {
    if ( nextLine . next ( ) <= 0 || nextLine . next ( ) <= 0 ) return 0 ;
    if ( rocks . contains ( nextLine . next ( ) ) ) return 0 ;
    if ( seen . containsKey ( nextLine . next ( ) ) ) return seen . get ( nextLine . next ( ) ) ;
    int a = solve ( new Rock ( nextLine . next ( ) - 2 , nextLine . next ( ) - 1 ) ) + solve ( new Rock ( nextLine . next ( ) - 1 , nextLine . next ( ) - 2 ) ) ;
    a %= 10007 ;
    seen . put ( nextLine . next ( ) , a ) ;
    return a ;
  }
}
