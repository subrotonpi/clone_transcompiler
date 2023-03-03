def import sys , out
import Queue
import Queue
import sys
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = sys.stdin
        q = Queue.Queue ( )
        s = sc.readline ( ).split ( )
        for i , c in enumerate ( s ) :
            if c == 'R' :
                t = '>'
            elif c == 'L' :
                t = '<'
            else :
                t = 'A'
            out.write ( t )
            if i < len ( s ) - 1 :
                out.write ( " " )
        out.write ( "\n" )
