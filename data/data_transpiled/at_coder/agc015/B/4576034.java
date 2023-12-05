public static int s = 0 ;
String a = input ( ) ;
for ( int i = 0 ;
i < a . length ( ) ;
i ++ ) {
  if ( a . charAt ( i ) == 'U' ) s += a . length ( ) - i + 2 * i - 1 ;
  else s += 2 * ( a . length ( ) - i - 1 ) + i ;
}
return s ;
}
