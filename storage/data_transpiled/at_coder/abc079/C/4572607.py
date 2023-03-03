def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import time
import tokenize
class Main ( readline ) :
    def __init__ ( self ) :
        sc = readline ( )
        for line in sc.readline ( ).split ( ) :
            a = [ ]
    def readline ( self ) :
        return next ( sc )
    def readline ( self ) :
        return readline ( )
    def readline ( self ) :
        return next ( sc )
    def readline ( self ) :
        return readline ( self )
    def stop ( self ) :
        self.stop ( )
    def select ( self , result ) :
        for line in result :
            if not line :
                self.stop ( )
    def result ( self ) :
        return result
    def select ( self , result ) :
        for line in result :
            if line.startswith ( '#' ) :
                s = line [ 4 : ]
                if s == '' :
                    s = s
                elif s == '' :
                    s = '-'.join ( s )
                elif s == '' :
                    s = '+'.join ( s )
                else :
                    s = s + '=7'
                break
    print ( '\n'.join ( result ) )
class Scanner ( object ) :
    def __init__ ( self , stream = None , readline = None ) :
        self.stream = stream
        readline = None
        self.close = None
    def readline ( self ) :
        if not stream or not readline :
            try :
                readline ( self )
            except EOFError :
                pass
    def select ( self , result ) :
        for line in result :
            line = line.rstrip ( )
            if line :
                if not line :
                    break
            else :
                if line [ - 1 : ] == '\n' :
                    line = line [ : - 1 ]
return Scanner
