def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        try :
            with open ( sys.argv [ 1 ] ) as f :
                count = f.read ( )
            print ( IntStream ( count ).min ( ).value )
        except :
            print ( "No such file or directory" )
    def devide2count ( number ) :
        result = 0
        while number % 2 == 0 :
            number = number // 2
            result += 1
        return result
