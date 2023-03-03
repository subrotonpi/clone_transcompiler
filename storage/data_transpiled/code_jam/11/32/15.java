static final String solve ( ) throws IOException {
  BufferedReader inf = new BufferedReader ( new FileReader ( "in.txt" ) ) ;
  BufferedWriter ouf = new BufferedWriter ( new FileWriter ( "out.txt" ) ) ;
  /* close files */
  inf . close ( ) ;
  ouf . close ( ) ;
  /* precount */
  int printcounter = 0 ;
  /* print a string */
  printcounter ++ ;
  /* print >>> ouf */
  ouf . write ( "Case #" + printcounter + ": " + a ) ;
  /* solve test */
  String [ ] inp = inf . readLine ( ) . split ( " " ) ;
  int len = Integer . parseInt ( inf . readLine ( ) ) ;
  Arrays . sort ( inp ) ;
  Arrays . sort ( inp ) ;
  Arrays . reverse ( inp ) ;
  int sum = 0 ;
  for ( int i = 0 ;
  i < len ;
  i ++ ) sum += i ;
  int i = 0 ;
  int [ ] b = new int [ len ] ;
  Arrays . sort ( b ) ;
  Arrays . reverse ( b ) ;
  int alltime = ( n / c ) * sum * 2 ;
  for ( int j = 0 ;
  j < len ;
  j ++ ) {
    alltime += a [ j ] * 2 ;
  }
  if ( ( t >= alltime ) || l == 0 ) {
    /* print */
    printstr ( alltime ) ;
    return null ;
  }
  double ccc = t / ( sum * 2 ) ;
  double ttt = ccc * ( sum * 2 ) ;
  t = t - ttt ;
  n = n - ccc * c ;
  int i = 0 ;
  int [ ] arr = new int [ l ] ;
  while ( t >= a [ i ] * 2 ) {
    t -= a [ i ] * 2 ;
    ttt += a [ i ] * 2 ;
    i ++ ;
  }
  if ( t != 0 ) {
    arr [ i ] = a [ i ] - t * 0.5 ;
    i ++ ;
  }
  ttt += t ;
  if ( n < c ) {
    while ( i < n ) arr [ i ] = a [ i ] ;
    vse = 1 ;
  }
  else {
    while ( i < c ) arr [ i ] = a [ i ] ;
    i ++ ;
    vse = 0 ;
  }
  ccc = 0 ;
  if ( ! vse ) {
    n = n - c ;
    ccc = n / c ;
    n = n % c ;
    