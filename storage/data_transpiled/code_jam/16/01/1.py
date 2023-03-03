def _import ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import select
import sys
class A ( object ) :
    def __init__ ( self , f , * args , ** kwargs ) :
        self.f = f
        self.readline = None
        self.f = f
        self.readline = None
        self.f = open
        self.MAX_CASES = read_int ( )
        for casenum in range ( 1 , MAX_CASES + 1 ) :
            self.f.write ( "Case #%d: " % casenum )
            n = read_long ( )
            last = - 1
            seen = set ( )
            for i in range ( 1 , 1000 , 10 ) :
                curr = n * i
                last = curr
                while curr > 0 :
                    seen.add ( int ( curr % 10 ) )
                    curr /= 10
            if len ( seen ) < 10 :
                self.f.write ( "INSOMNIA\n" )
            else :
                self.f.write ( last )
        self.f.close ( )
    def read_int ( ) : return int ( read_int ( ) )
    def read_long ( ) : return long ( read_long ( ) )
    def read_float ( ) : return float ( read_float ( ) )
    def readline ( ) :
        while not readline or not readline :
            try :
                if not readline :
                    self.f.close ( )
                    sys.exit ( 0 )
                readline = readline.__next__
            except StopIteration :
                pass
        return readline
    def readline ( ) :
        readline = None
        try :
            return readline ( )
        except StopIteration :
            pass
        return None
