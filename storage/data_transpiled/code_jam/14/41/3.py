def _import ( ) : return int ( next ( sys.stdin ) )
import sys
from itertools import chain
def _solve ( ) :
    n = next ( sys.stdin )
    x = next ( sys.stdin )
    a = [ next ( sys.stdin ) ]
    a.sort ( )
    res = 0
    used = [ False ] * n
    for i in range ( n - 1 , - 1 , - 1 ) :
        if not used [ i ] :
            res += 1
            j = i - 1
            while j != - 1 and ( used [ j ] or a [ j ] + a [ i ] > x ) :
                j -= 1
            if j != - 1 :
                used [ j ] = True
    sys.stdout.write ( res )
def _solve ( ) :
    test_number = next ( sys.stdin )
    for test in range ( 1 , test_number + 1 ) :
        sys.stderr.write ( '%d\n' % test )
        _solve ( )
def _runIO ( ) :
    f = open ( 'A.in' , 'r' )
    out = open ( 'A.out' , 'w' )
    _solve ( )
    out.close ( )
class _solve ( ) :
    def _readline ( self , f ) :
        try :
            f.readline ( )
        except IOError :
            pass
        else :
            return
    def _runIO ( self , f ) :
        try :
            f.readline ( )
        except IOError :
            pass
        else :
            return
    def _runIO ( self , f ) :
        try :
            f.readline ( )
        except IOError :
            pass
        else :
            return
    def _runIO ( self , f ) :
        try :
            f.readline ( )
        except IOError :
            pass
        else :
            return
    def _runIO ( self , f ) :
        try :
            f.readline ( )
        except IOError :
            pass
        else :
            return
return _solve
