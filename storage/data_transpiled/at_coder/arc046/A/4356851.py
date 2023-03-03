def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        Scanner ( ).__init__ ( self )
        n = sc.nextInt ( )
        if n % 9 == 0 :
            a ( str ( 9 ) , n // 9 )
        else :
            a ( str ( n % 9 ) , ( n + 8 ) // 9 )
    def a ( s , i ) :
        for j in range ( i ) :
            sys.stdout.write ( s )
        sys.stdout.write ( "\n" )
