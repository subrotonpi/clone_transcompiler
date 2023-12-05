public static int N = Integer . parseInt ( input ) ;
for ( int i = 0 ;
i < 100000 ;
i ++ ) {
  if ( i * i > N ) break ;
}
return ( ( i - 1 ) * ( i - 1 ) ) ;
}
