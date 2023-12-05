def import _sys , sys , traceback
class B ( object ) :
    def __init__ ( self , sc , stdout ) :
        self.sc = sc
        self.stdout = stdout
        self.N , self.C , self.M = self.N , self.C , self.M
    class Item ( object ) :
        def __init__ ( self , p , b ) :
            self.P = p
            self.B = b
        def __lt__ ( self , o ) :
            if self.P != o.P : return cmp ( self.P , o.P )
            return cmp ( self.B , o.B )
        def __repr__ ( self ) :
            return 'Item{' + 'P=' + str ( self.P ) + ', B=' + str ( self.B ) + '}'
    items = [ ]
    def can ( self , layers ) :
        vacant , curPos = 0 , 0
        used = [ ]
        miss = 0
        for item in items :
            if curPos < item.P :
                vacant += ( item.P - curPos ) * layers
                curPos = item.P
            vacant -= 1
            used.append ( 1 )
            if vacant < 0 : return - 1
            if used [ item.P ] > layers : miss += 1
        return miss
    def solve ( self ) :
        self.N , self.C , self.M = self.N , self.C , self.M
        items = [ Item ( self.sc , self.N ) for self in self.C ]
        byCustomer = [ ]
        for i in range ( self.M ) :
            items.append ( Item ( self.sc , self.N ) )
            byCustomer [ items [ i ].B ] += 1
        rides = 0
        for a in byCustomer :
            rides = max ( a , rides )
        items.sort ( )
        while can ( rides ) == - 1 :
            rides += 1
        miss = can ( rides )
        return '%d %d' % ( rides , miss )
    def run ( self ) :
        t = self.t
        for i in range ( 1 , t + 1 ) :
            res = solve ( self )
            self