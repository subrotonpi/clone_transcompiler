public static final Copyable < Circle > circle = new Copyable < Circle > ( ) {
  public Circle circle ( ) {
    return circle ( ) ;
  }
  public Circle ( ) {
    return circle ( ) ;
  }
  public Circle ( ) {
    int numcircle = numcircle ;
    int til = 0 ;
    int cansee = amountOfCan ;
    int times = 1 ;
    public Circle ( ) {
      int a = numcircle . length - num ;
      int b = numcircle . length - num ;
      return b + a ;
    }
  }
  public Circle ( ) {
    return circle ( ) ;
  }
  public int [ ] supAnd ( String str1 , String str2 , int length ) {
    int count = 0 ;
    for ( int x = 0 ;
    x <= length ;
    x ++ ) {
      str1 . charAt ( x ) = str1 . charAt ( x ) == 'x' || str2 . charAt ( x ) == 'x' ;
      count += str1 . charAt ( x ) ;
    }
    return count ;
  }
  public Circle [ ] search ( Circle circlelist , int length , TV tv ) {
    List < Circle > list1 = new ArrayList < Circle > ( ) ;
    for ( int x = circlelist . til + 1 ;
    x <= length ;
    x ++ ) {
      Circle circlelist2 = new Circle ( circlelist ) ;
      circlelist2 . cansee = supAnd ( circlelist2 . numcircle , tv . rightRotation ( x , length ) , length ) ;
      circlelist2 . til = x ;
      circlelist2 . times ++ ;
      list1 . add ( circlelist2 ) ;
    }
    return list1 . toArray ( new Circle [ 0 ] ) ;
  }
}
public Circle [ ] search ( Circle circlelist , int length , Card tv ) {
  List < Circle > list1 = new ArrayList < Circle > ( ) ;
  for ( int x = 0 ;
  x < circlelist . til ;
  x ++ ) {
    if ( x == 'x' ) {
      numcircle . add ( 0 ) ;
    }
    else {
      numcircle . add ( 1 ) ;
      amountOfCan ++ ;
    }
  }
  int length = numcircle . size ( ) ;
  if ( amountOfCan == length ) {
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  else {
    Circle circlelist = circle ( numcircle , amountOfCan ) ;
    List < Circle > alllist1 = new ArrayList < Circle > ( ) ;
    alllist1 . add ( circlelist ) ;
    TV = new Card ( ) ;
    do {
      List < Circle > alllist2 = new ArrayList < Circle > ( ) ;
      while ( alllist1 . size ( )