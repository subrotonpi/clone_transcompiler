public static int ops ( int p , int m ) {
  int op ;
  if ( m <= r ) {
    op = 400 - p ;
  }
  else if ( m <= r + g ) {
    op = 500 - p ;
  }
  else {
    op = 600 - p ;
  }
  return ( Math . abs ( op ) ) ;
}
int r = Integer . parseInt ( input . nextLine ( ) ) ;
int g = Integer . parseInt ( input . nextLine ( ) ) ;
int b = Integer . parseInt ( input . nextLine ( ) ) ;
int mnum = r + g + b ;
double [ ] dp = new double [ mnum + 1 ] ;
for ( int i = 0 ;
i < dp . length ;
i ++ ) {
  dp [ i ] = Double . MAX_VALUE ;
}
dp [ 0 ] = 0 ;
for ( int i = 0 ;
i < 1002 ;
i ++ ) {
  double [ ] tmpDP = new double [ mnum + 1 ] ;
  for ( int j = 1 ;
  j <= mnum ;
  j ++ ) {
    op = ops ( i , j ) + dp [ j - 1 ] ;
    if ( op < dp [ j ] ) {
      tmpDP [ j ] = op ;
    }
  }
  dp = tmpDP ;
}
System . out . println ( dp [ dp . length - 1 ] ) ;
}
