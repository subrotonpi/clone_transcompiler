def _import ( ) : return sys.stdin.read ( )
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import random
class Main ( tokenize.Grammar ) :
    def __next__ ( self ) :
        if not tokenize.NL or not tokenize.COMMENT :
            try :
                return next ( tokenize.next ( ) )
            except StopIteration :
                raise StopIteration
        return next ( tokenize.next ( ) )
    def __next__ ( self ) :
        return int ( next ( ) )
    def __next__ ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( next ( ) )
        return a
    def __next__ ( self ) :
        return next ( tokenize.next ( ) )
    def __next__ ( self ) :
        return next ( tokenize.next ( ) )
    def __next__ ( self ) :
        return next ( tokenize.next ( ) )
    def __next__ ( self ) :
        return next ( tokenize.next ( ) )
    def __next__ ( self ) :
        return next ( tokenize.next ( ) )
    def __next__ ( self ) :
        return next ( tokenize.next ( ) )
    def __next__ ( self ) :
        return next ( iter ( self ) )
global _solve
_solve = minimize ( 0 , next ( _solve ) , _solve.isOk )
def _calc_total_cost ( cost ) :
    total = 0
    under = 0
    for a , d in zip ( A , D ) :
        times = _maximize ( 0 , K + 1 , lambda n : d * n + a < cost ) + 1
        under += times
        total += times * ( times - 1 ) / 2 * d + times * a
    total += ( K - under ) * cost
    return total
from tokenize.next import __next__
_solve = __next__
from itertools import chain
for i in chain ( _solve , _solve ) :
    yield i
