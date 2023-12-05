def import _readline
import readline
import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] , 'r' ) as sc :
            K = sc.read ( )
            a = 1
            b = 1
            for i in range ( K ) :
                tmp = a
                a += b
                b = tmp
            print ( a , b )
    class Scanner ( object ) :
        def __init__ ( self ) :
            self.fh = sys.stdin
        def readline ( self ) :
            return readline ( )
        def readline ( self ) :
            num = 0
            read = self.skip ( )
            while True :
                num = num * 10 + ( read - 0x30 )
                if read ( ) > 0x20 :
                    return num
            return readline ( self )
        def readline ( self ) :
            num = 0
            read = self.skip ( )
            while True :
                num = num * 10 + ( read - 0x30 )
                if read ( ) > 0x20 :
                    return num
            return readline ( self )
        def readline ( self ) :
            while True :
                yield readline ( self )
        def readline ( self ) :
            while True :
                yield readline ( self )
