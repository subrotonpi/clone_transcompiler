@ Sys public static void input ( ) {
  int ntest = input . nextInt ( ) ;
  Set < Character > vowels = new HashSet < > ( ) ;
  vowels . add ( 'a' ) ;
  vowels . add ( 'e' ) ;
  vowels . add ( 'i' ) ;
  vowels . add ( 'o' ) ;
  vowels . add ( 'u' ) ;
  for ( int test : xrange ( ntest ) ) {
    String s = input . nextLine ( ) ;
    String n = input . nextLine ( ) ;
    int n = Integer . parseInt ( n ) ;
    int count = 0 ;
    int pos = - 1 ;
    int nvalue = 0 ;
    for ( int i = 0 ;
    i < s . length ( ) ;
    i ++ ) {
      if ( vowels . contains ( s . charAt ( i ) ) ) {
        count = 0 ;
      }
      else {
        count ++ ;
      }
      if ( count >= n ) {
        pos = i + 2 - n ;
      }
      if ( pos >= 0 ) {
        nvalue += pos ;
      }
    }
    System . out . println ( "Case #" + ( test + 1 ) + ": " + nvalue ) ;
  }
}
