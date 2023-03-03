def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.idx = self.idx
        self.to = self.to
        is_red = self.c == 'r'
class Node :
    e = [ ]
class Main ( object ) :
    def __init__ ( self ) :
        self.node = [ ]
    def main ( self ) :
        sc = _main ( )
        N = sc.regs [ 0 ]
        M = sc.regs [ 1 ]
        self.node = [ Node ( ) for i in range ( N ) ]
        for i in range ( M ) :
            a = sc.regs [ 0 ] - 1
            b = sc.regs [ 1 ] - 1
            c = sc.regs [ 1 ]
            self.node [ a ].e.append ( ( i , b , c ) )
            self.node [ b ].e.append ( ( i , a , c ) )
        self.color = [ ]
        self.used = [ ]
        for i in range ( N ) :
            if self.check ( i , True ) or self.check ( i , False ) :
                print ( "Yes" )
                return
        print ( "No" )
    def check ( self , idx , red ) :
        [ color , used ] = [ ]
        if self.color [ idx ] :
            if self.used [ idx ] :
                return True
            for i in range ( M ) :
                if not self.used [ i ] :
                    return False
            return True
        def dfs ( self , idx , is_red ) :
            if self.color [ idx ] :
                add = self.color [ idx ] != add
            self.color [ idx ] |= self.color [ idx ]
            for i in range ( len ( self.node [ idx ].e ) ) :
                if not self.used [ i ] :
                    return False
        return True
return Main
