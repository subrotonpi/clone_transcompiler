public static int [ ] [ ] N = new int [ N ] [ ] ;
int A = 0 , B = 0 , C = 0 ;
int [ ] l = new int [ N ] ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  l [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
}
int [ ] X = new int [ N ] [ ] ;
for ( int i = 0 ;
i < 4 * N ;
i ++ ) {
  int [ ] num = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    num [ j ] = i % 4 ;
    i /= 4 ;
  }
  int a = 0 , b = 0 , c = 0 , x = - 30 ;
  for ( int k = 0 ;
  k < N ;
  k ++ ) {
    switch ( num [ k ] ) {
      case 0 : a += l [ k ] ;
      x += 10 ;
      break ;
      case 1 : b += l [ k ] ;
      x += 10 ;
      break ;
      case 2 : c += l [ k ] ;
      x += 10 ;
      break ;
    }
  }
  if ( a * b * c != 0 ) {
    x += Math . abs ( A - a ) + Math . abs ( B - b ) + Math . abs ( C - c ) ;
    X [ N ] [ N ] = x ;
  }
}
System . out . println ( min ( X ) ) ;
return X ;
}
