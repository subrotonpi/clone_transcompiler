@ Nonnull public static < T > List < T > list ( @ Nonnull final int n ) {
  final int [ ] l = new int [ n ] ;
  Arrays . fill ( l , - 1 ) ;
  final T root = new T ( ) {
    int a ;
    int b ;
    @ Override public T T T ( int a ) {
      if ( l [ a ] < 0 ) return a ;
      else {
        l [ a ] = root ( l [ a ] ) ;
      }
      return a ;
    }
    @ Override public void unite ( T a , int b ) {
      a = root ( a ) ;
      b = root ( b ) ;
      if ( a == b ) return ;
      if ( l [ a ] > l [ b ] ) a = b ;
      l [ a ] += l [ b ] ;
      l [ b ] = a ;
    }
  }
  ;
  final int n = Integer . parseInt ( input ( ) ) ;
  final int k = Integer . parseInt ( input ( ) ) ;
  final int l = Integer . parseInt ( input ( ) ) ;
  final T d = new T ( ) {
  }
  ;
  final T t = new T ( ) {
  }
  ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    int r = Integer . parseInt ( input ( ) ) ;
    int s = Integer . parseInt ( input ( ) ) ;
    d . unite ( r - 1 , s - 1 ) ;
  }
  for ( int i = 0 ;
  i < l ;
  i ++ ) {
    int r = Integer . parseInt ( input ( ) ) ;
    int s = Integer . parseInt ( input ( ) ) ;
    t . unite ( r - 1 , s - 1 ) ;
  }
  final Set < T > dSet = new TreeSet < T > ( ) ;
  final Set < T > tSet = new TreeSet < T > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    dSet . add ( d . root ( i ) ) ;
    tSet . add ( t . root ( i ) ) ;
  }
  List < T > ans = new ArrayList < T > ( ) ;
  final Map < T , Integer > cache = new HashMap < T , Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int rd = d . root ( i ) ;
    final int rt = t . root ( i ) ;
    if ( ( rd < rt ) || ( rt < rd ) ) ans . add ( cache . get ( new Integer (