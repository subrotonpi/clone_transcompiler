public static void input ( int n , int k ) {
  int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  String t = "Nothing" ;
  for ( int i = 0 ;
  i < k * n ;
  i ++ ) {
    int ans = l [ 0 ] [ i % k ] ;
    if ( n > 1 ) {
      i /= k ;
      ans = ans ^ l [ 1 ] [ i % k ] ;
      if ( n > 2 ) {
        i /= k ;
        ans = ans ^ l [ 2 ] [ i % k ] ;
        if ( n > 3 ) {
          i /= k ;
          ans = ans ^ l [ 3 ] [ i % k ] ;
          if ( n > 4 ) {
            i /= k ;
            ans = ans ^ l [ 4 ] [ i % k ] ;
          }
        }
      }
    }
    if ( ans == 0 ) {
      t = "Found" ;
      break ;
    }
  }
  System . out . println ( t ) ;
}
