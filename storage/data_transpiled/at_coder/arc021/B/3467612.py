def import _readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        fc = sys.stdin
        L = fc.recv_handle ( )
        B = fc.recv_handle ( )
        ans = solve ( )
        if ans is None :
            print ( - 1 )
        else :
            f = sys.stdout
            for i in ans :
                f.write ( i )
            f.flush ( )
    def solve ( ) :
        A = [ B [ 0 ] ]
        for i in range ( 1 , L - 1 ) :
            A [ i + 1 ] = A [ i ] ^ B [ i ]
        if ( A [ L - 1 ] ^ B [ L - 1 ] ) == A [ 0 ] :
            return A
        else :
            return None
    @ property
    def readline ( self ) :
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                self.stdin.readline ( )
            except EOFError :
                self.stdin.close ( )
        return self.stdin.readline ( )
    def readline ( self ) :
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                self.stdin.readline ( )
            except EOFError :
                self.stdin.close ( )
        return self.stdin.readline ( )
    def readline ( self ) :
        if self.stdin is None or not self.stdin.readline ( ) :
            try :
                return self.stdin.readline ( )
            except EOFError :
                self.stdin.close ( )
        return self.stdin.readline ( )
    def readline ( self ) :
        return long ( self.stdin.readline ( ) )
    def readline ( self ) :
        return int ( self.stdin.readline ( ) )
    def readline ( self ) :
        return int ( self.stdin.readline ( ) )
return Main
