public static int N = Integer . parseInt ( input ) ;
r = input . next ( ) ;
int tmp = 0 ;
for ( int i = 0 ;
i < N ;
i ++ ) {
  switch ( r . charAt ( i ) ) {
    case 'A' : tmp += 4 ;
    break ;
    case 'B' : tmp += 3 ;
    break ;
    case 'C' : tmp += 2 ;
    break ;
    case 'D' : tmp += 1 ;
    break ;
  }
}
return tmp / N ;
}
