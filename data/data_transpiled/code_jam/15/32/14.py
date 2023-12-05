def import _typewriter_monkey
import sys
import os
import sys
class TypewriterMonkey ( object ) :
    def __init__ ( self ) :
        self.input = open ( sys.argv [ 1 ] )
        buffer = sys.stdin.readlines ( )
        max = int ( buffer.strip ( ) )
        for i in range ( 1 , max + 1 ) :
            print ( "Case #%d: %s" % ( i , solve ( buffer ) ) )
    def solve ( buffer ) :
        split = buffer.strip ( ).split ( "s+" )
        K , L , S = map ( int , split [ 0 : 2 ] )
        keys = buffer.strip ( ).split ( "" )
        target = buffer.strip ( ).split ( "" )
        differentStrings = int ( math.pow ( K , S ) )
        max = 0
        sum = 0
        for number in range ( differentStrings ) :
            result = ""
            for i in range ( S ) :
                result = result.ljust ( L )
                number /= K
            count = 0
            from_index = 0
            for line in result.split ( target , from_index ) :
                count += 1
            sum += count
            if count > max :
                max = count
        return 1.0 * max - 1.0 * sum / differentStrings
