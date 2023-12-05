def import import *
import sys
import string
import string
import sys
class Main ( object ) :
    class FastScanner ( Scanner ) :
        def __init__ ( self ) :
            try :
                f = sys.stdin
            except :
                sys.stdout = sys.stderr
            else :
                f = open ( self.filename , 'r' )
        def readline ( self ) :
            if self.line : return self.line
            try :
                s = f.readline ( )
            except :
                pass
            return s.strip ( )
        def __getitem__ ( self , i ) : return int ( self , i )
        def long ( self , i ) : return long ( self , i )
        def double ( self , i ) : return double ( self , i )
        def readline ( self ) :
            line = ''
            if self.line : line = self.line
            else : try : return line
            while self.line : line += ' ' + self.line
            return line
    def __call__ ( self , * args ) :
        sc = FastScanner ( * args )
        f = open ( self.filename , 'w' )
        s = sc.readline ( )
        k = len ( s )
        while k > 0 :
            if k >= 5 and s [ k - 5 : k ] == 'dream' :
                k -= 5
            elif k >= 7 and s [ k - 7 : k ] == 'dreamer' :
                k -= 7
            elif k >= 5 and s [ k - 5 : k ] == 'erase' :
                k -= 5
            elif k >= 6 and s [ k - 6 : ] == 'eraser' :
                k -= 6
            else :
                f.write ( 'NO' )
                f.close ( )
                return
        f.write ( 'YES' )
        f.close ( )
return Main
