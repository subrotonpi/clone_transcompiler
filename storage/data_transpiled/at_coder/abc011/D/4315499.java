public static final double factorialCalc ( int num ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  int x = Integer . parseInt ( input . nextLine ( ) ) ;
  int y = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( x % d != 0 || y % d != 0 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  int x_times = Math . abs ( x ) / d ;
  int y_times = Math . abs ( y ) / d ;
  int nokori = n - x_times - y_times ;
  if ( nokori < 0 || nokori % 2 == 1 ) {
    System . out . println ( 0 ) ;
    exit ( ) ;
  }
  double ans = 0 ;
  double teisu = 1 ;
  double keta = 0 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    teisu = ( teisu * i ) / 4 ;
    if ( teisu > 10 * 10 ) {
      teisu = teisu / ( 10 * 10 ) ;
      keta = keta + 10 ;
    }
  }
  /* factorialCalc(num) */
  double res = 1 ;
  double keta1 = 0 ;
  for ( int i = 1 ;
  i <= num ;
  i ++ ) {
    res = res * i ;
    if ( res > 10 * 10 ) {
      res = res / ( 10 * 10 ) ;
      keta1 = keta1 + 10 ;
    }
  }
  /* keta1 = 1; keta1 = 0; for(int i=1;i<=num;i++){res=res*i;if(res>10*10){res=res/(10*10);keta1=keta1+10;}}/* print(ans*teisu); */
  for ( int nokoriXTimes = 0 ;
  nokoriXTimes <= nokori ;
  nokoriXTimes += 2 ) {
    ans = ans + ( 10 * ( keta - ketaCalc ( nokoriXTimes / 2 ) - ketaCalc ( x_times + nokoriXTimes / 2 ) - ketaCalc ( y_times + ( nokori - nokoriXTimes ) / 2 ) ) ) / factorialCalc ( nokori @ @