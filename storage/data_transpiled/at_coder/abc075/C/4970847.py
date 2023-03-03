def import _unionfind
class Main ( object ) :
    def __init__ ( self , n ) :
        self.parent = [ ]
        self.rank = [ ]
        self.size = [ ]
        for i in range ( 1 , n + 1 ) :
            self.set ( i )
    def __init__ ( self , n ) :
        self.parent.append ( n )
        self.rank.append ( 0 )
        self.size.append ( 1 )
    def find ( self , i ) :
        if i == self.parent [ i ] :
            return self.parent [ i ]
        else :
            return self.parent [ i ] = self.find ( self.parent [ i ] )
    def unite ( self , x , y ) :
        xroot = self.find ( x )
        yroot = self.find ( y )
        if xroot == yroot :
            return
        if self.rank [ xroot ] > self.rank [ yroot ] :
            self.parent [ yroot ] = xroot
            self.size [ xroot ] += self.size [ yroot ]
        elif self.rank [ xroot ] < self.rank [ yroot ] :
            self.parent [ xroot ] = yroot
            self.size [ yroot ] += self.size [ xroot ]
        else :
            self.parent [ yroot ] = xroot
            self.size [ xroot ] += self.size [ yroot ]
            self.rank [ xroot ] += 1
    def getnumber ( self ) :
        return self.size [ self.find ( self ) ]
def main ( ) :
    with open ( "/tmp/main.txt" , "r" ) as sc :
        N = sc.read ( )
        M = sc.read ( )
        a = [ ]
        b = [ ]
        ans = 0
        for i in range ( M ) :
            a.append ( sc.read ( ) )
            b.append ( sc.read ( ) )
        for i in range ( M ) :
            u = Unionfind ( N )
            for j in range ( M ) :
                if j != i :
                    u.unite ( a [ j ] , b [ j ] )