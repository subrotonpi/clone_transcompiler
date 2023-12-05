def _import ( ) : return _import ( )
import sys
import os
import sys
import os
import string
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        N = sc.randint ( 0 , N )
        ans = solve ( )
        print ( len ( ans ) )
        f = sys.stdout.write
        for edge in ans :
            print ( edge.a , edge.b )
        f.flush ( )
    def write ( self , * args ) :
        if self.N % 2 == 0 :
            return self.even ( )
        else :
            return self.odd ( )
    def odd ( self ) :
        edge = [ ]
        for i in range ( 1 , N + 1 ) :
            for j in range ( i + 1 , N + 1 ) :
                if i + j != N + 1 :
                    edge.append ( ( i , j ) )
            edge.append ( ( i , N ) )
        return edge
    def even ( self ) :
        edge = [ ]
        for i in range ( 1 , N + 1 ) :
            for j in range ( i + 1 , N + 1 ) :
                if i + j != N + 1 :
                    edge.append ( ( i , j ) )
        return edge
    def write ( self , * args ) :
        print ( "\n" , end = "" )
    def readline ( self ) :
        return next ( self )
    def readline ( self ) :
        if self._import _readline or not self._readline :
            try :
                return next ( self )
            except StopIteration :
                raise StopIteration
        return readline ( self )
