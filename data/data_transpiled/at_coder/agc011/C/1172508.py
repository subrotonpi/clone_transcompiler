def _ import _ , SPACETOKEN sys.exit ( ) : pass
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.solve ( )
    def solve ( self ) :
        try :
            with open ( '/proc/self/loop' ) as f :
                n , m = self.n , self.m
                edge = [ [ ] for _ in range ( n ) ]
                for i in range ( m ) :
                    u , v = self.n - 1 , self.m - 1
                    edge [ u ].append ( v )
                    edge [ v ].append ( u )
            self.ok = [ - 1 ] * n
            c1 , c2 , c3 = 0 , 0 , 0
            for i in range ( n ) :
                if self.ok [ i ] != - 1 : continue
                x = self.dfs ( i , 0 )
                if x.c == 1 : c1 += 1
                elif not x.b : c2 += 1
                else : c3 += 1
            print ( c1 ** 2 + 2 * c1 * ( n - c1 ) + 2 * c2 ** 2 + 2 * c2 * c3 + c3 ** 2 )
    def dfs ( p , b ) :
        self.ok.append ( b )
        x = { 'c' : 1 , 'b' : False }
        for n in edge [ p ] :
            if self.ok [ n ] == - 1 :
                t = self.dfs ( n , 1 - b )
                x [ 'c' ] += t [ 'c' ]
                x [ 'b' ] |= t [ 'b' ]
            else :
                x [ 'b' ] |= b == self.ok [ n ]
        return x
    def tr ( self , * x ) :
        print ( "".join ( map ( str , x ) ) , file = sys.stderr )
    Note :./ Main._ _ uses _ unicode _ or _ unsafe.operations.Note : Recompile SPACETOKEN with SPACETOKEN - Xlint : unchecked SPACETOKEN for SPACETOKEN details."
