def import import math
import math
import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.N = sc.randint ( 0 , N )
        heights = [ ]
        height_to_number = { }
        for i in range ( N ) :
            heights.append ( sc.randint ( 0 , N ) )
            height_to_number [ heights [ i ] ] = i
        heights = [ i for i in heights if i ]
    def run ( self ) :
        for i in range ( N - 1 , - 1 , - 1 ) :
            print ( height_to_number [ heights [ i ] ] + 1 )
