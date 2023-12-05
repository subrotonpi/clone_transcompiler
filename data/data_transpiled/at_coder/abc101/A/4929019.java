import collections ;
String S = input ( ) ;
Counter c = collections . Counter ( S ) ;
System . out . println ( c . get ( '+' , 0 ) - c . get ( '-' , 0 ) ) ;
}
