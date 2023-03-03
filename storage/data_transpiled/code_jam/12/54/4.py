def import _solve
class D ( object ) :
    def __init__ ( self ) :
        sc = _solve
        map = { }
    class Solver ( object ) :
        def __init__ ( self ) :
            self.k = 0
            self.used = [ False ] * 34
        def solve ( self ) :
            self.k = sc.next ( )
            S = sc.next ( )
            for i in S [ : - 1 ] :
                v1 = i - 'a'
                v2 = i + 1 - 'a'
                self.used [ v1 ] [ v2 ] = True
                if self.map [ v1 ] :
                    self.used [ self.map [ v1 ] ] [ v2 ] = True
                if self.map [ v2 ] :
                    self.used [ v1 ] [ self.map [ v2 ] ] = True
                if self.map [ v1 ] and self.map [ v2 ] :
                    self.used [ v1 ] [ self.map [ v2 ] ] = True
        pre = [ ]
        suf = [ ]
        ans = 0
        for i in range ( len ( self.used ) ) :
            for j in range ( len ( self.used ) ) :
                if not self.used [ i ] [ j ] :
                    continue
                pre += [ i ]
                suf += [ j ]
                ans += 2
        sub = 0
        for i in range ( len ( self.used ) ) :
            sub += min ( pre [ i ] , suf [ i ] )
        return sub , ans / 2 + 1 , ans - sub
    def main ( self ) :
        map [ 'o' - 'a' ] = 26
        map [ 'i' - 'a' ] = 27
        map [ 'e' - 'a' ] = 28
        map [ 'a' - 'a' ] = 29
        map [ 's' - 'a' ] = 30
        map [ 't' - 'a' ] = 31
        map [ 'b' - 'a' ] = 32
        map [ 'g' - 'a' ] = 33
        T = len ( self.used )
        for i in range ( 1 , T + 1 ) :
            print ( "Case #%d: " % i , end = ''