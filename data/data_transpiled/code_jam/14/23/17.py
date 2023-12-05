def import _readline
import sys
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.N = N
        self.connected = [ ]
        self.city = [ ]
        self.res = None
    def search ( self , order , used , index ) :
        if index == N :
            ban = [ ]
            outer :
            for i in range ( 1 , N ) :
                for j in range ( i - 1 , - 1 , - 1 ) :
                    if not ban [ j ] and self.connected [ order [ i ] ] [ order [ j ] ] :
                        continue outer
                    else :
                        ban [ j ] = True
            return
        order = [ ]
        for c in order :
            order.append ( self.city [ c ] )
        value = ''.join ( order )
        if not res or value < res :
            res = value
        return
    for i in range ( N ) :
        if not used [ i ] :
            used [ i ] = True
            self.order [ index ] = i
            search ( self , used , index + 1 )
            used [ i ] = False
    def solve ( self ) :
        res = None
        self.order = [ ]
        self.used = [ ]
        self.search ( self.order , used , 0 )
        return res
    def readline ( self ) :
        f = open ( self.filename , 'r' )
        self.tokens = f.readlines ( )
        f.close ( )
        for task_index in range ( 1 , task_count + 1 ) :
            N , M = self.tokens [ task_index ]
            self.city = [ self.city [ i ] for i in range ( N ) ]
            self.connected = [ [ ] for i in range ( M ) ]
        print ( 'Case #%d: %s' % ( task_index , solve ( self ) ) )
class Main ( object ) :
    def __init__ ( self ) :
        self.tokens = f.readlines ( )
    def readline ( self ) :
        f = open ( self.filename , 'r' )
        self.tokens = f.readlines ( )
        f.close ( )
return Main
