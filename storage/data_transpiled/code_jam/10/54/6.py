def import _solve
import random
import locale
class D ( object ) :
    def __init__ ( self ) :
        self._solve = _solve
        self._solve = _solve
        self._solve = _solve
        self._solve = _solve
        self._large = False
    def run ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        try :
            FN = 'D-' + ( 'large' if self._large else 'small' )
            f = open ( FN + '.in' , 'r' )
            out = open ( FN + '.out' , 'w' )
            T = randint ( 1 , 10 )
            for i in range ( 1 , T + 1 ) :
                out.write ( 'Case #%d: ' % i )
                self.solve ( )
            out.close ( )
        except ( IOError , OSError ) :
            sys.exit ( 239 )
    def readline ( self ) :
        while not self._large or not self._large :
            try :
                self._large = raw_input ( self._large )
            except :
                eof = True
                return '0'
        return self._large
    def readline ( self ) :
        while self._large or not self._large :
            try :
                self._large = raw_input ( self._large )
            except :
                eof = True
                return '0'
        return self._large
    def readline ( self ) :
        while self._large or not self._large :
            try :
                self._large = raw_input ( self._large )
            except :
                eof = True
                return '0'
        return self._large
    def readline ( self ) :
        while self._large :
            try :
                self._large = raw_input ( self._large )
            except :
                eof = True
                return '0'
        return self._large
    def readline ( self ) :
        while self._large or self._large :
            try :
                self._large = raw_input ( self._large )
            except :
                eof = True
                return '0'
        return self._large