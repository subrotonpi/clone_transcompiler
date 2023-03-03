def import _main
class Main ( object ) :
    class Tree :
        def __init__ ( self , to , rev ) :
            self.to , self.rev = to , rev
    global V
    global G
    global root
    global p
    def tree ( a , b ) :
        self.V = len ( a ) + 1
        p = [ ]
        G = [ [ ] for i in range ( V ) ]
        for i in range ( V - 1 ) :
            G [ a [ i ] ].append ( ( b [ i ] , len ( G [ b [ i ] ] ) ) )
            G [ b [ i ] ].append ( ( a [ i ] , len ( G [ a [ i ] ] ) - 1 ) )
        self.setRoot ( 0 )
    def setRoot ( root ) :
        self.root = root
        self.setRoot ( root , - 1 )
    def setRoot ( cur , parent ) :
        p [ cur ] = parent
        for i in G [ cur ] :
            next = i.to
            if next != parent :
                self.setRoot ( next , cur )
    def firstWin ( ) :
        lst = [ ]
        for i in G [ cur ] :
            next = i.to
            if next != p [ root ] :
                cb = branchLength ( next )
                if cb < 0 : return True
                else : lst += cb
        if len ( lst ) >= 2 : return - 1
        elif len ( lst ) == 1 : return 0
        else : return 1
    def branchLength ( cur ) :
        lst = [ ]
        for i in G [ cur ] :
            next = i.to
            if next != p [ cur ] :
                cb = branchLength ( next )
                if cb < 0 : return True
                else : lst += cb
        return lst
