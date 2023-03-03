public static final int [ ] getDoubleArray ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  HashMap < Integer , Double > td_mx = new HashMap < Integer , Double > ( ) ;
  ArrayList < Double > td = new ArrayList < Double > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int t = Integer . parseInt ( input . nextLine ( ) ) ;
    double d = Double . parseDouble ( input . nextLine ( ) ) ;
    if ( ! td_mx . containsKey ( t ) ) {
      td_mx . put ( t , d ) ;
    }
    else if ( td_mx . get ( t ) < d ) {
      td . add ( td_mx . get ( t ) ) ;
      td_mx . put ( t , d ) ;
    }
    else {
      td . add ( d ) ;
    }
  }
  Collections . sort ( td , new Comparator < Double > ( ) {
    @ Override public int compare ( Double o1 , Double o2 ) {
      return - o1 ;
    }
  }
  ) ;
  Arrays . sort ( td_mx . values ( ) , new Comparator < Double > ( ) {
    @ Override public int compare ( Double o1 , Double o2 ) {
      return - o1 ;
    }
  }
  ) ;
  int [ ] csum = new int [ k + 1 ] ;
  int [ ] csummx = new int [ k + 1 ] ;
  for ( int i = 0 ;
  i < csum . length ;
  i ++ ) {
    csum [ i ] = csummx [ i ] ;
    csummx [ i ] = csummx [ k - i ] + i * i ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= k ;
  i ++ ) {
    if ( i <= csummx . length - 1 && k - i <= csum . length - 1 ) {
      ans = Math . max ( ans , csummx [ i ] + csum [ k - i ] + i * i ) ;
    }
  }
  System . out . println ( ans ) ;
  return csum ;
}
