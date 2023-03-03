def import _readline
import sys
class B ( object ) :
    def __init__ ( self ) :
        super ( B , self ).__init__ ( )
        self._readline = _readline
        self._readline = _readline
        self._eof = False
        self._large = True
    def run ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        try :
            FN = 'B-%d' % ( 'large' if self._large else 'small' )
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
        while not self._eof :
            try :
                self._readline = f.readline ( )
            except :
                eof = True
                return '0'
        return self._readline
    def readline ( self ) :
        while not self._eof :
            try :
                self._readline = f.readline ( )
            except :
                eof = True
                return '0'
        return self._readline
    def readline ( self ) :
        while self._eof :
            try :
                self._readline = f.readline ( )
            except :
                eof = True
                return '0'
        return self._readline
    def readline ( self ) :
        while self._eof :
            self._readline = f.readline ( )
        return self._readline
    def readline ( self ) :
        while self._eof :
            self._readline = f.readline ( )
        return self._readline
    def readline ( self ) :
        while self._eof :
            self._readline = f.readline ( )
        return self._readline
