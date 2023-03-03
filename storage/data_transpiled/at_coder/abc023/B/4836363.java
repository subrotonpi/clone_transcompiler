public static int N = Integer . parseInt ( input ) {
  String S = input ;
  boolean flag = true ;
  if ( N % 2 == 0 ) {
    flag = false ;
  }
  int c = ( int ) ( ( N - 1 ) / 2 ) ;
  if ( S . charAt ( c ) != 'b' ) {
    flag = false ;
  }
  for ( int i = 0 ;
  i < Integer . MAX_VALUE ;
  i ++ ) {
    if ( i % 3 == 1 ) {
      if ( S . charAt ( c - i ) != 'a' || S . charAt ( c + i ) != 'c' ) {
        flag = false ;
      }
    }
    if ( i % 3 == 2 ) {
      if ( S . charAt ( c - i ) != 'c' || S . charAt ( c + i ) != 'a' ) {
        flag = false ;
      }
    }
    if ( i % 3 == 0 ) {
      if ( S . charAt ( c - i ) != 'b' || S . charAt ( c + i ) != 'b' ) {
        flag = false ;
      }
    }
  }
  int ans ;
  if ( flag ) {
    ans = ( N - 1 ) / 2 ;
  }
  else {
    ans = - 1 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
