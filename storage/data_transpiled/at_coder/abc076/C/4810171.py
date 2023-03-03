def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin.read ( ).decode ( 'utf-8' )
        self.t = sys.stdin.read ( ).decode ( 'utf-8' )
        flag = False
        i = len ( self.s ) - len ( self.t )
        for i in range ( len ( self.s ) - len ( self.t ) , - 1 , - 1 ) :
            flag = True
            for j in range ( len ( self.t ) ) :
                if not ( self.s [ i + j ] == '?' or self.s [ i + j ] == self.t [ j ] ) :
                    flag = False
                    break
            if flag : break
        if flag :
            for j in range ( len ( self.s ) ) :
                if self.s [ j ] == '?' :
                    if i <= j and j < i + len ( self.t ) :
                        self.s [ j ] = self.t [ j - i ]
                    else :
                        self.s [ j ] = 'a'
            print ( str ( self.s ) )
        else :
            print ( 'UNRESTORABLE' )
