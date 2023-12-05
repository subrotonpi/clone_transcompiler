def import _search_tree
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.M = sys.maxint
        self.alist = [ ]
        self.p = [ ]
        for i in range ( self.N ) :
            self.alist.append ( i + 1 )
        for i in range ( self.M ) :
            self.p.append ( ( self.n , self.n ) )
        cnt = 0
        while len ( self.alist ) != 0 :
            isTrue = self.search_tree ( self.alist [ 0 ] )
            if isTrue :
                cnt += 1
        print ( cnt )
    def next_leaf ( self , n ) :
        for i in range ( len ( self.p ) ) :
            if self.p [ i ] [ 0 ] == n :
                num = int ( self.p [ i ] [ 1 ] )
                self.p [ i ].move ( - 1 , - 1 )
                return num
            elif self.p [ i ] [ 1 ] == n :
                num = int ( self.p [ i ] [ 0 ] )
                self.p [ i ].move ( - 1 , - 1 )
                return num
        return - 1
    def search_tree ( self ) :
        if self.p in self.alist :
            self.alist.remove ( self.p [ 0 ] )
        else :
            return False
    def search_tree ( self ) :
        if self.p in self.alist :
            self.alist.remove ( self.p [ 0 ] )
        else :
            return False
    def search_tree ( self ) :
        if self.p in self.alist :
            self.alist.remove ( self.p [ 0 ] )
        else :
            return False
    def search_tree ( self ) :
        if self.p in self.alist :
            self.alist.remove ( self.p )
        else :
            return False
    def search_tree ( self ) :
        return True
    def search_tree ( self ) :
        return search_tree ( self )
