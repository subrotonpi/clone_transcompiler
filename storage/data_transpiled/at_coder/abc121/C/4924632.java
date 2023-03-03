public static void main ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int M = Integer . parseInt ( input ) ;
  Map < Integer , Integer > drinkMap = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int A = Integer . parseInt ( input ) ;
    int B = Integer . parseInt ( input ) ;
    if ( ! drinkMap . containsKey ( A ) ) {
      drinkMap . put ( A , B ) ;
    }
    else {
      drinkMap . get ( A ) + = B ;
    }
  }
  List < Map . Entry < Integer , Integer >> drinkList = new ArrayList < > ( drinkMap . entrySet ( ) ) ;
  Collections . sort ( drinkList ) ;
  int totalNumber = 0 ;
  int totalPrice = 0 ;
  for ( Map . Entry < Integer , Integer > i : drinkList ) {
    if ( totalNumber + i . getValue ( ) >= M ) {
      System . out . println ( totalPrice + ( M - totalNumber ) * i . getKey ( ) ) ;
      break ;
    }
    else {
      totalPrice += i . getKey ( ) * i . getValue ( ) ;
      totalNumber += i . getValue ( ) ;
    }
  }
}
