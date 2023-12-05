public static String uniq ( String [ ] input ) {
  String un = input [ 0 ] ;
  for ( int i = 0 ;
  i < input . length - 1 ;
  i ++ ) {
    if ( ( input [ i ] . charAt ( 0 ) != input [ i + 1 ] . charAt ( 0 ) ) ) {
      un += input [ i + 1 ] ;
    }
  }
  /* fact */
  if ( input . length == 0 ) {
    return 1 ;
  }
  /* make sure we have a valid one */
  HashMap < String , Boolean > freechoice = new HashMap < String , Boolean > ( ) ;
  for ( String car : uniq ( input ) ) {
    for ( String i : car ) {
      if ( freechoice . containsKey ( i ) ) {
        return false ;
      }
    }
  }
  for ( String i : freechoice . keySet ( ) ) {
    if ( freechoice . get ( i ) ) {
      chains . put ( i , true ) ;
    }
  }
  /* print "Case #"+(t+1)+": "+(good*fact(chains.size())%1000000007); */
  int T = Integer . parseInt ( input [ 0 ] ) ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int ans = 0 ;
    int n = Integer . parseInt ( input [ 1 ] ) ;
    String [ ] cars = map ( uniq ( input [ 2 ] ) , n ) ;
    HashMap < String , Boolean > allsame = new HashMap < String , Boolean > ( ) ;
    ArrayList < String > diffs = new ArrayList < String > ( ) ;
    ArrayList < String > starts = new ArrayList < String > ( ) ;
    ArrayList < String > ends = new ArrayList < String > ( ) ;
    int mult = 1 ;
    for ( String i : cars ) {
      String c = i . substring ( 0 , i . length ( ) ) ;
      if ( i . indexOf ( c ) == i . length ( ) ) {
        if ( ! allsame . containsKey ( c ) ) {
          allsame . put ( c , 1 ) ;
        }
        else {
          allsame . put ( c , 1 ) ;
        }
      }
      else {
        diffs . add ( i ) ;
        starts . add ( i . substring ( 0 , i . length ( ) - 1 ) ) ;
        ends . add ( i . substring ( i . length ( ) - 1 ) ) ;
      }
    }
    for ( String i : allsame .