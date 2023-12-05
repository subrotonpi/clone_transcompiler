public static int p ( char [ ] w , char r , char m , char c ) {
  int n = d . indexOf ( w [ r ] ) + d . indexOf ( w [ r - c ] ) + x . indexOf ( m ) ;
  return d [ n % 2 ] ;
  char [ ] a = {
    'SS' , 'SW' , 'WS' , 'WW' }
    ;
    char [ ] d = {
      'S' , 'W' }
      ;
      char [ ] x = {
        'o' , 'x' }
        ;
        int n = Integer . parseInt ( input ( ) ) ;
        String s = input ( ) ;
        for ( int j = 0 ;
        j < 4 ;
        j ++ ) {
          for ( int i = 1 ;
          i < n ;
          i ++ ) {
            a [ j ] += p ( a [ j ] , i , s . charAt ( i ) ) ;
          }
          a [ j ] = p ( a [ j ] , 0 , s . charAt ( 0 ) , - 1 ) + a [ j ] ;
        }
        String ans = - 1 ;
        for ( int i = 0 ;
        i < a . length ;
        i ++ ) {
          if ( a [ i ] == a [ i ] . charAt ( a [ i ] . length ( ) - 2 ) && a [ i ] == a [ i ] . charAt ( a [ i ] . length ( ) - 1 ) ) ans = a [ i ] . substring ( 1 , a [ i ] . length ( ) - 1 ) ;
        }
        System . out . println ( ans ) ;
        return ans ;
      }
      