def _ ( ) : return sys.stdin.read ( )
import time
import sys
class Factory ( object ) :
    def solve ( self ) :
        n = self.n
        know = [ [ ] for i in range ( n ) ]
        for s in self.read ( ) :
            for j in range ( n ) :
                know [ s [ j ] ] = s [ j ] == '1'
        return int ( s )
    def solve ( self ) :
        return lambda x : x
    def parse ( self , fname ) :
        try :
            f = open ( fname )
        except IOError :
            pass
        else :
            for line in f :
                try :
                    know [ s [ i ] ] = line == ''
                except IndexError :
                    pass
            return f.readline ( )
    min = int ( sys.maxint )
    for mask in range ( ( 1 << ( n ** 2 ) ) ) :
        teach = [ ]
        cost = 0
        for i in range ( n ) :
            for j in range ( n ) :
                teach [ i ] [ j ] = ( ( mask >> ( i * n + j ) ) & 1 ) == 1
                if teach [ i ] [ j ] and not know [ i ] [ j ] :
                    cost += 1
                teach [ i ] [ j ] |= know [ i ] [ j ]
        if ok ( teach ) :
            min = min ( min , cost )
    print ( min )
if not ok ( can ) :
    n = len ( can )
    used_people , used_machines = [ ] , [ ]
    self.can = can
    return go ( 0 )
def go ( pos ) :
    if pos == n :
        return True
    for person in range ( 1 , n ) :
        if not used_people [ person ] :
            can_continue = False
            for machine in range ( n ) :
                if not used_machines [ machine ] and can [ person ] [ machine ] :
                    used_people [ person ] = True
                    used_machines [ machine ] = True
                    can_continue = True
                    if not go ( pos + 1 ) :
                        return False
                    used_people [ person ] = False
                    used_machines [