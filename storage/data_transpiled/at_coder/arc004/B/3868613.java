public static int [ ] getN ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] d = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int inputd = Integer . parseInt ( input . nextLine ( ) ) ;
    d [ i ] = inputd ;
  }
  int biggest = Integer . MAX_VALUE ;
  int smallest ;
  if ( max ( d ) >= biggest / 2 ) {
    smallest = Math . abs ( max ( d ) - ( Math . abs ( max ( d ) - Math . abs ( smallest ) ) ) ) ;
  }
  return d ;
}
