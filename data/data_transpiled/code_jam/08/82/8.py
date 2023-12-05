def import _random
import random
import sys
import random
import sys
class fence_small ( object ) :
    def __init__ ( self ) :
        self._random = random
    def __call__ ( self , * args , ** kwargs ) :
        if not self._random :
            self._random = random
    def __call__ ( self , * args , ** kwargs ) :
        self._random = random.randrange ( self._random )
    def solve ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        try :
            f = open ( FNAME + '.in' , 'r' )
            out = open ( FNAME + '.out' , 'w' )
            self._solve ( )
            out.close ( )
        except ( IOError , OSError ) :
            sys.exit ( 566 )
    def __next__ ( self ) :
        while not self._random or not self._random :
            try :
                self._random = random.randrange ( self._random )
            except :
                eof = True
                return '0'
        return self._random.choice ( self._random )
    def __next__ ( self ) :
        while self._random or not self._random :
            try :
                self._random = random.randrange ( self._random )
            except :
                eof = True
                return '0'
        return self._random.choice ( self._random )
    def __next__ ( self ) :
        return self._random.choice ( self._random )
    FNAME = 'fence1'
    class Offer :
        def __init__ ( self , randint , i , j ) :
            self.c = randint
            self.a = i
            self.b = j
        def __next__ ( self ) :
            return self._random.choice ( self._random )
    def solve ( self ) :
        testn = random.randrange ( self._random )
        for test in range ( testn ) :
            print ( 'Case #%d: ' % ( test + 1 ) , end = '' )
            n = self._random.randrange ( self._random )
            a = [ offer