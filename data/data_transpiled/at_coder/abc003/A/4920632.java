public static int N = Double . parseDouble ( input ) ;
if ( N % 2 == 0 ) {
  System . out . println ( ( int ) ( ( N / 2 + 0.5 ) * 10000 ) ) ;
}
else {
  System . out . println ( ( int ) ( ( N + 1 ) / 2 * 10000 ) ) ;
}
return N ;
}
