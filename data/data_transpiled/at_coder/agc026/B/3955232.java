public static int T = Integer . parseInt ( input ) {
  int [ ] [ ] ABCD = new int [ T ] [ ] ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    ABCD [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  /*if (i < T) {
  return gcd(T, i);
  }*/
  /*else if (i % T == 0) {
  return i;
  }*/
  /*for (int i = 0; i < T; i++) {
  int a = i / (T - i);
  int b = i / (T - i);
  int c = i / (T - i);
  int d = i / (T - i);
  if (a < b|| d < b) {
  System.out.println("No");
  }
  else {
  int g = gcd(b, d);
  int x = g*(c/g)+(a%g);
  if x<=c) x+=g;
  if x >= b:
  System.out.println("Yes");
  else
  System.out.println("No");
  }
  }*/
  for ( int a = 0 ;
  a < T ;
  a ++ ) {
    int b = ABCD [ a ] [ a ] ;
    int c = ABCD [ b ] [ a ] ;
    int d = ABCD [ b ] [ a ] ;
    if ( a < b || d < b ) {
      System . out . println ( "No" ) ;
    }
    else {
      int g = gcd ( b , d ) ;
      int x = g * ( c / g ) + ( a % g ) ;
      if ( x <= c ) x += g ;
      if ( x >= b ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
  }
  