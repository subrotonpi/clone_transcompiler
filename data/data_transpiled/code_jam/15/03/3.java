@ Parameters public static String quaternionTable = new String [ ] {
  "uijknabc" , "inkbaucj" , "jcnibkua" , "kjancbiu" , "nabcuijk" , "aucjinkb" , "bkuajcni" , "cbiukjan" }
  ;
  /* Enter the number of characters to be used to encode the qubits table */
  public static int quaternionEncrypt ( char c ) {
    for ( int i = 0 ;
    i < 8 ;
    i ++ ) {
      if ( "uijknabc" . charAt ( i ) == c ) {
        return i ;
      }
    }
    /* Enter the number of characters to be used to encode the qubits table */
    return quaternionTable [ quaternionEncrypt ( char1 ) ] [ quaternionEncrypt ( char2 ) ] ;
  }
  public static String quaternionMult ( char char1 , char char2 ) {
    return quaternionTable [ quaternionEncrypt ( char1 ) ] [ quaternionEncrypt ( char2 ) ] ;
  }
  public static String quaternionStringProduct ( String inputString ) {
    String prod = "u" ;
    for ( int i = 0 ;
    i < inputString . length ( ) ;
    i ++ ) {
      prod = quaternionMult ( prod , inputString . charAt ( i ) ) ;
    }
    return prod ;
  }
  public static String quaternionStringPower ( String inputString , int n ) {
    String prod = quaternionStringProduct ( inputString ) ;
    int power = n % 4 ;
    String output = "u" ;
    for ( int i = 0 ;
    i < power ;
    i ++ ) {
      output = quaternionMult ( output , prod ) ;
    }
    return output ;
  }
  public static String stringTester ( String inputString , int power ) {
    String fullProduct = quaternionStringPower ( inputString , power ) ;
    if ( fullProduct != "n" ) {
      return "NO" ;
    }
    String testString = inputString . substring ( 0 , Math . min ( power , 8 ) ) ;
    String prod = "u" ;
    while ( testString . length ( ) != 0 ) {
      prod = quaternionMult ( prod , testString . charAt ( 0 ) ) ;
      testString = testString . substring ( 1 ) ;
      if ( prod . equals ( "i" ) ) {
        while ( testString