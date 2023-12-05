def import import sys , string , traceback
import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        s = sys.stdin
        n = len ( args )
        v = list ( args )
        a = [ 0 ] * n
        b = [ 0 ] * n
        [ v , i ] = s.randint ( - 1 , 1 )
        [ a , i ] = s.randint ( + 1 , 1 )
        [ b , i ] = s.randint ( n - i , 1 )
        for i in range ( 1 , n ) :
            for j in v [ i ] : a [ j ] += i
            for j in v [ i ] [ : - 1 ] : b [ j ] += i
        print ( string.join ( a ) )
        print ( string.join ( b ) )
