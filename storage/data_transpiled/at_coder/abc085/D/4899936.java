public static void main ( String [ ] args ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int H = Integer . parseInt ( input . nextLine ( ) ) ;
  int ma = 0 ;
  List < Integer > B = new ArrayList < > ( ) ;
  for ( ;
  ;
  ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    ma = Math . max ( ma , a ) ;
    B . add ( b ) ;
  }
  Collections . sort ( B , Collections . reverseOrder ( ) ) ;
  int ans = 0 ;
  for ( int b : B ) {
    if ( 0 >= H ) {
      System . out . println ( ans ) ;
      return ;
    }
    if ( ma >= b || 0 >= H ) {
      break ;
    }
    H -= b ;
    ans ++ ;
  }
  if ( H > 0 ) {
    ans += H / ma ;
    if ( H % ma != 0 ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
