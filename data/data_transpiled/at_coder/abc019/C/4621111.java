public static Set < Integer > N = Integer . parseInt ( input ) ;
Set < Integer > ans = new HashSet < > ( ) ;
for ( int a : map . values ( ) ) {
  do {
    if ( a % 2 == 1 ) {
      ans . addAll ( new HashSet < > ( ) ) ;
      break ;
    }
    else {
      a /= 2 ;
    }
  }
  while ( true ) ;
}
