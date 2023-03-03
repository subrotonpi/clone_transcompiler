public static int n ( int t ) {
  int [ ] alist = Integer . parseInt ( input . nextLine ( ) ) . split ( " " ) ;
  List < Integer > minal = new ArrayList < > ( ) ;
  List < Integer > maxal = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < alist . length ;
  i ++ ) {
    alist [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  minal . add ( alist [ 0 ] ) ;
  maxal . add ( alist [ alist . length - 1 ] ) ;
  for ( int a = alist . length - 1 ;
  a >= 0 ;
  a -- ) {
    if ( maxal . get ( a ) < alist [ a ] ) {
      maxal . add ( alist [ a ] ) ;
    }
    else {
      maxal . add ( alist [ a ] ) ;
    }
  }
  maxal . clear ( ) ;
  int maxda = 0 ;
  int ans = 0 ;
  int prevmina = 0 , prevmaxa = 0 ;
  for ( int i = 0 ;
  i < maxal . size ( ) ;
  i ++ ) {
    int mina = minal . get ( i ) ;
    int maxa = maxal . get ( i ) ;
    if ( prevmina == mina && prevmaxa == maxa ) {
      continue ;
    }
    else if ( maxa - mina == maxda ) {
      ans ++ ;
    }
    else if ( maxa - mina > maxda ) {
      maxda = maxa - mina ;
      ans = 1 ;
    }
    prevmina = mina ;
    prevmaxa = maxa ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
