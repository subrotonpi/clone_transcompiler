def import import sys
import struct
import struct
class Main ( struct.Struct ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] , 'r' ) as sc :
            N = struct.unpack ( '>i' , sc.read ( 1 ) ) [ 0 ]
    cnts = [ ]
    for i in range ( 1 , N + 1 ) :
        cnts.append ( struct.unpack ( '>i' , sc.read ( 1 ) ) [ 0 ] )
    pairs = 0
    for i in range ( 1 , N + 1 ) :
        if cnts [ i - 1 ] > 0 and cnts [ i ] > 0 :
            pairs += 1
            cnts [ i - 1 ] -= 1
            cnts [ i ] -= 1
        pairs += cnts [ i ] / 2
        cnts [ i ] %= 2
    out ( pairs )
