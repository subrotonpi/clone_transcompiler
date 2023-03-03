public static int [ ] [ ] getNegativeInstances ( ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] List_Odd = new int [ 11 ] [ 2 ] ;
  int [ ] [ ] List_Eve = new int [ 11 ] [ 2 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    List_Odd [ i ] [ 0 ] = i ;
    List_Eve [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int coler = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( i % 2 == 0 ) {
      List_Odd [ i ] [ 0 ] ++ ;
    }
    else {
      List_Eve [ i ] [ 0 ] ++ ;
    }
  }
  Arrays . sort ( List_Odd , Collections . reverseOrder ( ) ) ;
  Arrays . sort ( List_Eve , Collections . reverseOrder ( ) ) ;
  if ( N % 2 == 0 ) {
    if ( List_Odd [ 0 ] [ 1 ] != List_Eve [ 0 ] [ 1 ] ) System . out . println ( ( N - List_Odd [ 0 ] [ 0 ] - List_Eve [ 0 ] [ 0 ] ) * C ) ;
    else if ( List_Odd [ 0 ] [ 1 ] == List_Eve [ 0 ] [ 1 ] ) {
      if ( List_Odd [ 0 ] [ 0 ] > List_Eve [ 0 ] [ 0 ] ) System . out . println ( ( N - List_Odd [ 0 ] [ 0 ] - List_Eve [ 1 ] [ 0 ] ) * C ) ;
      else if ( List_Odd [ 0 ] [ 0 ] < List_Eve [ 0 ] [ 0 ] ) System . out . println ( ( N - List_Odd [ 1 ] [ 0 ] - List_Eve [ 0 ] [ 0 ] ) * C ) ;
      else if ( List_Odd [ 0 ] [ 0 ] >= List_Eve [ 1 ] [ 0 ] ) System . out . println ( ( N - List_Odd [ 1 ] [ 0 ] - List_Eve [ 0 ] [ 0 ] ) * C ) ;
      else System . out . println ( ( N - List_Odd [ 0 ] [ 0 ] - List_Eve [ 1 ] [ 0 ] ) * C ) ;
    }
  }
  if ( N % 2 == 1 ) {
    if ( List_Odd [ 0 ] [ 1