def import _main
class Main ( object ) :
    def __init__ ( self , k , n ) :
        self.k = k
        self.n = n
    def search ( self , answer , a ) :
        if a < k :
            for i in range ( 1 , 3 ) :
                self.answer [ a ] = i
                if self.search ( answer , a + 1 ) :
                    return True
            return False
        kouho = [ ]
        for i in range ( n ) :
            total_length = 0
            for j in v [ i ] :
                t = self.answer [ j ] - '1'
                total_length += t
            if total_length != len ( self.w [ i ] ) :
                return False
        for i in range ( n ) :
            c = 0
            for j in v [ i ] :
                u = j - '1'
                t = self.answer [ u ]
                cut = self.w [ i ] [ c : c + t ]
                if not kouho [ u ] :
                    kouho [ u ] = cut
                elif cut not in kouho [ u ] :
                    return False
                c += t
        self.answer = kouho
        return True
    def main ( self ) :
        with open ( self.input , "r" ) as scan :
            self.k = scan.read ( )
            self.n = scan.read ( )
            self.v = [ ]
            self.w = [ ]
            for i in range ( n ) :
                self.answer.append ( scan.read ( ) )
        self.answer = [ ]
        self.answer = [ 1 ]
        if self.search ( self.answer , 0 ) :
            for s in self.answer :
                print ( s )
        else :
            raise SystemExit
