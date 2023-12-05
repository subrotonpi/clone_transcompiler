public static String solve ( ) {
  String s = input . nextLine ( ) ;
  HashMap < Character , Integer > cnt = new HashMap < Character , Integer > ( ) ;
  for ( char c : "QWERTYUIOPASDFGHJKLZXCVBNM" . toCharArray ( ) ) {
    cnt . put ( c , 0 ) ;
  }
  for ( char a : s . toCharArray ( ) ) {
    cnt . put ( a , 1 ) ;
  }
  char [ ] a = {
    'ZERO' , 'TWO' , 'EIGHT' , 'SIX' , 'FOUR' , 'FIVE' , 'SEVEN' , 'THREE' , 'NINE' , 'ONE' }
    ;
    char [ ] b = {
      'Z' , 'W' , 'G' , 'X' , 'U' , 'F' , 'V' , 'R' , 'I' , 'O' }
      ;
      char [ ] d = {
        '0' , '2' , '8' , '6' , '4' , '5' , '7' , '3' , '9' , '1' }
        ;
        ArrayList < Integer > res = new ArrayList < Integer > ( ) ;
        for ( int i = 0 ;
        i < 10 ;
        i ++ ) {
          int x = cnt . get ( b [ i ] ) ;
          for ( char c : a [ i ] ) {
            cnt . get ( c ) - = x ;
          }
          for ( int j = 0 ;
          j < x ;
          j ++ ) {
            res . add ( d [ i ] ) ;
          }
        }
        Collections . sort ( res ) ;
        StringBuffer ans = new StringBuffer ( ) ;
        for ( int d : res ) {
          ans . append ( d ) ;
        }
        return ans . toString ( ) ;
      }
      