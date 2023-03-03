static final String nextLine ( ) {
  /* Enter the input string to print the line */
  int W = Integer . parseInt ( readLine ( ) ) ;
  int Ln = Integer . parseInt ( readLine ( ) ) ;
  int Un = Integer . parseInt ( readLine ( ) ) ;
  int G = Integer . parseInt ( readLine ( ) ) ;
  int L [ ] = new int [ Ln ] ;
  for ( int each = 0 ;
  each < L . length ;
  each ++ ) L [ each ] = Integer . parseInt ( readLine ( ) ) ;
  int U [ ] = new int [ Un ] ;
  for ( int each = 0 ;
  each < U . length ;
  each ++ ) U [ each ] = Integer . parseInt ( readLine ( ) ) ;
  /* Get y */
  int i = 0 ;
  while ( i + 2 < P . length && P [ i + 1 ] . x <= qx ) i ++ ;
  int x0 = P [ i ] ;
  int y0 = P [ i + 1 ] ;
  int x1 = P [ i + 2 ] ;
  int y1 = P [ i + 3 ] ;
  /* Get the area */
  ArrayList < Integer > xs = new ArrayList < Integer > ( ) ;
  for ( i = 0 ;
  i < L . length ;
  i ++ ) xs . add ( L [ i ] ) ;
  for ( i = 0 < U . length ;
  i ++ ) xs . add ( U [ i ] ) ;
  xs . add ( left ) ;
  xs . add ( right ) ;
  SortedSet < Integer > set = new TreeSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < U . length ;
  i ++ ) {
    if ( left - 1e-9 <= i && left + 1e-9 <= right ) {
      set . add ( left ) ;
    }
  }
  /* Get the area */
  double totalArea = getArea ( 0 , W ) ;
  double sliceArea = totalArea / ( double ) G ;
  double [ ] cuts = new double [ T ] ;
  while ( cuts . length < G ) {
    double low = cuts [ cuts . length - 1 ] ;
    double high = W ;
    for ( int i = 0 ;
    i < 50 ;
    i ++ ) {
      double mid = ( low + high ) / 2 ;
      if ( getArea ( cuts [ cuts . length - 1 ] , mid ) > sliceArea ) high = mid ;
      else low = mid ;
    }
    cuts [ 0 ] = mid ;
    System .