static public int [ ] generuj ( int n , int i , int [ ] predesle ) {
  if ( ( i == n ) && ( predesle . length == 0 ) ) {
    return new int [ ] {
      n }
      ;
    }
    int pozice = i % ( n - i + 1 ) ;
    if ( pozice == 0 ) {
      pozice = ( n - i + 1 ) ;
    }
    int zbyva = ( n - i + 1 ) - pozice ;
    int [ ] konec = new int [ predesle . length - zbyva ] ;
    System . arraycopy ( predesle , 0 , konec , 0 , zbyva ) ;
    int [ ] zacatek = new int [ predesle . length - zbyva ] ;
    System . arraycopy ( predesle , zacatek , 0 , zacatek , zbyva , predesle . length - zbyva ) ;
    return zacatek ;
  }
  /* vygeneruj(n) */
  int [ ] data = new int [ predesle . length ] ;
  for ( int i = n ;
  i > 0 ;
  i -- ) {
    predesle = data ;
    data = generuj ( n , i , predesle ) ;
  }
  System . in . read ( ) ;
  int testCase = 1 ;
  while ( true ) {
    String line = System . in . readLine ( ) ;
    if ( line == null ) {
      break ;
    }
    int n = Integer . parseInt ( line ) ;
    int [ ] balicek = vygeneruj ( n ) ;
    data = Arrays . copyOf ( data , data . length ) ;
    System . out . println ( "Case #" + testCase + ":" ) ;
    System . out . println ( Arrays . toString ( balicek [ data . length - 1 ] ) ) ;
    testCase ++ ;
  }
  