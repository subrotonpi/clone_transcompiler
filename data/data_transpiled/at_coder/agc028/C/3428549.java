static final String getSolution ( ) throws IOException {
  final String testCase = "N551J" ;
  if ( testCase . contains ( "F551C" ) ) {
    testCase = "c1.in" ;
    System . setIn ( new FileInputStream ( testCase ) ) ;
  }
  {
    final Scanner input = new Scanner ( System . in ) ;
    final String [ ] inputArr = input . nextLine ( ) . split ( " " ) ;
    final int n = input . nextInt ( ) ;
    final List < Integer > inputIntList = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      inputIntList . add ( i ) ;
    }
    final int i = input . nextInt ( ) ;
    final List < String > inputStrList = new ArrayList < > ( ) ;
    for ( String s : inputStrList ) {
      inputStrList . add ( s ) ;
    }
    final String s = input . nextLine ( ) ;
    final int n = input . nextInt ( ) ;
    final List < Integer > rows = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      rows . add ( i ) ;
    }
    final List < Integer > a = new ArrayList < > ( ) ;
    final List < Integer > b = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      rows . add ( i ) ;
    }
    final List < Integer > a = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      a . add ( i ) ;
    }
    final List < Integer > b = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      b . add ( i ) ;
    }
    int res = Integer . valueOf ( a . get ( i ) ) ;
    res = Math . min ( res , Integer . valueOf ( b . get ( i ) ) ) ;
    final List < Integer > allValues = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      allValues . add ( new Integer ( a . get ( i ) ) ) ;
    }
    final List < Integer > firstValues = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      firstValues . add ( new Integer ( allValues . get ( i ) ) ) ;
    }
    final List < Integer > s = new ArrayList