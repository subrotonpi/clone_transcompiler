public static int N = Integer . parseInt ( input ) {
  String S = input ;
  int ans = - 1 ;
  char [ ] s = 'b' ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    if ( s == S ) {
      ans = i - 1 ;
      break ;
    }
    s = new char [ ] {
      'b' , 'a' , 'c' }
      [ i % 3 ] + s + new char [ ] {
        'b' , 'c' , 'a' }
        [ i % 3 ] ;
      }
      System . out . println ( ans ) ;
      return ans ;
    }
    